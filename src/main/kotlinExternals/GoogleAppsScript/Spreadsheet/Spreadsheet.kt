package GoogleAppsScript.Spreadsheet

import GoogleAppsScript.Base.Blob
import GoogleAppsScript.Base.BlobSource
import GoogleAppsScript.Base.ColorType
import GoogleAppsScript.Base.Date
import GoogleAppsScript.Base.RgbColor
import GoogleAppsScript.Base.Ui
import GoogleAppsScript.Base.User
import GoogleAppsScript.Charts.ChartHiddenDimensionStrategy
import GoogleAppsScript.Charts.ChartMergeStrategy
import GoogleAppsScript.Charts.ChartOptions
import GoogleAppsScript.Charts.ChartType
import GoogleAppsScript.Charts.CurveStyle
import GoogleAppsScript.Charts.DataTable
import GoogleAppsScript.Charts.PointStyle
import GoogleAppsScript.Charts.Position
import GoogleAppsScript.Drive.File
import GoogleAppsScript.HTML.HtmlOutput
import GoogleAppsScript.Integer


external enum class AutoFillSeries {
    DEFAULT_SERIES,
    ALTERNATE_SERIES
}

external interface Banding {
    fun copyTo(range: Range): Banding
    fun getFirstColumnColor(): String?
    fun getFirstRowColor(): String?
    fun getFooterColumnColor(): String?
    fun getFooterRowColor(): String?
    fun getHeaderColumnColor(): String?
    fun getHeaderRowColor(): String?
    fun getRange(): Range
    fun getSecondColumnColor(): String?
    fun getSecondRowColor(): String?
    fun remove()
    fun setFirstColumnColor(color: String?): Banding
    fun setFirstRowColor(color: String?): Banding
    fun setFooterColumnColor(color: String?): Banding
    fun setFooterRowColor(color: String?): Banding
    fun setHeaderColumnColor(color: String?): Banding
    fun setHeaderRowColor(color: String?): Banding
    fun setRange(range: Range): Banding
    fun setSecondColumnColor(color: String?): Banding
    fun setSecondRowColor(color: String?): Banding
}

external enum class BandingTheme {
    LIGHT_GREY,
    CYAN,
    GREEN,
    YELLOW,
    ORANGE,
    BLUE,
    TEAL,
    GREY,
    BROWN,
    LIGHT_GREEN,
    INDIGO,
    PINK
}

external interface BigQueryDataSourceSpec {
    fun copy(): DataSourceSpecBuilder
    fun getParameters(): Array<DataSourceParameter>
    fun getProjectId(): String
    fun getRawQuery(): String
    fun getType(): DataSourceType
}

external interface BigQueryDataSourceSpecBuilder {
    fun build(): DataSourceSpec
    fun copy(): DataSourceSpecBuilder
    fun getParameters(): Array<DataSourceParameter>
    fun getProjectId(): String
    fun getRawQuery(): String
    fun getType(): DataSourceType
    fun removeAllParameters(): BigQueryDataSourceSpecBuilder
    fun removeParameter(parameterName: String): BigQueryDataSourceSpecBuilder
    fun setParameterFromCell(parameterName: String, sourceCell: String): BigQueryDataSourceSpecBuilder
    fun setProjectId(projectId: String): BigQueryDataSourceSpecBuilder
    fun setRawQuery(rawQuery: String): BigQueryDataSourceSpecBuilder
}

external interface BooleanCondition {
    fun getBackground(): String?
    fun getBold(): Boolean?
    fun getCriteriaType(): BooleanCriteria
    fun getCriteriaValues(): Array<Any>
    fun getFontColor(): String?
    fun getItalic(): Boolean?
    fun getStrikethrough(): Boolean?
    fun getUnderline(): Boolean?
}

external enum class BooleanCriteria {
    CELL_EMPTY,
    CELL_NOT_EMPTY,
    DATE_AFTER,
    DATE_BEFORE,
    DATE_EQUAL_TO,
    DATE_AFTER_RELATIVE,
    DATE_BEFORE_RELATIVE,
    DATE_EQUAL_TO_RELATIVE,
    NUMBER_BETWEEN,
    NUMBER_EQUAL_TO,
    NUMBER_GREATER_THAN,
    NUMBER_GREATER_THAN_OR_EQUAL_TO,
    NUMBER_LESS_THAN,
    NUMBER_LESS_THAN_OR_EQUAL_TO,
    NUMBER_NOT_BETWEEN,
    NUMBER_NOT_EQUAL_TO,
    TEXT_CONTAINS,
    TEXT_DOES_NOT_CONTAIN,
    TEXT_EQUAL_TO,
    TEXT_STARTS_WITH,
    TEXT_ENDS_WITH,
    CUSTOM_FORMULA
}

external enum class BorderStyle {
    DOTTED,
    DASHED,
    SOLID,
    SOLID_MEDIUM,
    SOLID_THICK,
    DOUBLE
}

external interface Color {
    fun asRgbColor(): RgbColor
    fun asThemeColor(): ThemeColor
    fun getColorType(): ColorType
}

external interface ColorBuilder {
    fun asRgbColor(): RgbColor
    fun asThemeColor(): ThemeColor
    fun build(): Color
    fun getColorType(): ColorType
    fun setRgbColor(cssString: String): ColorBuilder
    fun setThemeColor(themeColorType: ThemeColorType): ColorBuilder
}

external interface ConditionalFormatRule {
    fun copy(): ConditionalFormatRuleBuilder
    fun getBooleanCondition(): BooleanCondition?
    fun getGradientCondition(): GradientCondition?
    fun getRanges(): Array<Range>
}

external interface ConditionalFormatRuleBuilder {
    fun build(): ConditionalFormatRule
    fun copy(): ConditionalFormatRuleBuilder
    fun getBooleanCondition(): BooleanCondition?
    fun getGradientCondition(): GradientCondition?
    fun getRanges(): Array<Range>
    fun setBackground(color: String?): ConditionalFormatRuleBuilder
    fun setBold(bold: Boolean?): ConditionalFormatRuleBuilder
    fun setFontColor(color: String?): ConditionalFormatRuleBuilder
    fun setGradientMaxpoint(color: String): ConditionalFormatRuleBuilder
    fun setGradientMaxpointWithValue(color: String, type: InterpolationType, value: String): ConditionalFormatRuleBuilder
    fun setGradientMidpointWithValue(color: String, type: InterpolationType, value: String): ConditionalFormatRuleBuilder
    fun setGradientMinpoint(color: String): ConditionalFormatRuleBuilder
    fun setGradientMinpointWithValue(color: String, type: InterpolationType, value: String): ConditionalFormatRuleBuilder
    fun setItalic(italic: Boolean?): ConditionalFormatRuleBuilder
    fun setRanges(ranges: Array<Range>): ConditionalFormatRuleBuilder
    fun setStrikethrough(strikethrough: Boolean?): ConditionalFormatRuleBuilder
    fun setUnderline(underline: Boolean?): ConditionalFormatRuleBuilder
    fun whenCellEmpty(): ConditionalFormatRuleBuilder
    fun whenCellNotEmpty(): ConditionalFormatRuleBuilder
    fun whenDateAfter(date: Date): ConditionalFormatRuleBuilder
    fun whenDateAfter(date: RelativeDate): ConditionalFormatRuleBuilder
    fun whenDateBefore(date: Date): ConditionalFormatRuleBuilder
    fun whenDateBefore(date: RelativeDate): ConditionalFormatRuleBuilder
    fun whenDateEqualTo(date: Date): ConditionalFormatRuleBuilder
    fun whenDateEqualTo(date: RelativeDate): ConditionalFormatRuleBuilder
    fun whenFormulaSatisfied(formula: String): ConditionalFormatRuleBuilder
    fun whenNumberBetween(start: Number, end: Number): ConditionalFormatRuleBuilder
    fun whenNumberEqualTo(number: Number): ConditionalFormatRuleBuilder
    fun whenNumberGreaterThan(number: Number): ConditionalFormatRuleBuilder
    fun whenNumberGreaterThanOrEqualTo(number: Number): ConditionalFormatRuleBuilder
    fun whenNumberLessThan(number: Number): ConditionalFormatRuleBuilder
    fun whenNumberLessThanOrEqualTo(number: Number): ConditionalFormatRuleBuilder
    fun whenNumberNotBetween(start: Number, end: Number): ConditionalFormatRuleBuilder
    fun whenNumberNotEqualTo(number: Number): ConditionalFormatRuleBuilder
    fun whenTextContains(text: String): ConditionalFormatRuleBuilder
    fun whenTextDoesNotContain(text: String): ConditionalFormatRuleBuilder
    fun whenTextEndsWith(text: String): ConditionalFormatRuleBuilder
    fun whenTextEqualTo(text: String): ConditionalFormatRuleBuilder
    fun whenTextStartsWith(text: String): ConditionalFormatRuleBuilder
    fun withCriteria(criteria: BooleanCriteria, args: Array<Any>): ConditionalFormatRuleBuilder
}

external interface ContainerInfo {
    fun getAnchorColumn(): Integer
    fun getAnchorRow(): Integer
    fun getOffsetX(): Integer
    fun getOffsetY(): Integer
}

external enum class CopyPasteType {
    PASTE_NORMAL,
    PASTE_NO_BORDERS,
    PASTE_FORMAT,
    PASTE_FORMULA,
    PASTE_DATA_VALIDATION,
    PASTE_VALUES,
    PASTE_CONDITIONAL_FORMATTING,
    PASTE_COLUMN_WIDTHS
}

external enum class DataExecutionErrorCode {
    DATA_EXECUTION_ERROR_CODE_UNSUPPORTED,
    NONE,
    TIME_OUT,
    TOO_MANY_ROWS,
    TOO_MANY_CELLS,
    ENGINE,
    PARAMETER_INVALID,
    UNSUPPORTED_DATA_TYPE,
    DUPLICATE_COLUMN_NAMES,
    INTERRUPTED,
    OTHER,
    TOO_MANY_CHARS_PER_CELL
}

external enum class DataExecutionState {
    DATA_EXECUTION_STATE_UNSUPPORTED,
    RUNNING,
    SUCCESS,
    ERROR,
    NOT_STARTED
}

external interface DataExecutionStatus {
    fun getErrorCode(): DataExecutionErrorCode
    fun getErrorMessage(): String
    fun getExecutionState(): DataExecutionState
    fun getLastRefreshedTime(): Date?
    fun isTruncated(): Boolean
}

external interface DataSource {
    fun getSpec(): DataSourceSpec
    fun updateSpec(spec: DataSourceSpec): DataSource
}

external interface DataSourceParameter {
    fun getName(): String
    fun getSourceCell(): String?
    fun getType(): DataSourceParameterType
}

external enum class DataSourceParameterType {
    DATA_SOURCE_PARAMETER_TYPE_UNSUPPORTED,
    CELL
}

external interface DataSourceSpec {
    fun asBigQuery(): BigQueryDataSourceSpec
    fun copy(): DataSourceSpecBuilder
    fun getParameters(): Array<DataSourceParameter>
    fun getType(): DataSourceType
}

external interface DataSourceSpecBuilder {
    fun asBigQuery(): BigQueryDataSourceSpecBuilder
    fun build(): DataSourceSpec
    fun copy(): DataSourceSpecBuilder
    fun getParameters(): Array<DataSourceParameter>
    fun getType(): DataSourceType
    fun removeAllParameters(): DataSourceSpecBuilder
    fun removeParameter(parameterName: String): DataSourceSpecBuilder
    fun setParameterFromCell(parameterName: String, sourceCell: String): DataSourceSpecBuilder
}

external interface DataSourceTable {
    fun forceRefreshData(): DataSourceTable
    fun getDataSource(): DataSource
    fun getRange(): Range
    fun getStatus(): DataExecutionStatus
    fun refreshData(): DataSourceTable
    fun waitForCompletion(timeoutInSeconds: Integer): DataExecutionStatus
}

external enum class DataSourceType {
    DATA_SOURCE_TYPE_UNSUPPORTED,
    BIGQUERY
}

