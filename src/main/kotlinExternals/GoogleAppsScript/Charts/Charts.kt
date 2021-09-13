package GoogleAppsScript.Charts

import GoogleAppsScript.Base.Blob
import GoogleAppsScript.Integer

external interface AreaChartBuilder {
    fun build(): Chart
    fun reverseCategories(): AreaChartBuilder
    fun setBackgroundColor(cssValue: String): AreaChartBuilder
    fun setColors(cssValues: Array<String>): AreaChartBuilder
    fun setDataSourceUrl(url: String): AreaChartBuilder
    fun setDataTable(tableBuilder: DataTableBuilder): AreaChartBuilder
    fun setDataTable(table: DataTableSource): AreaChartBuilder
    fun setDataViewDefinition(dataViewDefinition: DataViewDefinition): AreaChartBuilder
    fun setDimensions(width: Integer, height: Integer): AreaChartBuilder
    fun setLegendPosition(position: Position): AreaChartBuilder
    fun setLegendTextStyle(textStyle: TextStyle): AreaChartBuilder
    fun setOption(option: String, value: Any): AreaChartBuilder
    fun setPointStyle(style: PointStyle): AreaChartBuilder
    fun setRange(start: Number, end: Number): AreaChartBuilder
    fun setStacked(): AreaChartBuilder
    fun setTitle(chartTitle: String): AreaChartBuilder
    fun setTitleTextStyle(textStyle: TextStyle): AreaChartBuilder
    fun setXAxisTextStyle(textStyle: TextStyle): AreaChartBuilder
    fun setXAxisTitle(title: String): AreaChartBuilder
    fun setXAxisTitleTextStyle(textStyle: TextStyle): AreaChartBuilder
    fun setYAxisTextStyle(textStyle: TextStyle): AreaChartBuilder
    fun setYAxisTitle(title: String): AreaChartBuilder
    fun setYAxisTitleTextStyle(textStyle: TextStyle): AreaChartBuilder
    fun useLogScale(): AreaChartBuilder
}

external interface BarChartBuilder {
    fun build(): Chart
    fun reverseCategories(): BarChartBuilder
    fun reverseDirection(): BarChartBuilder
    fun setBackgroundColor(cssValue: String): BarChartBuilder
    fun setColors(cssValues: Array<String>): BarChartBuilder
    fun setDataSourceUrl(url: String): BarChartBuilder
    fun setDataTable(tableBuilder: DataTableBuilder): BarChartBuilder
    fun setDataTable(table: DataTableSource): BarChartBuilder
    fun setDataViewDefinition(dataViewDefinition: DataViewDefinition): BarChartBuilder
    fun setDimensions(width: Integer, height: Integer): BarChartBuilder
    fun setLegendPosition(position: Position): BarChartBuilder
    fun setLegendTextStyle(textStyle: TextStyle): BarChartBuilder
    fun setOption(option: String, value: Any): BarChartBuilder
    fun setRange(start: Number, end: Number): BarChartBuilder
    fun setStacked(): BarChartBuilder
    fun setTitle(chartTitle: String): BarChartBuilder
    fun setTitleTextStyle(textStyle: TextStyle): BarChartBuilder
    fun setXAxisTextStyle(textStyle: TextStyle): BarChartBuilder
    fun setXAxisTitle(title: String): BarChartBuilder
    fun setXAxisTitleTextStyle(textStyle: TextStyle): BarChartBuilder
    fun setYAxisTextStyle(textStyle: TextStyle): BarChartBuilder
    fun setYAxisTitle(title: String): BarChartBuilder
    fun setYAxisTitleTextStyle(textStyle: TextStyle): BarChartBuilder
    fun useLogScale(): BarChartBuilder
}

external interface Chart {
    fun getAs(contentType: String): Blob
    fun getBlob(): Blob
    fun getOptions(): ChartOptions
}