external interface DataValidation {
    fun copy(): DataValidationBuilder
    fun getAllowInvalid(): Boolean
    fun getCriteriaType(): DataValidationCriteria
    fun getCriteriaValues(): Array<Any>
    fun getHelpText(): String
}

external interface DataValidationBuilder {
    fun build(): DataValidation
    fun copy(): DataValidationBuilder
    fun getAllowInvalid(): Boolean
    fun getCriteriaType(): DataValidationCriteria
    fun getCriteriaValues(): Array<Any>
    fun getHelpText(): String?
    fun requireCheckbox(): DataValidationBuilder
    fun requireCheckbox(checkedValue: Any): DataValidationBuilder
    fun requireCheckbox(checkedValue: Any, uncheckedValue: Any): DataValidationBuilder
    fun requireDate(): DataValidationBuilder
    fun requireDateAfter(date: Date): DataValidationBuilder
    fun requireDateBefore(date: Date): DataValidationBuilder
    fun requireDateBetween(start: Date, end: Date): DataValidationBuilder
    fun requireDateEqualTo(date: Date): DataValidationBuilder
    fun requireDateNotBetween(start: Date, end: Date): DataValidationBuilder
    fun requireDateOnOrAfter(date: Date): DataValidationBuilder
    fun requireDateOnOrBefore(date: Date): DataValidationBuilder
    fun requireFormulaSatisfied(formula: String): DataValidationBuilder
    fun requireNumberBetween(start: Number, end: Number): DataValidationBuilder
    fun requireNumberEqualTo(number: Number): DataValidationBuilder
    fun requireNumberGreaterThan(number: Number): DataValidationBuilder
    fun requireNumberGreaterThanOrEqualTo(number: Number): DataValidationBuilder
    fun requireNumberLessThan(number: Number): DataValidationBuilder
    fun requireNumberLessThanOrEqualTo(number: Number): DataValidationBuilder
    fun requireNumberNotBetween(start: Number, end: Number): DataValidationBuilder
    fun requireNumberNotEqualTo(number: Number): DataValidationBuilder
    fun requireTextContains(text: String): DataValidationBuilder
    fun requireTextDoesNotContain(text: String): DataValidationBuilder
    fun requireTextEqualTo(text: String): DataValidationBuilder
    fun requireTextIsEmail(): DataValidationBuilder
    fun requireTextIsUrl(): DataValidationBuilder
    fun requireValueInList(values: Array<String>): DataValidationBuilder
    fun requireValueInList(values: Array<String>, showDropdown: Boolean): DataValidationBuilder
    fun requireValueInRange(range: Range): DataValidationBuilder
    fun requireValueInRange(range: Range, showDropdown: Boolean): DataValidationBuilder
    fun setAllowInvalid(allowInvalidData: Boolean): DataValidationBuilder
    fun setHelpText(helpText: String): DataValidationBuilder
    fun withCriteria(criteria: DataValidationCriteria, args: Array<Any>): DataValidationBuilder
}

external enum class DataValidationCriteria {
    DATE_AFTER,
    DATE_BEFORE,
    DATE_BETWEEN,
    DATE_EQUAL_TO,
    DATE_IS_VALID_DATE,
    DATE_NOT_BETWEEN,
    DATE_ON_OR_AFTER,
    DATE_ON_OR_BEFORE,
    NUMBER_BETWEEN,
    NUMBER_EQUAL_TO,
    NUMBER_GREATER_THAN,
    NUMBER_GREATER_THAN_OR_EQUAL_TO,
    NUMBER_LESS_THAN,
    NUMBER_LESS_THAN_OR_EQUAL_TO,
    NUMBER_NOT_BETWEEN,
    NUMBER_NOT_EQUAL_TO,
    TEXT_CONTAINS,
    TEXT_DOES_NOT_CONTAIN,
    TEXT_EQUAL_TO,
    TEXT_IS_VALID_EMAIL,
    TEXT_IS_VALID_URL,
    VALUE_IN_LIST,
    VALUE_IN_RANGE,
    CUSTOM_FORMULA,
    CHECKBOX
}

external interface DeveloperMetadata {
    fun getId(): Integer
    fun getKey(): String
    fun getLocation(): DeveloperMetadataLocation
    fun getValue(): String?
    fun getVisibility(): DeveloperMetadataVisibility
    fun moveToColumn(column: Range): DeveloperMetadata
    fun moveToRow(row: Range): DeveloperMetadata
    fun moveToSheet(sheet: Sheet): DeveloperMetadata
    fun moveToSpreadsheet(): DeveloperMetadata
    fun remove()
    fun setKey(key: String): DeveloperMetadata
    fun setValue(value: String): DeveloperMetadata
    fun setVisibility(visibility: DeveloperMetadataVisibility): DeveloperMetadata
}

external interface DeveloperMetadataFinder {
    fun find(): Array<DeveloperMetadata>
    fun onIntersectingLocations(): DeveloperMetadataFinder
    fun withId(id: Integer): DeveloperMetadataFinder
    fun withKey(key: String): DeveloperMetadataFinder
    fun withLocationType(locationType: DeveloperMetadataLocationType): DeveloperMetadataFinder
    fun withValue(value: String): DeveloperMetadataFinder
    fun withVisibility(visibility: DeveloperMetadataVisibility): DeveloperMetadataFinder
}

external interface DeveloperMetadataLocation {
    fun getColumn(): Range?
    fun getLocationType(): DeveloperMetadataLocationType
    fun getRow(): Range?
    fun getSheet(): Sheet?
    fun getSpreadsheet(): Spreadsheet?
}

external enum class DeveloperMetadataLocationType {
    SPREADSHEET,
    SHEET,
    ROW,
    COLUMN
}

external enum class DeveloperMetadataVisibility {
    DOCUMENT,
    PROJECT
}

external enum class Dimension {
    COLUMNS,
    ROWS
}

external enum class Direction {
    UP,
    DOWN,
    PREVIOUS,
    NEXT
}

external interface EmbeddedAreaChartBuilder {
    fun addRange(range: Range): EmbeddedChartBuilder
    fun asAreaChart(): EmbeddedAreaChartBuilder
    fun asBarChart(): EmbeddedBarChartBuilder
    fun asColumnChart(): EmbeddedColumnChartBuilder
    fun asComboChart(): EmbeddedComboChartBuilder
    fun asHistogramChart(): EmbeddedHistogramChartBuilder
    fun asLineChart(): EmbeddedLineChartBuilder
    fun asPieChart(): EmbeddedPieChartBuilder
    fun asScatterChart(): EmbeddedScatterChartBuilder
    fun asTableChart(): EmbeddedTableChartBuilder
    fun build(): EmbeddedChart
    fun clearRanges(): EmbeddedChartBuilder
    fun getChartType(): ChartType
    fun getContainer(): ContainerInfo
    fun getRanges(): Array<Range>
    fun removeRange(range: Range): EmbeddedChartBuilder
    fun reverseCategories(): EmbeddedAreaChartBuilder
    fun setBackgroundColor(cssValue: String): EmbeddedAreaChartBuilder
    fun setChartType(type: ChartType): EmbeddedChartBuilder
    fun setColors(cssValues: Array<String>): EmbeddedAreaChartBuilder
    fun setHiddenDimensionStrategy(strategy: ChartHiddenDimensionStrategy): EmbeddedChartBuilder
    fun setLegendPosition(position: Position): EmbeddedAreaChartBuilder
    fun setLegendTextStyle(textStyle: GoogleAppsScript.Charts.TextStyle): EmbeddedAreaChartBuilder
    fun setMergeStrategy(mergeStrategy: ChartMergeStrategy): EmbeddedChartBuilder
    fun setNumHeaders(headers: Integer): EmbeddedChartBuilder
    fun setOption(option: String, value: Any): EmbeddedChartBuilder
    fun setPointStyle(style: PointStyle): EmbeddedAreaChartBuilder
    fun setPosition(anchorRowPos: Integer, anchorColPos: Integer, offsetX: Integer, offsetY: Integer): EmbeddedChartBuilder
    fun setRange(start: Number, end: Number): EmbeddedAreaChartBuilder
    fun setStacked(): EmbeddedAreaChartBuilder
    fun setTitle(chartTitle: String): EmbeddedAreaChartBuilder
    fun setTitleTextStyle(textStyle: GoogleAppsScript.Charts.TextStyle): EmbeddedAreaChartBuilder
    fun setTransposeRowsAndColumns(transpose: Boolean): EmbeddedChartBuilder
    fun setXAxisTextStyle(textStyle: GoogleAppsScript.Charts.TextStyle): EmbeddedAreaChartBuilder
    fun setXAxisTitle(title: String): EmbeddedAreaChartBuilder
    fun setXAxisTitleTextStyle(textStyle: GoogleAppsScript.Charts.TextStyle): EmbeddedAreaChartBuilder
    fun setYAxisTextStyle(textStyle: GoogleAppsScript.Charts.TextStyle): EmbeddedAreaChartBuilder
    fun setYAxisTitle(title: String): EmbeddedAreaChartBuilder
    fun setYAxisTitleTextStyle(textStyle: GoogleAppsScript.Charts.TextStyle): EmbeddedAreaChartBuilder
    fun useLogScale(): EmbeddedAreaChartBuilder
}

external interface EmbeddedBarChartBuilder {
    fun addRange(range: Range): EmbeddedChartBuilder
    fun asAreaChart(): EmbeddedAreaChartBuilder
    fun asBarChart(): EmbeddedBarChartBuilder
    fun asColumnChart(): EmbeddedColumnChartBuilder
    fun asComboChart(): EmbeddedComboChartBuilder
    fun asHistogramChart(): EmbeddedHistogramChartBuilder
    fun asLineChart(): EmbeddedLineChartBuilder
    fun asPieChart(): EmbeddedPieChartBuilder
    fun asScatterChart(): EmbeddedScatterChartBuilder
    fun asTableChart(): EmbeddedTableChartBuilder
    fun build(): EmbeddedChart
    fun clearRanges(): EmbeddedChartBuilder
    fun getChartType(): ChartType
    fun getContainer(): ContainerInfo
    fun getRanges(): Array<Range>
    fun removeRange(range: Range): EmbeddedChartBuilder
    fun reverseCategories(): EmbeddedBarChartBuilder
    fun reverseDirection(): EmbeddedBarChartBuilder
    fun setBackgroundColor(cssValue: String): EmbeddedBarChartBuilder
    fun setChartType(type: ChartType): EmbeddedChartBuilder
    fun setColors(cssValues: Array<String>): EmbeddedBarChartBuilder
    fun setHiddenDimensionStrategy(strategy: ChartHiddenDimensionStrategy): EmbeddedChartBuilder
    fun setLegendPosition(position: Position): EmbeddedBarChartBuilder
    fun setLegendTextStyle(textStyle: GoogleAppsScript.Charts.TextStyle): EmbeddedBarChartBuilder
    fun setMergeStrategy(mergeStrategy: ChartMergeStrategy): EmbeddedChartBuilder
    fun setNumHeaders(headers: Integer): EmbeddedChartBuilder
    fun setOption(option: String, value: Any): EmbeddedChartBuilder
    fun setPosition(anchorRowPos: Integer, anchorColPos: Integer, offsetX: Integer, offsetY: Integer): EmbeddedChartBuilder
    fun setRange(start: Number, end: Number): EmbeddedBarChartBuilder
    fun setStacked(): EmbeddedBarChartBuilder
    fun setTitle(chartTitle: String): EmbeddedBarChartBuilder
    fun setTitleTextStyle(textStyle: GoogleAppsScript.Charts.TextStyle): EmbeddedBarChartBuilder
    fun setTransposeRowsAndColumns(transpose: Boolean): EmbeddedChartBuilder
    fun setXAxisTextStyle(textStyle: GoogleAppsScript.Charts.TextStyle): EmbeddedBarChartBuilder
    fun setXAxisTitle(title: String): EmbeddedBarChartBuilder
    fun setXAxisTitleTextStyle(textStyle: GoogleAppsScript.Charts.TextStyle): EmbeddedBarChartBuilder
    fun setYAxisTextStyle(textStyle: GoogleAppsScript.Charts.TextStyle): EmbeddedBarChartBuilder
    fun setYAxisTitle(title: String): EmbeddedBarChartBuilder
    fun setYAxisTitleTextStyle(textStyle: GoogleAppsScript.Charts.TextStyle): EmbeddedBarChartBuilder
    fun useLogScale(): EmbeddedBarChartBuilder
}