external enum class ChartHiddenDimensionStrategy {
    IGNORE_BOTH,
    IGNORE_ROWS,
    IGNORE_COLUMNS,
    SHOW_BOTH
}

external enum class ChartMergeStrategy {
    MERGE_COLUMNS,
    MERGE_ROWS
}

external interface ChartOptions {
    fun get(option: String): Any
}

external enum class ChartType {
    TIMELINE,
    AREA,
    BAR,
    BUBBLE,
    CANDLESTICK,
    COLUMN,
    COMBO,
    GAUGE,
    GEO,
    HISTOGRAM,
    RADAR,
    LINE,
    ORG,
    PIE,
    SCATTER,
    SPARKLINE,
    STEPPED_AREA,
    TABLE,
    TREEMAP,
    WATERFALL
}

external interface Charts {
    var ChartHiddenDimensionStrategy: Any
    var ChartMergeStrategy: Any
    var ChartType: Any
    var ColumnType: Any
    var CurveStyle: Any
    var PointStyle: Any
    var Position: Any
    fun newAreaChart(): AreaChartBuilder
    fun newBarChart(): BarChartBuilder
    fun newColumnChart(): ColumnChartBuilder
    fun newDataTable(): DataTableBuilder
    fun newDataViewDefinition(): DataViewDefinitionBuilder
    fun newLineChart(): LineChartBuilder
    fun newPieChart(): PieChartBuilder
    fun newScatterChart(): ScatterChartBuilder
    fun newTableChart(): TableChartBuilder
    fun newTextStyle(): TextStyleBuilder
}

external interface ColumnChartBuilder {
    fun build(): Chart
    fun reverseCategories(): ColumnChartBuilder
    fun setBackgroundColor(cssValue: String): ColumnChartBuilder
    fun setColors(cssValues: Array<String>): ColumnChartBuilder
    fun setDataSourceUrl(url: String): ColumnChartBuilder
    fun setDataTable(tableBuilder: DataTableBuilder): ColumnChartBuilder
    fun setDataTable(table: DataTableSource): ColumnChartBuilder
    fun setDataViewDefinition(dataViewDefinition: DataViewDefinition): ColumnChartBuilder
    fun setDimensions(width: Integer, height: Integer): ColumnChartBuilder
    fun setLegendPosition(position: Position): ColumnChartBuilder
    fun setLegendTextStyle(textStyle: TextStyle): ColumnChartBuilder
    fun setOption(option: String, value: Any): ColumnChartBuilder
    fun setRange(start: Number, end: Number): ColumnChartBuilder
    fun setStacked(): ColumnChartBuilder
    fun setTitle(chartTitle: String): ColumnChartBuilder
    fun setTitleTextStyle(textStyle: TextStyle): ColumnChartBuilder
    fun setXAxisTextStyle(textStyle: TextStyle): ColumnChartBuilder
    fun setXAxisTitle(title: String): ColumnChartBuilder
    fun setXAxisTitleTextStyle(textStyle: TextStyle): ColumnChartBuilder
    fun setYAxisTextStyle(textStyle: TextStyle): ColumnChartBuilder
    fun setYAxisTitle(title: String): ColumnChartBuilder
    fun setYAxisTitleTextStyle(textStyle: TextStyle): ColumnChartBuilder
    fun useLogScale(): ColumnChartBuilder
}

external enum class ColumnType {
    DATE,
    NUMBER,
    STRING
}

external enum class CurveStyle {
    NORMAL,
    SMOOTH
}

external interface DataTable

external interface DataTableBuilder {
    fun addColumn(type: ColumnType, label: String): DataTableBuilder
    fun addRow(values: Array<Any>): DataTableBuilder
    fun build(): DataTable
    fun setValue(row: Integer, column: Integer, value: Any): DataTableBuilder
}

external interface DataTableSource {
    fun getDataTable(): DataTable
}

external interface DataViewDefinition