external interface EmbeddedChart {
    fun getAs(contentType: String): Blob
    fun getBlob(): Blob
    fun getChartId(): Integer?
    fun getContainerInfo(): ContainerInfo
    fun getHiddenDimensionStrategy(): ChartHiddenDimensionStrategy
    fun getMergeStrategy(): ChartMergeStrategy
    fun getNumHeaders(): Integer
    fun getOptions(): ChartOptions
    fun getRanges(): Array<Range>
    fun getTransposeRowsAndColumns(): Boolean
    fun modify(): EmbeddedChartBuilder
}

external interface EmbeddedChartBuilder {
    fun addRange(range: Range): EmbeddedChartBuilder
    fun asAreaChart(): EmbeddedAreaChartBuilder
    fun asBarChart(): EmbeddedBarChartBuilder
    fun asColumnChart(): EmbeddedColumnChartBuilder
    fun asComboChart(): EmbeddedComboChartBuilder
    fun asHistogramChart(): EmbeddedHistogramChartBuilder
    fun asLineChart(): EmbeddedLineChartBuilder
    fun asPieChart(): EmbeddedPieChartBuilder
    fun asScatterChart(): EmbeddedScatterChartBuilder
    fun asTableChart(): EmbeddedTableChartBuilder
    fun build(): EmbeddedChart
    fun clearRanges(): EmbeddedChartBuilder
    fun getChartType(): ChartType
    fun getContainer(): ContainerInfo
    fun getRanges(): Array<Range>
    fun removeRange(range: Range): EmbeddedChartBuilder
    fun setChartType(type: ChartType): EmbeddedChartBuilder
    fun setHiddenDimensionStrategy(strategy: ChartHiddenDimensionStrategy): EmbeddedChartBuilder
    fun setMergeStrategy(mergeStrategy: ChartMergeStrategy): EmbeddedChartBuilder
    fun setNumHeaders(headers: Integer): EmbeddedChartBuilder
    fun setOption(option: String, value: Any): EmbeddedChartBuilder
    fun setPosition(anchorRowPos: Integer, anchorColPos: Integer, offsetX: Integer, offsetY: Integer): EmbeddedChartBuilder
    fun setTransposeRowsAndColumns(transpose: Boolean): EmbeddedChartBuilder
}

external interface EmbeddedColumnChartBuilder {
    fun addRange(range: Range): EmbeddedChartBuilder
    fun asAreaChart(): EmbeddedAreaChartBuilder
    fun asBarChart(): EmbeddedBarChartBuilder
    fun asColumnChart(): EmbeddedColumnChartBuilder
    fun asComboChart(): EmbeddedComboChartBuilder
    fun asHistogramChart(): EmbeddedHistogramChartBuilder
    fun asLineChart(): EmbeddedLineChartBuilder
    fun asPieChart(): EmbeddedPieChartBuilder
    fun asScatterChart(): EmbeddedScatterChartBuilder
    fun asTableChart(): EmbeddedTableChartBuilder
    fun build(): EmbeddedChart
    fun clearRanges(): EmbeddedChartBuilder
    fun getChartType(): ChartType
    fun getContainer(): ContainerInfo
    fun getRanges(): Array<Range>
    fun removeRange(range: Range): EmbeddedChartBuilder
    fun reverseCategories(): EmbeddedColumnChartBuilder
    fun setBackgroundColor(cssValue: String): EmbeddedColumnChartBuilder
    fun setChartType(type: ChartType): EmbeddedChartBuilder
    fun setColors(cssValues: Array<String>): EmbeddedColumnChartBuilder
    fun setHiddenDimensionStrategy(strategy: ChartHiddenDimensionStrategy): EmbeddedChartBuilder
    fun setLegendPosition(position: Position): EmbeddedColumnChartBuilder
    fun setLegendTextStyle(textStyle: GoogleAppsScript.Charts.TextStyle): EmbeddedColumnChartBuilder
    fun setMergeStrategy(mergeStrategy: ChartMergeStrategy): EmbeddedChartBuilder
    fun setNumHeaders(headers: Integer): EmbeddedChartBuilder
    fun setOption(option: String, value: Any): EmbeddedChartBuilder
    fun setPosition(anchorRowPos: Integer, anchorColPos: Integer, offsetX: Integer, offsetY: Integer): EmbeddedChartBuilder
    fun setRange(start: Number, end: Number): EmbeddedColumnChartBuilder
    fun setStacked(): EmbeddedColumnChartBuilder
    fun setTitle(chartTitle: String): EmbeddedColumnChartBuilder
    fun setTitleTextStyle(textStyle: GoogleAppsScript.Charts.TextStyle): EmbeddedColumnChartBuilder
    fun setTransposeRowsAndColumns(transpose: Boolean): EmbeddedChartBuilder
    fun setXAxisTextStyle(textStyle: GoogleAppsScript.Charts.TextStyle): EmbeddedColumnChartBuilder
    fun setXAxisTitle(title: String): EmbeddedColumnChartBuilder
    fun setXAxisTitleTextStyle(textStyle: GoogleAppsScript.Charts.TextStyle): EmbeddedColumnChartBuilder
    fun setYAxisTextStyle(textStyle: GoogleAppsScript.Charts.TextStyle): EmbeddedColumnChartBuilder
    fun setYAxisTitle(title: String): EmbeddedColumnChartBuilder
    fun setYAxisTitleTextStyle(textStyle: GoogleAppsScript.Charts.TextStyle): EmbeddedColumnChartBuilder
    fun useLogScale(): EmbeddedColumnChartBuilder
}

external interface EmbeddedComboChartBuilder {
    fun addRange(range: Range): EmbeddedChartBuilder
    fun asAreaChart(): EmbeddedAreaChartBuilder
    fun asBarChart(): EmbeddedBarChartBuilder
    fun asColumnChart(): EmbeddedColumnChartBuilder
    fun asComboChart(): EmbeddedComboChartBuilder
    fun asHistogramChart(): EmbeddedHistogramChartBuilder
    fun asLineChart(): EmbeddedLineChartBuilder
    fun asPieChart(): EmbeddedPieChartBuilder
    fun asScatterChart(): EmbeddedScatterChartBuilder
    fun asTableChart(): EmbeddedTableChartBuilder
    fun build(): EmbeddedChart
    fun clearRanges(): EmbeddedChartBuilder
    fun getChartType(): ChartType
    fun getContainer(): ContainerInfo
    fun getRanges(): Array<Range>
    fun removeRange(range: Range): EmbeddedChartBuilder
    fun reverseCategories(): EmbeddedComboChartBuilder
    fun setBackgroundColor(cssValue: String): EmbeddedComboChartBuilder
    fun setChartType(type: ChartType): EmbeddedChartBuilder
    fun setColors(cssValues: Array<String>): EmbeddedComboChartBuilder
    fun setHiddenDimensionStrategy(strategy: ChartHiddenDimensionStrategy): EmbeddedChartBuilder
    fun setLegendPosition(position: Position): EmbeddedComboChartBuilder
    fun setLegendTextStyle(textStyle: GoogleAppsScript.Charts.TextStyle): EmbeddedComboChartBuilder
    fun setMergeStrategy(mergeStrategy: ChartMergeStrategy): EmbeddedChartBuilder
    fun setNumHeaders(headers: Integer): EmbeddedChartBuilder
    fun setOption(option: String, value: Any): EmbeddedChartBuilder
    fun setPosition(anchorRowPos: Integer, anchorColPos: Integer, offsetX: Integer, offsetY: Integer): EmbeddedChartBuilder
    fun setRange(start: Number, end: Number): EmbeddedComboChartBuilder
    fun setStacked(): EmbeddedComboChartBuilder
    fun setTitle(chartTitle: String): EmbeddedComboChartBuilder
    fun setTitleTextStyle(textStyle: GoogleAppsScript.Charts.TextStyle): EmbeddedComboChartBuilder
    fun setTransposeRowsAndColumns(transpose: Boolean): EmbeddedChartBuilder
    fun setXAxisTextStyle(textStyle: GoogleAppsScript.Charts.TextStyle): EmbeddedComboChartBuilder
    fun setXAxisTitle(title: String): EmbeddedComboChartBuilder
    fun setXAxisTitleTextStyle(textStyle: GoogleAppsScript.Charts.TextStyle): EmbeddedComboChartBuilder
    fun setYAxisTextStyle(textStyle: GoogleAppsScript.Charts.TextStyle): EmbeddedComboChartBuilder
    fun setYAxisTitle(title: String): EmbeddedComboChartBuilder
    fun setYAxisTitleTextStyle(textStyle: GoogleAppsScript.Charts.TextStyle): EmbeddedComboChartBuilder
    fun useLogScale(): EmbeddedComboChartBuilder
}

external interface EmbeddedHistogramChartBuilder {
    fun addRange(range: Range): EmbeddedChartBuilder
    fun asAreaChart(): EmbeddedAreaChartBuilder
    fun asBarChart(): EmbeddedBarChartBuilder
    fun asColumnChart(): EmbeddedColumnChartBuilder
    fun asComboChart(): EmbeddedComboChartBuilder
    fun asHistogramChart(): EmbeddedHistogramChartBuilder
    fun asLineChart(): EmbeddedLineChartBuilder
    fun asPieChart(): EmbeddedPieChartBuilder
    fun asScatterChart(): EmbeddedScatterChartBuilder
    fun asTableChart(): EmbeddedTableChartBuilder
    fun build(): EmbeddedChart
    fun clearRanges(): EmbeddedChartBuilder
    fun getChartType(): ChartType
    fun getContainer(): ContainerInfo
    fun getRanges(): Array<Range>
    fun removeRange(range: Range): EmbeddedChartBuilder
    fun reverseCategories(): EmbeddedHistogramChartBuilder
    fun setBackgroundColor(cssValue: String): EmbeddedHistogramChartBuilder
    fun setChartType(type: ChartType): EmbeddedChartBuilder
    fun setColors(cssValues: Array<String>): EmbeddedHistogramChartBuilder
    fun setHiddenDimensionStrategy(strategy: ChartHiddenDimensionStrategy): EmbeddedChartBuilder
    fun setLegendPosition(position: Position): EmbeddedHistogramChartBuilder
    fun setLegendTextStyle(textStyle: GoogleAppsScript.Charts.TextStyle): EmbeddedHistogramChartBuilder
    fun setMergeStrategy(mergeStrategy: ChartMergeStrategy): EmbeddedChartBuilder
    fun setNumHeaders(headers: Integer): EmbeddedChartBuilder
    fun setOption(option: String, value: Any): EmbeddedChartBuilder
    fun setPosition(anchorRowPos: Integer, anchorColPos: Integer, offsetX: Integer, offsetY: Integer): EmbeddedChartBuilder
    fun setRange(start: Number, end: Number): EmbeddedHistogramChartBuilder
    fun setStacked(): EmbeddedHistogramChartBuilder
    fun setTitle(chartTitle: String): EmbeddedHistogramChartBuilder
    fun setTitleTextStyle(textStyle: GoogleAppsScript.Charts.TextStyle): EmbeddedHistogramChartBuilder
    fun setTransposeRowsAndColumns(transpose: Boolean): EmbeddedChartBuilder
    fun setXAxisTextStyle(textStyle: GoogleAppsScript.Charts.TextStyle): EmbeddedHistogramChartBuilder
    fun setXAxisTitle(title: String): EmbeddedHistogramChartBuilder
    fun setXAxisTitleTextStyle(textStyle: GoogleAppsScript.Charts.TextStyle): EmbeddedHistogramChartBuilder
    fun setYAxisTextStyle(textStyle: GoogleAppsScript.Charts.TextStyle): EmbeddedHistogramChartBuilder
    fun setYAxisTitle(title: String): EmbeddedHistogramChartBuilder
    fun setYAxisTitleTextStyle(textStyle: GoogleAppsScript.Charts.TextStyle): EmbeddedHistogramChartBuilder
    fun useLogScale(): EmbeddedHistogramChartBuilder
}

external interface EmbeddedLineChartBuilder {
    fun addRange(range: Range): EmbeddedChartBuilder
    fun asAreaChart(): EmbeddedAreaChartBuilder
    fun asBarChart(): EmbeddedBarChartBuilder
    fun asColumnChart(): EmbeddedColumnChartBuilder
    fun asComboChart(): EmbeddedComboChartBuilder
    fun asHistogramChart(): EmbeddedHistogramChartBuilder
    fun asLineChart(): EmbeddedLineChartBuilder
    fun asPieChart(): EmbeddedPieChartBuilder
    fun asScatterChart(): EmbeddedScatterChartBuilder
    fun asTableChart(): EmbeddedTableChartBuilder
    fun build(): EmbeddedChart
    fun clearRanges(): EmbeddedChartBuilder
    fun getChartType(): ChartType
    fun getContainer(): ContainerInfo
    fun getRanges(): Array<Range>
    fun removeRange(range: Range): EmbeddedChartBuilder
    fun reverseCategories(): EmbeddedLineChartBuilder
    fun setBackgroundColor(cssValue: String): EmbeddedLineChartBuilder
    fun setChartType(type: ChartType): EmbeddedChartBuilder
    fun setColors(cssValues: Array<String>): EmbeddedLineChartBuilder
    fun setCurveStyle(style: CurveStyle): EmbeddedLineChartBuilder
    fun setHiddenDimensionStrategy(strategy: ChartHiddenDimensionStrategy): EmbeddedChartBuilder
    fun setLegendPosition(position: Position): EmbeddedLineChartBuilder
    fun setLegendTextStyle(textStyle: GoogleAppsScript.Charts.TextStyle): EmbeddedLineChartBuilder
    fun setMergeStrategy(mergeStrategy: ChartMergeStrategy): EmbeddedChartBuilder
    fun setNumHeaders(headers: Integer): EmbeddedChartBuilder
    fun setOption(option: String, value: Any): EmbeddedChartBuilder
    fun setPointStyle(style: PointStyle): EmbeddedLineChartBuilder
    fun setPosition(anchorRowPos: Integer, anchorColPos: Integer, offsetX: Integer, offsetY: Integer): EmbeddedChartBuilder
    fun setRange(start: Number, end: Number): EmbeddedLineChartBuilder
    fun setTitle(chartTitle: String): EmbeddedLineChartBuilder
    fun setTitleTextStyle(textStyle: GoogleAppsScript.Charts.TextStyle): EmbeddedLineChartBuilder
    fun setTransposeRowsAndColumns(transpose: Boolean): EmbeddedChartBuilder
    fun setXAxisTextStyle(textStyle: GoogleAppsScript.Charts.TextStyle): EmbeddedLineChartBuilder
    fun setXAxisTitle(title: String): EmbeddedLineChartBuilder
    fun setXAxisTitleTextStyle(textStyle: GoogleAppsScript.Charts.TextStyle): EmbeddedLineChartBuilder
    fun setYAxisTextStyle(textStyle: GoogleAppsScript.Charts.TextStyle): EmbeddedLineChartBuilder
    fun setYAxisTitle(title: String): EmbeddedLineChartBuilder
    fun setYAxisTitleTextStyle(textStyle: GoogleAppsScript.Charts.TextStyle): EmbeddedLineChartBuilder
    fun useLogScale(): EmbeddedLineChartBuilder
}

external interface EmbeddedPieChartBuilder {
    fun addRange(range: Range): EmbeddedChartBuilder
    fun asAreaChart(): EmbeddedAreaChartBuilder
    fun asBarChart(): EmbeddedBarChartBuilder
    fun asColumnChart(): EmbeddedColumnChartBuilder
    fun asComboChart(): EmbeddedComboChartBuilder
    fun asHistogramChart(): EmbeddedHistogramChartBuilder
    fun asLineChart(): EmbeddedLineChartBuilder
    fun asPieChart(): EmbeddedPieChartBuilder
    fun asScatterChart(): EmbeddedScatterChartBuilder
    fun asTableChart(): EmbeddedTableChartBuilder
    fun build(): EmbeddedChart
    fun clearRanges(): EmbeddedChartBuilder
    fun getChartType(): ChartType
    fun getContainer(): ContainerInfo
    fun getRanges(): Array<Range>
    fun removeRange(range: Range): EmbeddedChartBuilder
    fun reverseCategories(): EmbeddedPieChartBuilder
    fun set3D(): EmbeddedPieChartBuilder
    fun setBackgroundColor(cssValue: String): EmbeddedPieChartBuilder
    fun setChartType(type: ChartType): EmbeddedChartBuilder
    fun setColors(cssValues: Array<String>): EmbeddedPieChartBuilder
    fun setHiddenDimensionStrategy(strategy: ChartHiddenDimensionStrategy): EmbeddedChartBuilder
    fun setLegendPosition(position: Position): EmbeddedPieChartBuilder
    fun setLegendTextStyle(textStyle: GoogleAppsScript.Charts.TextStyle): EmbeddedPieChartBuilder
    fun setMergeStrategy(mergeStrategy: ChartMergeStrategy): EmbeddedChartBuilder
    fun setNumHeaders(headers: Integer): EmbeddedChartBuilder
    fun setOption(option: String, value: Any): EmbeddedChartBuilder
    fun setPosition(anchorRowPos: Integer, anchorColPos: Integer, offsetX: Integer, offsetY: Integer): EmbeddedChartBuilder
    fun setTitle(chartTitle: String): EmbeddedPieChartBuilder
    fun setTitleTextStyle(textStyle: GoogleAppsScript.Charts.TextStyle): EmbeddedPieChartBuilder
    fun setTransposeRowsAndColumns(transpose: Boolean): EmbeddedChartBuilder
}

external interface EmbeddedScatterChartBuilder {
    fun addRange(range: Range): EmbeddedChartBuilder
    fun asAreaChart(): EmbeddedAreaChartBuilder
    fun asBarChart(): EmbeddedBarChartBuilder
    fun asColumnChart(): EmbeddedColumnChartBuilder
    fun asComboChart(): EmbeddedComboChartBuilder
    fun asHistogramChart(): EmbeddedHistogramChartBuilder
    fun asLineChart(): EmbeddedLineChartBuilder
    fun asPieChart(): EmbeddedPieChartBuilder
    fun asScatterChart(): EmbeddedScatterChartBuilder
    fun asTableChart(): EmbeddedTableChartBuilder
    fun build(): EmbeddedChart
    fun clearRanges(): EmbeddedChartBuilder
    fun getChartType(): ChartType
    fun getContainer(): ContainerInfo
    fun getRanges(): Array<Range>
    fun removeRange(range: Range): EmbeddedChartBuilder
    fun setBackgroundColor(cssValue: String): EmbeddedScatterChartBuilder
    fun setChartType(type: ChartType): EmbeddedChartBuilder
    fun setColors(cssValues: Array<String>): EmbeddedScatterChartBuilder
    fun setHiddenDimensionStrategy(strategy: ChartHiddenDimensionStrategy): EmbeddedChartBuilder
    fun setLegendPosition(position: Position): EmbeddedScatterChartBuilder
    fun setLegendTextStyle(textStyle: GoogleAppsScript.Charts.TextStyle): EmbeddedScatterChartBuilder
    fun setMergeStrategy(mergeStrategy: ChartMergeStrategy): EmbeddedChartBuilder
    fun setNumHeaders(headers: Integer): EmbeddedChartBuilder
    fun setOption(option: String, value: Any): EmbeddedChartBuilder
    fun setPointStyle(style: PointStyle): EmbeddedScatterChartBuilder
    fun setPosition(anchorRowPos: Integer, anchorColPos: Integer, offsetX: Integer, offsetY: Integer): EmbeddedChartBuilder
    fun setTitle(chartTitle: String): EmbeddedScatterChartBuilder
    fun setTitleTextStyle(textStyle: GoogleAppsScript.Charts.TextStyle): EmbeddedScatterChartBuilder
    fun setTransposeRowsAndColumns(transpose: Boolean): EmbeddedChartBuilder
    fun setXAxisLogScale(): EmbeddedScatterChartBuilder
    fun setXAxisRange(start: Number, end: Number): EmbeddedScatterChartBuilder
    fun setXAxisTextStyle(textStyle: GoogleAppsScript.Charts.TextStyle): EmbeddedScatterChartBuilder
    fun setXAxisTitle(title: String): EmbeddedScatterChartBuilder
    fun setXAxisTitleTextStyle(textStyle: GoogleAppsScript.Charts.TextStyle): EmbeddedScatterChartBuilder
    fun setYAxisLogScale(): EmbeddedScatterChartBuilder
    fun setYAxisRange(start: Number, end: Number): EmbeddedScatterChartBuilder
    fun setYAxisTextStyle(textStyle: GoogleAppsScript.Charts.TextStyle): EmbeddedScatterChartBuilder
    fun setYAxisTitle(title: String): EmbeddedScatterChartBuilder
    fun setYAxisTitleTextStyle(textStyle: GoogleAppsScript.Charts.TextStyle): EmbeddedScatterChartBuilder
}

external interface EmbeddedTableChartBuilder {
    fun addRange(range: Range): EmbeddedChartBuilder
    fun asAreaChart(): EmbeddedAreaChartBuilder
    fun asBarChart(): EmbeddedBarChartBuilder
    fun asColumnChart(): EmbeddedColumnChartBuilder
    fun asComboChart(): EmbeddedComboChartBuilder
    fun asHistogramChart(): EmbeddedHistogramChartBuilder
    fun asLineChart(): EmbeddedLineChartBuilder
    fun asPieChart(): EmbeddedPieChartBuilder
    fun asScatterChart(): EmbeddedScatterChartBuilder
    fun asTableChart(): EmbeddedTableChartBuilder
    fun build(): EmbeddedChart
    fun clearRanges(): EmbeddedChartBuilder
    fun enablePaging(enablePaging: Boolean): EmbeddedTableChartBuilder
    fun enablePaging(pageSize: Integer): EmbeddedTableChartBuilder
    fun enablePaging(pageSize: Integer, startPage: Integer): EmbeddedTableChartBuilder
    fun enableRtlTable(rtlEnabled: Boolean): EmbeddedTableChartBuilder
    fun enableSorting(enableSorting: Boolean): EmbeddedTableChartBuilder
    fun getChartType(): ChartType
    fun getContainer(): ContainerInfo
    fun getRanges(): Array<Range>
    fun removeRange(range: Range): EmbeddedChartBuilder
    fun setChartType(type: ChartType): EmbeddedChartBuilder
    fun setFirstRowNumber(number: Integer): EmbeddedTableChartBuilder
    fun setHiddenDimensionStrategy(strategy: ChartHiddenDimensionStrategy): EmbeddedChartBuilder
    fun setInitialSortingAscending(column: Integer): EmbeddedTableChartBuilder
    fun setInitialSortingDescending(column: Integer): EmbeddedTableChartBuilder
    fun setMergeStrategy(mergeStrategy: ChartMergeStrategy): EmbeddedChartBuilder
    fun setNumHeaders(headers: Integer): EmbeddedChartBuilder
    fun setOption(option: String, value: Any): EmbeddedChartBuilder
    fun setPosition(anchorRowPos: Integer, anchorColPos: Integer, offsetX: Integer, offsetY: Integer): EmbeddedChartBuilder
    fun setTransposeRowsAndColumns(transpose: Boolean): EmbeddedChartBuilder
    fun showRowNumberColumn(showRowNumber: Boolean): EmbeddedTableChartBuilder
    fun useAlternatingRowStyle(alternate: Boolean): EmbeddedTableChartBuilder
}