external interface DataViewDefinitionBuilder {
    fun build(): DataViewDefinition
    fun setColumns(columns: Array<Any>): DataViewDefinitionBuilder
}

external interface LineChartBuilder {
    fun build(): Chart
    fun reverseCategories(): LineChartBuilder
    fun setBackgroundColor(cssValue: String): LineChartBuilder
    fun setColors(cssValues: Array<String>): LineChartBuilder
    fun setCurveStyle(style: CurveStyle): LineChartBuilder
    fun setDataSourceUrl(url: String): LineChartBuilder
    fun setDataTable(tableBuilder: DataTableBuilder): LineChartBuilder
    fun setDataTable(table: DataTableSource): LineChartBuilder
    fun setDataViewDefinition(dataViewDefinition: DataViewDefinition): LineChartBuilder
    fun setDimensions(width: Integer, height: Integer): LineChartBuilder
    fun setLegendPosition(position: Position): LineChartBuilder
    fun setLegendTextStyle(textStyle: TextStyle): LineChartBuilder
    fun setOption(option: String, value: Any): LineChartBuilder
    fun setPointStyle(style: PointStyle): LineChartBuilder
    fun setRange(start: Number, end: Number): LineChartBuilder
    fun setTitle(chartTitle: String): LineChartBuilder
    fun setTitleTextStyle(textStyle: TextStyle): LineChartBuilder
    fun setXAxisTextStyle(textStyle: TextStyle): LineChartBuilder
    fun setXAxisTitle(title: String): LineChartBuilder
    fun setXAxisTitleTextStyle(textStyle: TextStyle): LineChartBuilder
    fun setYAxisTextStyle(textStyle: TextStyle): LineChartBuilder
    fun setYAxisTitle(title: String): LineChartBuilder
    fun setYAxisTitleTextStyle(textStyle: TextStyle): LineChartBuilder
    fun useLogScale(): LineChartBuilder
}

external enum class MatchType {
    EXACT,
    PREFIX,
    ANY
}

external interface NumberRangeFilterBuilder {
    fun setMaxValue(maxValue: Integer): NumberRangeFilterBuilder
    fun setMinValue(minValue: Integer): NumberRangeFilterBuilder
    fun setOrientation(orientation: Orientation): NumberRangeFilterBuilder
    fun setShowRangeValues(showRangeValues: Boolean): NumberRangeFilterBuilder
    fun setTicks(ticks: Integer): NumberRangeFilterBuilder
}

external enum class Orientation {
    HORIZONTAL,
    VERTICAL
}

external enum class PickerValuesLayout {
    ASIDE,
    BELOW,
    BELOW_WRAPPING,
    BELOW_STACKED
}

external interface PieChartBuilder {
    fun build(): Chart
    fun reverseCategories(): PieChartBuilder
    fun set3D(): PieChartBuilder
    fun setBackgroundColor(cssValue: String): PieChartBuilder
    fun setColors(cssValues: Array<String>): PieChartBuilder
    fun setDataSourceUrl(url: String): PieChartBuilder
    fun setDataTable(tableBuilder: DataTableBuilder): PieChartBuilder
    fun setDataTable(table: DataTableSource): PieChartBuilder
    fun setDataViewDefinition(dataViewDefinition: DataViewDefinition): PieChartBuilder
    fun setDimensions(width: Integer, height: Integer): PieChartBuilder
    fun setLegendPosition(position: Position): PieChartBuilder
    fun setLegendTextStyle(textStyle: TextStyle): PieChartBuilder
    fun setOption(option: String, value: Any): PieChartBuilder
    fun setTitle(chartTitle: String): PieChartBuilder
    fun setTitleTextStyle(textStyle: TextStyle): PieChartBuilder
}

external enum class PointStyle {
    NONE,
    TINY,
    MEDIUM,
    LARGE,
    HUGE
}

external enum class Position {
    TOP,
    RIGHT,
    BOTTOM,
    NONE
}