external interface Filter {
    fun getColumnFilterCriteria(columnPosition: Integer): FilterCriteria?
    fun getRange(): Range
    fun remove()
    fun removeColumnFilterCriteria(columnPosition: Integer): Filter
    fun setColumnFilterCriteria(columnPosition: Integer, filterCriteria: FilterCriteria?): Filter
    fun sort(columnPosition: Integer, ascending: Boolean): Filter
}

external interface FilterCriteria {
    fun copy(): FilterCriteriaBuilder
    fun getCriteriaType(): BooleanCriteria
    fun getCriteriaValues(): Array<Any>
    fun getHiddenValues(): Array<String>
    fun getVisibleValues(): Array<String>
}

external interface FilterCriteriaBuilder {
    fun build(): FilterCriteria
    fun copy(): FilterCriteriaBuilder
    fun getCriteriaType(): BooleanCriteria
    fun getCriteriaValues(): Array<Any>
    fun getHiddenValues(): Array<String>
    fun getVisibleValues(): Array<String>
    fun setHiddenValues(values: Array<String>): FilterCriteriaBuilder
    fun setVisibleValues(values: Array<String>): FilterCriteriaBuilder
    fun whenCellEmpty(): FilterCriteriaBuilder
    fun whenCellNotEmpty(): FilterCriteriaBuilder
    fun whenDateAfter(date: Date): FilterCriteriaBuilder
    fun whenDateAfter(date: RelativeDate): FilterCriteriaBuilder
    fun whenDateBefore(date: Date): FilterCriteriaBuilder
    fun whenDateBefore(date: RelativeDate): FilterCriteriaBuilder
    fun whenDateEqualTo(date: Date): FilterCriteriaBuilder
    fun whenDateEqualTo(date: RelativeDate): FilterCriteriaBuilder
    fun whenFormulaSatisfied(formula: String): FilterCriteriaBuilder
    fun whenNumberBetween(start: Number, end: Number): FilterCriteriaBuilder
    fun whenNumberEqualTo(number: Number): FilterCriteriaBuilder
    fun whenNumberGreaterThan(number: Number): FilterCriteriaBuilder
    fun whenNumberGreaterThanOrEqualTo(number: Number): FilterCriteriaBuilder
    fun whenNumberLessThan(number: Number): FilterCriteriaBuilder
    fun whenNumberLessThanOrEqualTo(number: Number): FilterCriteriaBuilder
    fun whenNumberNotBetween(start: Number, end: Number): FilterCriteriaBuilder
    fun whenNumberNotEqualTo(number: Number): FilterCriteriaBuilder
    fun whenTextContains(text: String): FilterCriteriaBuilder
    fun whenTextDoesNotContain(text: String): FilterCriteriaBuilder
    fun whenTextEndsWith(text: String): FilterCriteriaBuilder
    fun whenTextEqualTo(text: String): FilterCriteriaBuilder
    fun whenTextStartsWith(text: String): FilterCriteriaBuilder
    fun withCriteria(criteria: BooleanCriteria, args: Array<Any>): FilterCriteriaBuilder
}

external interface GradientCondition {
    fun getMaxColor(): String
    fun getMaxType(): InterpolationType?
    fun getMaxValue(): String
    fun getMidColor(): String
    fun getMidType(): InterpolationType?
    fun getMidValue(): String
    fun getMinColor(): String
    fun getMinType(): InterpolationType?
    fun getMinValue(): String
}

external interface Group {
    fun collapse(): Group
    fun expand(): Group
    fun getControlIndex(): Integer
    fun getDepth(): Integer
    fun getRange(): Range
    fun isCollapsed(): Boolean
    fun remove()
}

external enum class GroupControlTogglePosition {
    BEFORE,
    AFTER
}

external enum class InterpolationType {
    NUMBER,
    PERCENT,
    PERCENTILE,
    MIN,
    MAX
}

external interface NamedRange {
    fun getName(): String
    fun getRange(): Range
    fun remove()
    fun setName(name: String): NamedRange
    fun setRange(range: Range): NamedRange
}

external interface OverGridImage {
    fun assignScript(functionName: String): OverGridImage
    fun getAltTextDescription(): String
    fun getAltTextTitle(): String
    fun getAnchorCell(): Range
    fun getAnchorCellXOffset(): Integer
    fun getAnchorCellYOffset(): Integer
    fun getHeight(): Integer
    fun getInherentHeight(): Integer
    fun getInherentWidth(): Integer
    fun getScript(): String
    fun getSheet(): Sheet
    fun getUrl(): String?
    fun getWidth(): Integer
    fun remove()
    fun replace(blob: BlobSource): OverGridImage
    fun replace(url: String): OverGridImage
    fun resetSize(): OverGridImage
    fun setAltTextDescription(description: String): OverGridImage
    fun setAltTextTitle(title: String): OverGridImage
    fun setAnchorCell(cell: Range): OverGridImage
    fun setAnchorCellXOffset(offset: Integer): OverGridImage
    fun setAnchorCellYOffset(offset: Integer): OverGridImage
    fun setHeight(height: Integer): OverGridImage
    fun setWidth(width: Integer): OverGridImage
}

external interface PageProtection {
    fun addUser(email: String)
    fun getUsers(): Array<String>
    fun isProtected(): Boolean
    fun removeUser(user: String)
    fun setProtected(protection: Boolean)
}

external interface PivotFilter {
    fun getFilterCriteria(): FilterCriteria
    fun getPivotTable(): PivotTable
    fun getSourceDataColumn(): Integer
    fun remove()
    fun setFilterCriteria(filterCriteria: FilterCriteria): PivotFilter
}

external interface PivotGroup {
    fun addManualGroupingRule(groupName: String, groupMembers: Array<Any>): PivotGroup
    fun areLabelsRepeated(): Boolean
    fun clearGroupingRule(): PivotGroup
    fun clearSort(): PivotGroup
    fun getDimension(): Dimension
    fun getIndex(): Integer
    fun getPivotTable(): PivotTable
    fun getSourceDataColumn(): Integer
    fun hideRepeatedLabels(): PivotGroup
    fun isSortAscending(): Boolean
    fun moveToIndex(index: Integer): PivotGroup
    fun remove()
    fun removeManualGroupingRule(groupName: String): PivotGroup
    fun resetDisplayName(): PivotGroup
    fun setDisplayName(name: String): PivotGroup
    fun setHistogramGroupingRule(minValue: Integer, maxValue: Integer, intervalSize: Integer): PivotGroup
    fun showRepeatedLabels(): PivotGroup
    fun showTotals(showTotals: Boolean): PivotGroup
    fun sortAscending(): PivotGroup
    fun sortBy(value: PivotValue, oppositeGroupValues: Array<Any>): PivotGroup
    fun sortDescending(): PivotGroup
    fun totalsAreShown(): Boolean
}

external interface PivotTable {
    fun addCalculatedPivotValue(name: String, formula: String): PivotValue
    fun addColumnGroup(sourceDataColumn: Integer): PivotGroup
    fun addFilter(sourceDataColumn: Integer, filterCriteria: FilterCriteria): PivotFilter
    fun addPivotValue(sourceDataColumn: Integer, summarizeFunction: PivotTableSummarizeFunction): PivotValue
    fun addRowGroup(sourceDataColumn: Integer): PivotGroup
    fun getAnchorCell(): Range
    fun getColumnGroups(): Array<PivotGroup>
    fun getFilters(): Array<PivotFilter>
    fun getPivotValues(): Array<PivotValue>
    fun getRowGroups(): Array<PivotGroup>
    fun getValuesDisplayOrientation(): Dimension
    fun remove()
    fun setValuesDisplayOrientation(dimension: Dimension): PivotTable
}

external enum class PivotTableSummarizeFunction {
    CUSTOM,
    SUM,
    COUNTA,
    COUNT,
    COUNTUNIQUE,
    AVERAGE,
    MAX,
    MIN,
    MEDIAN,
    PRODUCT,
    STDEV,
    STDEVP,
    VAR,
    VARP
}

external interface PivotValue {
    fun getDisplayType(): PivotValueDisplayType
    fun getFormula(): String?
    fun getPivotTable(): PivotTable
    fun getSummarizedBy(): PivotTableSummarizeFunction
    fun setDisplayName(name: String): PivotValue
    fun setFormula(formula: String): PivotValue
    fun showAs(displayType: PivotValueDisplayType): PivotValue
    fun summarizeBy(summarizeFunction: PivotTableSummarizeFunction): PivotValue
}

external enum class PivotValueDisplayType {
    DEFAULT,
    PERCENT_OF_ROW_TOTAL,
    PERCENT_OF_COLUMN_TOTAL,
    PERCENT_OF_GRAND_TOTAL
}

external interface Protection {
    fun addEditor(emailAddress: String): Protection
    fun addEditor(user: User): Protection
    fun addEditors(emailAddresses: Array<String>): Protection
    fun canDomainEdit(): Boolean
    fun canEdit(): Boolean
    fun getDescription(): String
    fun getEditors(): Array<User>
    fun getProtectionType(): ProtectionType
    fun getRange(): Range
    fun getRangeName(): String?
    fun getUnprotectedRanges(): Array<Range>
    fun isWarningOnly(): Boolean
    fun remove()
    fun removeEditor(emailAddress: String): Protection
    fun removeEditor(user: User): Protection
    fun removeEditors(emailAddresses: Array<String>): Protection
    fun removeEditors(users: Array<User>): Protection
    fun setDescription(description: String): Protection
    fun setDomainEdit(editable: Boolean): Protection
    fun setNamedRange(namedRange: NamedRange): Protection
    fun setRange(range: Range): Protection
    fun setRangeName(rangeName: String): Protection
    fun setUnprotectedRanges(ranges: Array<Range>): Protection
    fun setWarningOnly(warningOnly: Boolean): Protection
}

external enum class ProtectionType {
    RANGE,
    SHEET
}