external interface ScatterChartBuilder {
    fun build(): Chart
    fun setBackgroundColor(cssValue: String): ScatterChartBuilder
    fun setColors(cssValues: Array<String>): ScatterChartBuilder
    fun setDataSourceUrl(url: String): ScatterChartBuilder
    fun setDataTable(tableBuilder: DataTableBuilder): ScatterChartBuilder
    fun setDataTable(table: DataTableSource): ScatterChartBuilder
    fun setDataViewDefinition(dataViewDefinition: DataViewDefinition): ScatterChartBuilder
    fun setDimensions(width: Integer, height: Integer): ScatterChartBuilder
    fun setLegendPosition(position: Position): ScatterChartBuilder
    fun setLegendTextStyle(textStyle: TextStyle): ScatterChartBuilder
    fun setOption(option: String, value: Any): ScatterChartBuilder
    fun setPointStyle(style: PointStyle): ScatterChartBuilder
    fun setTitle(chartTitle: String): ScatterChartBuilder
    fun setTitleTextStyle(textStyle: TextStyle): ScatterChartBuilder
    fun setXAxisLogScale(): ScatterChartBuilder
    fun setXAxisRange(start: Number, end: Number): ScatterChartBuilder
    fun setXAxisTextStyle(textStyle: TextStyle): ScatterChartBuilder
    fun setXAxisTitle(title: String): ScatterChartBuilder
    fun setXAxisTitleTextStyle(textStyle: TextStyle): ScatterChartBuilder
    fun setYAxisLogScale(): ScatterChartBuilder
    fun setYAxisRange(start: Number, end: Number): ScatterChartBuilder
    fun setYAxisTextStyle(textStyle: TextStyle): ScatterChartBuilder
    fun setYAxisTitle(title: String): ScatterChartBuilder
    fun setYAxisTitleTextStyle(textStyle: TextStyle): ScatterChartBuilder
}

external interface StringFilterBuilder {
    fun setCaseSensitive(caseSensitive: Boolean): StringFilterBuilder
    fun setMatchType(matchType: MatchType): StringFilterBuilder
    fun setRealtimeTrigger(realtimeTrigger: Boolean): StringFilterBuilder
}

external interface TableChartBuilder {
    fun build(): Chart
    fun enablePaging(enablePaging: Boolean): TableChartBuilder
    fun enablePaging(pageSize: Integer): TableChartBuilder
    fun enablePaging(pageSize: Integer, startPage: Integer): TableChartBuilder
    fun enableRtlTable(rtlEnabled: Boolean): TableChartBuilder
    fun enableSorting(enableSorting: Boolean): TableChartBuilder
    fun setDataSourceUrl(url: String): TableChartBuilder
    fun setDataTable(tableBuilder: DataTableBuilder): TableChartBuilder
    fun setDataTable(table: DataTableSource): TableChartBuilder
    fun setDataViewDefinition(dataViewDefinition: DataViewDefinition): TableChartBuilder
    fun setDimensions(width: Integer, height: Integer): TableChartBuilder
    fun setFirstRowNumber(number: Integer): TableChartBuilder
    fun setInitialSortingAscending(column: Integer): TableChartBuilder
    fun setInitialSortingDescending(column: Integer): TableChartBuilder
    fun setOption(option: String, value: Any): TableChartBuilder
    fun showRowNumberColumn(showRowNumber: Boolean): TableChartBuilder
    fun useAlternatingRowStyle(alternate: Boolean): TableChartBuilder
}

external interface TextStyle {
    fun getColor(): String
    fun getFontName(): String
    fun getFontSize(): Number
}

external interface TextStyleBuilder {
    fun build(): TextStyle
    fun setColor(cssValue: String): TextStyleBuilder
    fun setFontName(fontName: String): TextStyleBuilder
    fun setFontSize(fontSize: Number): TextStyleBuilder
}