external interface `T$0` {
    var commentsOnly: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var contentsOnly: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var formatOnly: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var validationsOnly: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var skipFilteredRows: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$1` {
    var formatOnly: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var contentsOnly: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Range {
    fun activate(): Range
    fun activateAsCurrentCell(): Range
    fun addDeveloperMetadata(key: String): Range
    fun addDeveloperMetadata(key: String, visibility: DeveloperMetadataVisibility): Range
    fun addDeveloperMetadata(key: String, value: String): Range
    fun addDeveloperMetadata(key: String, value: String, visibility: DeveloperMetadataVisibility): Range
    fun applyColumnBanding(): Banding
    fun applyColumnBanding(bandingTheme: BandingTheme): Banding
    fun applyColumnBanding(bandingTheme: BandingTheme, showHeader: Boolean, showFooter: Boolean): Banding
    fun applyRowBanding(): Banding
    fun applyRowBanding(bandingTheme: BandingTheme): Banding
    fun applyRowBanding(bandingTheme: BandingTheme, showHeader: Boolean, showFooter: Boolean): Banding
    fun autoFill(destination: Range, series: AutoFillSeries)
    fun autoFillToNeighbor(series: AutoFillSeries)
    fun breakApart(): Range
    fun canEdit(): Boolean
    fun check(): Range
    fun clear(): Range
    fun clear(options: `T$0`): Range
    fun clearContent(): Range
    fun clearDataValidations(): Range
    fun clearFormat(): Range
    fun clearNote(): Range
    fun collapseGroups(): Range
    fun copyFormatToRange(gridId: Integer, column: Integer, columnEnd: Integer, row: Integer, rowEnd: Integer)
    fun copyFormatToRange(sheet: Sheet, column: Integer, columnEnd: Integer, row: Integer, rowEnd: Integer)
    fun copyTo(destination: Range)
    fun copyTo(destination: Range, copyPasteType: CopyPasteType, transposed: Boolean)
    fun copyTo(destination: Range, options: `T$1`)
    fun copyValuesToRange(gridId: Integer, column: Integer, columnEnd: Integer, row: Integer, rowEnd: Integer)
    fun copyValuesToRange(sheet: Sheet, column: Integer, columnEnd: Integer, row: Integer, rowEnd: Integer)
    fun createDeveloperMetadataFinder(): DeveloperMetadataFinder
    fun createFilter(): Filter
    fun createPivotTable(sourceData: Range): PivotTable
    fun createTextFinder(findText: String): TextFinder
    fun deleteCells(shiftDimension: Dimension)
    fun expandGroups(): Range
    fun getA1Notation(): String
    fun getBackground(): String
    fun getBackgrounds(): Array<Array<String>>
    fun getBandings(): Array<Banding>
    fun getCell(row: Integer, column: Integer): Range
    fun getColumn(): Integer
    fun getDataRegion(): Range
    fun getDataRegion(dimension: Dimension): Range
    fun getDataSourceTables(): Array<DataSourceTable>
    fun getDataSourceUrl(): String
    fun getDataTable(): DataTable
    fun getDataTable(firstRowIsHeader: Boolean): DataTable
    fun getDataValidation(): DataValidation?
    fun getDataValidations(): Array<Array<DataValidation?>>
    fun getDeveloperMetadata(): Array<DeveloperMetadata>
    fun getDisplayValue(): String
    fun getDisplayValues(): Array<Array<String>>
    fun getFilter(): Filter?
    fun getFontColor(): String
    fun getFontColors(): Array<Array<String>>
    fun getFontFamilies(): Array<Array<String>>
    fun getFontFamily(): String
    fun getFontLine(): String /* "none" | "underline" | "line-through" */
    fun getFontLines(): Array<Array<String /* "none" | "underline" | "line-through" */>>
    fun getFontSize(): Integer
    fun getFontSizes(): Array<Array<Integer>>
    fun getFontStyle(): String /* "normal" | "italic" */
    fun getFontStyles(): Array<Array<String /* "normal" | "italic" */>>
    fun getFontWeight(): String /* "normal" | "bold" */
    fun getFontWeights(): Array<Array<String /* "normal" | "bold" */>>
    fun getFormula(): String
    fun getFormulaR1C1(): String?
    fun getFormulas(): Array<Array<String>>
    fun getFormulasR1C1(): Array<Array<String?>>
    fun getGridId(): Integer
    fun getHeight(): Integer
    fun getHorizontalAlignment(): String
    fun getHorizontalAlignments(): Array<Array<String>>
    fun getLastColumn(): Integer
    fun getLastRow(): Integer
    fun getMergedRanges(): Array<Range>
    fun getNextDataCell(direction: Direction): Range
    fun getNote(): String
    fun getNotes(): Array<Array<String>>
    fun getNumColumns(): Integer
    fun getNumRows(): Integer
    fun getNumberFormat(): String
    fun getNumberFormats(): Array<Array<String>>
    fun getRichTextValue(): RichTextValue?
    fun getRichTextValues(): Array<Array<RichTextValue?>>
    fun getRow(): Integer
    fun getRowIndex(): Integer
    fun getSheet(): Sheet
    fun getTextDirection(): TextDirection?
    fun getTextDirections(): Array<Array<TextDirection?>>
    fun getTextRotation(): TextRotation
    fun getTextRotations(): Array<Array<TextRotation>>
    fun getTextStyle(): TextStyle
    fun getTextStyles(): Array<Array<TextStyle>>
    fun getValue(): Any
    fun getValues(): Array<Array<Any>>
    fun getVerticalAlignment(): String
    fun getVerticalAlignments(): Array<Array<String>>
    fun getWidth(): Integer
    fun getWrap(): Boolean
    fun getWrapStrategies(): Array<Array<WrapStrategy>>
    fun getWrapStrategy(): WrapStrategy
    fun getWraps(): Array<Array<Boolean>>
    fun insertCells(shiftDimension: Dimension): Range
    fun insertCheckboxes(): Range
    fun insertCheckboxes(checkedValue: Any): Range
    fun insertCheckboxes(checkedValue: Any, uncheckedValue: Any): Range
    fun isBlank(): Boolean
    fun isChecked(): Boolean?
    fun isEndColumnBounded(): Boolean
    fun isEndRowBounded(): Boolean
    fun isPartOfMerge(): Boolean
    fun isStartColumnBounded(): Boolean
    fun isStartRowBounded(): Boolean
    fun merge(): Range
    fun mergeAcross(): Range
    fun mergeVertically(): Range
    fun moveTo(target: Range)
    fun offset(rowOffset: Integer, columnOffset: Integer): Range
    fun offset(rowOffset: Integer, columnOffset: Integer, numRows: Integer): Range
    fun offset(rowOffset: Integer, columnOffset: Integer, numRows: Integer, numColumns: Integer): Range
    fun protect(): Protection
    fun randomize(): Range
    fun removeCheckboxes(): Range
    fun removeDuplicates(): Range
    fun removeDuplicates(columnsToCompare: Array<Integer>): Range
    fun setBackground(color: String?): Range
    fun setBackgroundRGB(red: Integer, green: Integer, blue: Integer): Range
    fun setBackgrounds(color: Array<Array<String?>>): Range
    fun setBorder(top: Boolean?, left: Boolean?, bottom: Boolean?, right: Boolean?, vertical: Boolean?, horizontal: Boolean?): Range
    fun setBorder(top: Boolean?, left: Boolean?, bottom: Boolean?, right: Boolean?, vertical: Boolean?, horizontal: Boolean?, color: String?, style: BorderStyle?): Range
    fun setDataValidation(rule: DataValidation?): Range
    fun setDataValidations(rules: Array<Array<DataValidation?>>): Range
    fun setFontColor(color: String?): Range
    fun setFontColors(colors: Array<Array<Any>>): Range
    fun setFontFamilies(fontFamilies: Array<Array<String?>>): Range
    fun setFontFamily(fontFamily: String?): Range
    fun setFontLine(fontLine: String /* "none" | "underline" | "line-through" */): Range
    fun setFontLines(fontLines: Array<Array<String /* "none" | "underline" | "line-through" */>>): Range
    fun setFontSize(size: Integer): Range
    fun setFontSizes(sizes: Array<Array<Integer>>): Range
    fun setFontStyle(fontStyle: String /* "normal" | "italic" */): Range
    fun setFontStyles(fontStyles: Array<Array<String /* "normal" | "italic" */>>): Range
    fun setFontWeight(fontWeight: String /* "normal" | "bold" */): Range
    fun setFontWeights(fontWeights: Array<Array<String /* "normal" | "bold" */>>): Range
    fun setFormula(formula: String): Range
    fun setFormulaR1C1(formula: String): Range
    fun setFormulas(formulas: Array<Array<String>>): Range
    fun setFormulasR1C1(formulas: Array<Array<String>>): Range
    fun setHorizontalAlignment(alignment: String /* "left" | "center" | "normal" | "right" */): Range
    fun setHorizontalAlignments(alignments: Array<Array<String /* "left" | "center" | "normal" | "right" */>>): Range
    fun setNote(note: String?): Range
    fun setNotes(notes: Array<Array<String?>>): Range
    fun setNumberFormat(numberFormat: String): Range
    fun setNumberFormats(numberFormats: Array<Array<String>>): Range
    fun setRichTextValue(value: RichTextValue): Range
    fun setRichTextValues(values: Array<Array<RichTextValue>>): Range
    fun setShowHyperlink(showHyperlink: Boolean): Range
    fun setTextDirection(direction: TextDirection?): Range
    fun setTextDirections(directions: Array<Array<TextDirection?>>): Range
    fun setTextRotation(degrees: Integer): Range
    fun setTextRotation(rotation: TextRotation): Range
    fun setTextRotations(rotations: Array<Array<TextRotation>>): Range
    fun setTextStyle(style: TextStyle): Range
    fun setTextStyles(styles: Array<Array<TextStyle>>): Range
    fun setValue(value: Any): Range
    fun setValues(values: Array<Array<Any>>): Range
    fun setVerticalAlignment(alignment: String /* "top" | "middle" | "bottom" */): Range
    fun setVerticalAlignments(alignments: Array<Array<String /* "top" | "middle" | "bottom" */>>): Range
    fun setVerticalText(isVertical: Boolean): Range
    fun setWrap(isWrapEnabled: Boolean): Range
    fun setWrapStrategies(strategies: Array<Array<WrapStrategy>>): Range
    fun setWrapStrategy(strategy: WrapStrategy): Range
    fun setWraps(isWrapEnabled: Array<Array<Boolean>>): Range
    fun shiftColumnGroupDepth(delta: Integer): Range
    fun shiftRowGroupDepth(delta: Integer): Range
    fun sort(sortSpecObj: Any): Range
    fun splitTextToColumns()
    fun splitTextToColumns(delimiter: String)
    fun splitTextToColumns(delimiter: TextToColumnsDelimiter)
    fun trimWhitespace(): Range
    fun uncheck(): Range
}

external interface RangeList {
    fun activate(): RangeList
    fun breakApart(): RangeList
    fun check(): RangeList
    fun clear(): RangeList
    fun clear(options: `T$0`): RangeList
    fun clearContent(): RangeList
    fun clearDataValidations(): RangeList
    fun clearFormat(): RangeList
    fun clearNote(): RangeList
    fun getRanges(): Array<Range>
    fun insertCheckboxes(): RangeList
    fun insertCheckboxes(checkedValue: Any): RangeList
    fun insertCheckboxes(checkedValue: Any, uncheckedValue: Any): RangeList
    fun removeCheckboxes(): RangeList
    fun setBackground(color: String?): RangeList
    fun setBackgroundRGB(red: Integer, green: Integer, blue: Integer): RangeList
    fun setBorder(top: Boolean?, left: Boolean?, bottom: Boolean?, right: Boolean?, vertical: Boolean?, horizontal: Boolean?): RangeList
    fun setBorder(top: Boolean?, left: Boolean?, bottom: Boolean?, right: Boolean?, vertical: Boolean?, horizontal: Boolean?, color: String?, style: BorderStyle?): RangeList
    fun setFontColor(color: String?): RangeList
    fun setFontFamily(fontFamily: String?): RangeList
    fun setFontLine(fontLine: String /* "none" | "underline" | "line-through" */): RangeList
    fun setFontSize(size: Integer): RangeList
    fun setFontStyle(fontStyle: String /* "normal" | "italic" */): RangeList
    fun setFontWeight(fontWeight: String /* "normal" | "bold" */): RangeList
    fun setFormula(formula: String): RangeList
    fun setFormulaR1C1(formula: String): RangeList
    fun setHorizontalAlignment(alignment: String /* "left" | "center" | "normal" | "right" */): RangeList
    fun setNote(note: String?): RangeList
    fun setNumberFormat(numberFormat: String): RangeList
    fun setShowHyperlink(showHyperlink: Boolean): RangeList
    fun setTextDirection(direction: TextDirection?): RangeList
    fun setTextRotation(degrees: Integer): RangeList
    fun setValue(value: Any): RangeList
    fun setVerticalAlignment(alignment: String /* "top" | "middle" | "bottom" */): RangeList
    fun setVerticalText(isVertical: Boolean): RangeList
    fun setWrap(isWrapEnabled: Boolean): RangeList
    fun setWrapStrategy(strategy: WrapStrategy): RangeList
    fun trimWhitespace(): RangeList
    fun uncheck(): RangeList
}

external enum class RecalculationInterval {
    ON_CHANGE,
    MINUTE,
    HOUR
}

external enum class RelativeDate {
    TODAY,
    TOMORROW,
    YESTERDAY,
    PAST_WEEK,
    PAST_MONTH,
    PAST_YEAR
}

external interface RichTextValue {
    fun copy(): RichTextValueBuilder
    fun getEndIndex(): Integer
    fun getLinkUrl(): String?
    fun getLinkUrl(startOffset: Integer, endOffset: Integer): String?
    fun getRuns(): Array<RichTextValue>
    fun getStartIndex(): Integer
    fun getText(): String
    fun getTextStyle(): TextStyle
    fun getTextStyle(startOffset: Integer, endOffset: Integer): TextStyle
}

external interface RichTextValueBuilder {
    fun build(): RichTextValue
    fun setLinkUrl(startOffset: Integer, endOffset: Integer, linkUrl: String?): RichTextValueBuilder
    fun setLinkUrl(linkUrl: String?): RichTextValueBuilder
    fun setText(text: String): RichTextValueBuilder
    fun setTextStyle(startOffset: Integer, endOffset: Integer, textStyle: TextStyle?): RichTextValueBuilder
    fun setTextStyle(textStyle: TextStyle?): RichTextValueBuilder
}

external interface Selection {
    fun getActiveRange(): Range?
    fun getActiveRangeList(): RangeList?
    fun getActiveSheet(): Sheet
    fun getCurrentCell(): Range?
    fun getNextDataRange(direction: Direction): Range?
}

external interface Sheet {
    fun activate(): Sheet
    fun addDeveloperMetadata(key: String): Sheet
    fun addDeveloperMetadata(key: String, visibility: DeveloperMetadataVisibility): Sheet
    fun addDeveloperMetadata(key: String, value: String): Sheet
    fun addDeveloperMetadata(key: String, value: String, visibility: DeveloperMetadataVisibility): Sheet
    fun appendRow(rowContents: Array<Any>): Sheet
    fun autoResizeColumn(columnPosition: Integer): Sheet
    fun autoResizeColumns(startColumn: Integer, numColumns: Integer): Sheet
    fun autoResizeRows(startRow: Integer, numRows: Integer): Sheet
    fun clear(): Sheet
    fun clear(options: `T$1`): Sheet
    fun clearConditionalFormatRules()
    fun clearContents(): Sheet
    fun clearFormats(): Sheet
    fun clearNotes(): Sheet
    fun collapseAllColumnGroups(): Sheet
    fun collapseAllRowGroups(): Sheet
    fun copyTo(spreadsheet: Spreadsheet): Sheet
    fun createDeveloperMetadataFinder(): DeveloperMetadataFinder
    fun createTextFinder(findText: String): TextFinder
    fun deleteColumn(columnPosition: Integer): Sheet
    fun deleteColumns(columnPosition: Integer, howMany: Integer)
    fun deleteRow(rowPosition: Integer): Sheet
    fun deleteRows(rowPosition: Integer, howMany: Integer)
    fun expandAllColumnGroups(): Sheet
    fun expandAllRowGroups(): Sheet
    fun expandColumnGroupsUpToDepth(groupDepth: Integer): Sheet
    fun expandRowGroupsUpToDepth(groupDepth: Integer): Sheet
    fun getActiveCell(): Range
    fun getActiveRange(): Range?
    fun getActiveRangeList(): RangeList?
    fun getBandings(): Array<Banding>
    fun getCharts(): Array<EmbeddedChart>
    fun getColumnGroup(columnIndex: Integer, groupDepth: Integer): Group?
    fun getColumnGroupControlPosition(): GroupControlTogglePosition
    fun getColumnGroupDepth(columnIndex: Integer): Integer
    fun getColumnWidth(columnPosition: Integer): Integer
    fun getConditionalFormatRules(): Array<ConditionalFormatRule>
    fun getCurrentCell(): Range?
    fun getDataRange(): Range
    fun getDataSourceTables(): Array<DataSourceTable>
    fun getDeveloperMetadata(): Array<DeveloperMetadata>
    fun getFilter(): Filter?
    fun getFormUrl(): String?
    fun getFrozenColumns(): Integer
    fun getFrozenRows(): Integer
    fun getImages(): Array<OverGridImage>
    fun getIndex(): Integer
    fun getLastColumn(): Integer
    fun getLastRow(): Integer
    fun getMaxColumns(): Integer
    fun getMaxRows(): Integer
    fun getName(): String
    fun getNamedRanges(): Array<NamedRange>
    fun getParent(): Spreadsheet
    fun getPivotTables(): Array<PivotTable>
    fun getProtections(type: ProtectionType): Array<Protection>
    fun getRange(row: Integer, column: Integer): Range
    fun getRange(row: Integer, column: Integer, numRows: Integer): Range
    fun getRange(row: Integer, column: Integer, numRows: Integer, numColumns: Integer): Range
    fun getRange(a1Notation: String): Range
    fun getRangeList(a1Notations: Array<String>): RangeList
    fun getRowGroup(rowIndex: Integer, groupDepth: Integer): Group?
    fun getRowGroupControlPosition(): GroupControlTogglePosition
    fun getRowGroupDepth(rowIndex: Integer): Integer
    fun getRowHeight(rowPosition: Integer): Integer
    fun getSelection(): Selection
    fun getSheetId(): Integer
    fun getSheetName(): String
    fun getSheetValues(startRow: Integer, startColumn: Integer, numRows: Integer, numColumns: Integer): Array<Array<Any>>
    fun getSlicers(): Array<Slicer>
    fun getTabColor(): String?
    fun getType(): SheetType
    fun hasHiddenGridlines(): Boolean
    fun hideColumn(column: Range)
    fun hideColumns(columnIndex: Integer)
    fun hideColumns(columnIndex: Integer, numColumns: Integer)
    fun hideRow(row: Range)
    fun hideRows(rowIndex: Integer)
    fun hideRows(rowIndex: Integer, numRows: Integer)
    fun hideSheet(): Sheet
    fun insertChart(chart: EmbeddedChart)
    fun insertColumnAfter(afterPosition: Integer): Sheet
    fun insertColumnBefore(beforePosition: Integer): Sheet
    fun insertColumns(columnIndex: Integer)
    fun insertColumns(columnIndex: Integer, numColumns: Integer)
    fun insertColumnsAfter(afterPosition: Integer, howMany: Integer): Sheet
    fun insertColumnsBefore(beforePosition: Integer, howMany: Integer): Sheet
    fun insertImage(blobSource: BlobSource, column: Integer, row: Integer): OverGridImage
    fun insertImage(blobSource: BlobSource, column: Integer, row: Integer, offsetX: Integer, offsetY: Integer): OverGridImage
    fun insertImage(url: String, column: Integer, row: Integer): OverGridImage
    fun insertImage(url: String, column: Integer, row: Integer, offsetX: Integer, offsetY: Integer): OverGridImage
    fun insertRowAfter(afterPosition: Integer): Sheet
    fun insertRowBefore(beforePosition: Integer): Sheet
    fun insertRows(rowIndex: Integer)
    fun insertRows(rowIndex: Integer, numRows: Integer)
    fun insertRowsAfter(afterPosition: Integer, howMany: Integer): Sheet
    fun insertRowsBefore(beforePosition: Integer, howMany: Integer): Sheet
    fun insertSlicer(range: Range, anchorRowPos: Integer, anchorColPos: Integer): Slicer
    fun insertSlicer(range: Range, anchorRowPos: Integer, anchorColPos: Integer, offsetX: Integer, offsetY: Integer): Slicer
    fun isColumnHiddenByUser(columnPosition: Integer): Boolean
    fun isRightToLeft(): Boolean
    fun isRowHiddenByFilter(rowPosition: Integer): Boolean
    fun isRowHiddenByUser(rowPosition: Integer): Boolean
    fun isSheetHidden(): Boolean
    fun moveColumns(columnSpec: Range, destinationIndex: Integer)
    fun moveRows(rowSpec: Range, destinationIndex: Integer)
    fun newChart(): EmbeddedChartBuilder
    fun protect(): Protection
    fun removeChart(chart: EmbeddedChart)
    fun setActiveRange(range: Range): Range
    fun setActiveRangeList(rangeList: RangeList): RangeList
    fun setActiveSelection(range: Range): Range
    fun setActiveSelection(a1Notation: String): Range
    fun setColumnGroupControlPosition(position: GroupControlTogglePosition): Sheet
    fun setColumnWidth(columnPosition: Integer, width: Integer): Sheet
    fun setColumnWidths(startColumn: Integer, numColumns: Integer, width: Integer): Sheet
    fun setConditionalFormatRules(rules: Array<ConditionalFormatRule>)
    fun setCurrentCell(cell: Range): Range
    fun setFrozenColumns(columns: Integer)
    fun setFrozenRows(rows: Integer)
    fun setHiddenGridlines(hideGridlines: Boolean): Sheet
    fun setName(name: String): Sheet
    fun setRightToLeft(rightToLeft: Boolean): Sheet
    fun setRowGroupControlPosition(position: GroupControlTogglePosition): Sheet
    fun setRowHeight(rowPosition: Integer, height: Integer): Sheet
    fun setRowHeights(startRow: Integer, numRows: Integer, height: Integer): Sheet
    fun setTabColor(color: String?): Sheet
    fun showColumns(columnIndex: Integer)
    fun showColumns(columnIndex: Integer, numColumns: Integer)
    fun showRows(rowIndex: Integer)
    fun showRows(rowIndex: Integer, numRows: Integer)
    fun showSheet(): Sheet
    fun sort(columnPosition: Integer): Sheet
    fun sort(columnPosition: Integer, ascending: Boolean): Sheet
    fun unhideColumn(column: Range)
    fun unhideRow(row: Range)
    fun updateChart(chart: EmbeddedChart)
    fun getSheetProtection(): PageProtection
    fun setSheetProtection(permissions: PageProtection)
}

external enum class SheetType {
    GRID,
    OBJECT
}

external interface Slicer {
    fun getBackgroundColor(): String?
    fun getColumnPosition(): Integer?
    fun getContainerInfo(): ContainerInfo
    fun getFilterCriteria(): FilterCriteria?
    fun getRange(): Range
    fun getTitle(): String
    fun getTitleHorizontalAlignment(): String
    fun getTitleTextStyle(): TextStyle
    fun isAppliedToPivotTables(): Boolean
    fun remove()
    fun setApplyToPivotTables(applyToPivotTables: Boolean): Slicer
    fun setBackgroundColor(color: String?): Slicer
    fun setColumnFilterCriteria(columnPosition: Integer, filterCriteria: FilterCriteria?): Slicer
    fun setPosition(anchorRowPos: Integer, anchorColPos: Integer, offsetX: Integer, offsetY: Integer): Slicer
    fun setRange(rangeApi: Range): Slicer
    fun setTitle(title: String): Slicer
    fun setTitleHorizontalAlignment(horizontalAlignment: String?): Slicer
    fun setTitleTextStyle(textStyle: TextStyle): Slicer
}

external interface `T$2` {
    var name: String
    var functionName: String
}

external interface `T$3` {
    var template: Sheet?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Spreadsheet {
    fun addDeveloperMetadata(key: String): Spreadsheet
    fun addDeveloperMetadata(key: String, visibility: DeveloperMetadataVisibility): Spreadsheet
    fun addDeveloperMetadata(key: String, value: String): Spreadsheet
    fun addDeveloperMetadata(key: String, value: String, visibility: DeveloperMetadataVisibility): Spreadsheet
    fun addEditor(emailAddress: String): Spreadsheet
    fun addEditor(user: User): Spreadsheet
    fun addEditors(emailAddresses: Array<String>): Spreadsheet
    fun addMenu(name: String, subMenus: Array<`T$2`?>)
    fun addViewer(emailAddress: String): Spreadsheet
    fun addViewer(user: User): Spreadsheet
    fun addViewers(emailAddresses: Array<String>): Spreadsheet
    fun appendRow(rowContents: Array<Any>): Sheet
    fun autoResizeColumn(columnPosition: Integer): Sheet
    fun copy(name: String): Spreadsheet
    fun createDeveloperMetadataFinder(): DeveloperMetadataFinder
    fun createTextFinder(findText: String): TextFinder
    fun deleteActiveSheet(): Sheet
    fun deleteColumn(columnPosition: Integer): Sheet
    fun deleteColumns(columnPosition: Integer, howMany: Integer)
    fun deleteRow(rowPosition: Integer): Sheet
    fun deleteRows(rowPosition: Integer, howMany: Integer)
    fun deleteSheet(sheet: Sheet)
    fun duplicateActiveSheet(): Sheet
    fun getActiveCell(): Range
    fun getActiveRange(): Range?
    fun getActiveRangeList(): RangeList?
    fun getActiveSheet(): Sheet
    fun getAs(contentType: String): Blob
    fun getBandings(): Array<Banding>
    fun getBlob(): Blob
    fun getColumnWidth(columnPosition: Integer): Integer
    fun getCurrentCell(): Range?
    fun getDataRange(): Range
    fun getDataSourceTables(): Array<DataSourceTable>
    fun getDeveloperMetadata(): Array<DeveloperMetadata>
    fun getEditors(): Array<User>
    fun getFormUrl(): String?
    fun getFrozenColumns(): Integer
    fun getFrozenRows(): Integer
    fun getId(): String
    fun getImages(): Array<OverGridImage>
    fun getIterativeCalculationConvergenceThreshold(): Number
    fun getLastColumn(): Integer
    fun getLastRow(): Integer
    fun getMaxIterativeCalculationCycles(): Integer
    fun getName(): String
    fun getNamedRanges(): Array<NamedRange>
    fun getNumSheets(): Integer
    fun getOwner(): User?
    fun getPredefinedSpreadsheetThemes(): Array<SpreadsheetTheme>
    fun getProtections(type: ProtectionType): Array<Protection>
    fun getRange(a1Notation: String): Range
    fun getRangeByName(name: String): Range?
    fun getRangeList(a1Notations: Array<String>): RangeList
    fun getRecalculationInterval(): RecalculationInterval
    fun getRowHeight(rowPosition: Integer): Integer
    fun getSelection(): Selection
    fun getSheetByName(name: String): Sheet?
    fun getSheetId(): Integer
    fun getSheetName(): String
    fun getSheetValues(startRow: Integer, startColumn: Integer, numRows: Integer, numColumns: Integer): Array<Array<Any>>
    fun getSheets(): Array<Sheet>
    fun getSpreadsheetLocale(): String
    fun getSpreadsheetTheme(): SpreadsheetTheme?
    fun getSpreadsheetTimeZone(): String
    fun getUrl(): String
    fun getViewers(): Array<User>
    fun hideColumn(column: Range)
    fun hideRow(row: Range)
    fun insertColumnAfter(afterPosition: Integer): Sheet
    fun insertColumnBefore(beforePosition: Integer): Sheet
    fun insertColumnsAfter(afterPosition: Integer, howMany: Integer): Sheet
    fun insertColumnsBefore(beforePosition: Integer, howMany: Integer): Sheet
    fun insertImage(blobSource: BlobSource, column: Integer, row: Integer): OverGridImage
    fun insertImage(blobSource: BlobSource, column: Integer, row: Integer, offsetX: Integer, offsetY: Integer): OverGridImage
    fun insertImage(url: String, column: Integer, row: Integer): OverGridImage
    fun insertImage(url: String, column: Integer, row: Integer, offsetX: Integer, offsetY: Integer): OverGridImage
    fun insertRowAfter(afterPosition: Integer): Sheet
    fun insertRowBefore(beforePosition: Integer): Sheet
    fun insertRowsAfter(afterPosition: Integer, howMany: Integer): Sheet
    fun insertRowsBefore(beforePosition: Integer, howMany: Integer): Sheet
    fun insertSheet(): Sheet
    fun insertSheet(sheetIndex: Integer): Sheet
    fun insertSheet(sheetIndex: Integer, options: `T$3`): Sheet
    fun insertSheet(options: `T$3`): Sheet
    fun insertSheet(sheetName: String): Sheet
    fun insertSheet(sheetName: String, sheetIndex: Integer): Sheet
    fun insertSheet(sheetName: String, sheetIndex: Integer, options: `T$3`): Sheet
    fun insertSheet(sheetName: String, options: `T$3`): Sheet
    fun insertSheetWithDataSourceTable(spec: DataSourceSpec): Sheet
    fun isColumnHiddenByUser(columnPosition: Integer): Boolean
    fun isIterativeCalculationEnabled(): Boolean
    fun isRowHiddenByFilter(rowPosition: Integer): Boolean
    fun isRowHiddenByUser(rowPosition: Integer): Boolean
    fun moveActiveSheet(pos: Integer)
    fun moveChartToObjectSheet(chart: EmbeddedChart): Sheet
    fun removeEditor(emailAddress: String): Spreadsheet
    fun removeEditor(user: User): Spreadsheet
    fun removeMenu(name: String)
    fun removeNamedRange(name: String)
    fun removeViewer(emailAddress: String): Spreadsheet
    fun removeViewer(user: User): Spreadsheet
    fun rename(newName: String)
    fun renameActiveSheet(newName: String)
    fun resetSpreadsheetTheme(): SpreadsheetTheme
    fun setActiveRange(range: Range): Range
    fun setActiveRangeList(rangeList: RangeList): RangeList
    fun setActiveSelection(range: Range): Range
    fun setActiveSelection(a1Notation: String): Range
    fun setActiveSheet(sheet: Sheet): Sheet
    fun setActiveSheet(sheet: Sheet, restoreSelection: Boolean): Sheet
    fun setColumnWidth(columnPosition: Integer, width: Integer): Sheet
    fun setCurrentCell(cell: Range): Range
    fun setFrozenColumns(columns: Integer)
    fun setFrozenRows(rows: Integer)
    fun setIterativeCalculationConvergenceThreshold(minThreshold: Number): Spreadsheet
    fun setIterativeCalculationEnabled(isEnabled: Boolean): Spreadsheet
    fun setMaxIterativeCalculationCycles(maxIterations: Integer): Spreadsheet
    fun setNamedRange(name: String, range: Range)
    fun setRecalculationInterval(recalculationInterval: RecalculationInterval): Spreadsheet
    fun setRowHeight(rowPosition: Integer, height: Integer): Sheet
    fun setSpreadsheetLocale(locale: String)
    fun setSpreadsheetTheme(theme: SpreadsheetTheme): SpreadsheetTheme
    fun setSpreadsheetTimeZone(timezone: String)
    fun show(userInterface: HtmlOutput)
    fun sort(columnPosition: Integer): Sheet
    fun sort(columnPosition: Integer, ascending: Boolean): Sheet
    fun toast(msg: String)
    fun toast(msg: String, title: String)
    fun toast(msg: String, title: String, timeoutSeconds: Number?)
    fun unhideColumn(column: Range)
    fun unhideRow(row: Range)
    fun updateMenu(name: String, subMenus: Array<`T$2`>)
    fun getSheetProtection(): PageProtection
    fun isAnonymousView(): Boolean
    fun isAnonymousWrite(): Boolean
    fun setAnonymousAccess(anonymousReadAllowed: Boolean, anonymousWriteAllowed: Boolean)
    fun setSheetProtection(permissions: PageProtection)
}

external interface SpreadsheetApp {
    var AutoFillSeries: Any
    var BandingTheme: Any
    var BooleanCriteria: Any
    var BorderStyle: Any
    var ColorType: Any
    var CopyPasteType: Any
    var DataExecutionErrorCode: Any
    var DataExecutionState: Any
    var DataSourceParameterType: Any
    var DataSourceType: Any
    var DataValidationCriteria: Any
    var DeveloperMetadataLocationType: Any
    var DeveloperMetadataVisibility: Any
    var Dimension: Any
    var Direction: Any
    var GroupControlTogglePosition: Any
    var InterpolationType: Any
    var PivotTableSummarizeFunction: Any
    var PivotValueDisplayType: Any
    var ProtectionType: Any
    var RecalculationInterval: Any
    var RelativeDate: Any
    var SheetType: Any
    var TextDirection: Any
    var TextToColumnsDelimiter: Any
    var ThemeColorType: Any
    var WrapStrategy: Any
    fun create(name: String): Spreadsheet
    fun create(name: String, rows: Integer, columns: Integer): Spreadsheet
    fun enableAllDataSourcesExecution()
    fun enableBigQueryExecution()
    fun flush()
    fun getActive(): Spreadsheet
    fun getActiveRange(): Range
    fun getActiveRangeList(): RangeList
    fun getActiveSheet(): Sheet
    fun getActiveSpreadsheet(): Spreadsheet
    fun getCurrentCell(): Range
    fun getSelection(): Selection
    fun getUi(): Ui
    fun newColor(): ColorBuilder
    fun newConditionalFormatRule(): ConditionalFormatRuleBuilder
    fun newDataSourceSpec(): DataSourceSpecBuilder
    fun newDataValidation(): DataValidationBuilder
    fun newFilterCriteria(): FilterCriteriaBuilder
    fun newRichTextValue(): RichTextValueBuilder
    fun newTextStyle(): TextStyleBuilder
    fun open(file: File): Spreadsheet
    fun openById(id: String): Spreadsheet
    fun openByUrl(url: String): Spreadsheet
    fun setActiveRange(range: Range): Range
    fun setActiveRangeList(rangeList: RangeList): RangeList
    fun setActiveSheet(sheet: Sheet): Sheet
    fun setActiveSheet(sheet: Sheet, restoreSelection: Boolean): Sheet
    fun setActiveSpreadsheet(newActiveSpreadsheet: Spreadsheet)
    fun setCurrentCell(cell: Range): Range
}

external interface SpreadsheetTheme {
    fun getConcreteColor(themeColorType: ThemeColorType): Color
    fun getFontFamily(): String?
    fun getThemeColors(): Array<ThemeColorType>
    fun setConcreteColor(themeColorType: ThemeColorType, color: Color): SpreadsheetTheme
    fun setConcreteColor(themeColorType: ThemeColorType, red: Integer, green: Integer, blue: Integer): SpreadsheetTheme
    fun setFontFamily(fontFamily: String): SpreadsheetTheme
}

external enum class TextDirection {
    LEFT_TO_RIGHT,
    RIGHT_TO_LEFT
}

external interface TextFinder {
    fun findAll(): Array<Range>
    fun findNext(): Range?
    fun findPrevious(): Range?
    fun getCurrentMatch(): Range?
    fun ignoreDiacritics(ignoreDiacritics: Boolean): TextFinder
    fun matchCase(matchCase: Boolean): TextFinder
    fun matchEntireCell(matchEntireCell: Boolean): TextFinder
    fun matchFormulaText(matchFormulaText: Boolean): TextFinder
    fun replaceAllWith(replaceText: String): Integer
    fun replaceWith(replaceText: String): Integer
    fun startFrom(startRange: Range): TextFinder
    fun useRegularExpression(useRegEx: Boolean): TextFinder
}

external interface TextRotation {
    fun getDegrees(): Integer
    fun isVertical(): Boolean
}

external interface TextStyle {
    fun copy(): TextStyleBuilder
    fun getFontFamily(): String?
    fun getFontSize(): Integer?
    fun getForegroundColor(): String?
    fun isBold(): Boolean?
    fun isItalic(): Boolean?
    fun isStrikethrough(): Boolean?
    fun isUnderline(): Boolean?
}

external interface TextStyleBuilder {
    fun build(): TextStyle
    fun setBold(bold: Boolean): TextStyleBuilder
    fun setFontFamily(fontFamily: String): TextStyleBuilder
    fun setFontSize(fontSize: Integer): TextStyleBuilder
    fun setForegroundColor(cssString: String): TextStyleBuilder
    fun setItalic(italic: Boolean): TextStyleBuilder
    fun setStrikethrough(strikethrough: Boolean): TextStyleBuilder
    fun setUnderline(underline: Boolean): TextStyleBuilder
}

external enum class TextToColumnsDelimiter {
    COMMA,
    SEMICOLON,
    PERIOD,
    SPACE
}

external interface ThemeColor {
    fun getColorType(): ColorType
    fun getThemeColorType(): ThemeColorType
}

external enum class ThemeColorType {
    UNSUPPORTED,
    TEXT,
    BACKGROUND,
    ACCENT1,
    ACCENT2,
    ACCENT3,
    ACCENT4,
    ACCENT5,
    ACCENT6,
    HYPERLINK
}

external enum class WrapStrategy {
    WRAP,
    OVERFLOW,
    CLIP
}