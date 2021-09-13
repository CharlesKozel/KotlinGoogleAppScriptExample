package GoogleAppsScript.Base

import kotlin.js.*
import GoogleAppsScript.Byte
import GoogleAppsScript.HTML.HtmlOutput
import GoogleAppsScript.Integer

external interface Blob : BlobSource {
    fun copyBlob(): Blob
    override fun getAs(contentType: String): Blob
    fun getBytes(): Array<Byte>
    fun getContentType(): String
    fun getDataAsString(): String
    fun getDataAsString(charset: String): String
    fun getName(): String
    fun isGoogleType(): Boolean
    fun setBytes(data: Array<Byte>): Blob
    fun setContentType(contentType: String): Blob
    fun setContentTypeFromExtension(): Blob
    fun setDataFromString(string: String): Blob
    fun setDataFromString(string: String, charset: String): Blob
    fun setName(name: String): Blob
    fun getAllBlobs(): Array<Blob>
}

external interface BlobSource {
    fun getAs(contentType: String): Blob
    fun getBlob(): Blob
}


external interface Browser {
    var Buttons: Any
    fun inputBox(prompt: String): String
    fun inputBox(prompt: String, buttons: ButtonSet): String
    fun inputBox(title: String, prompt: String, buttons: ButtonSet): String
    fun msgBox(prompt: String): String
    fun msgBox(prompt: String, buttons: ButtonSet): String
    fun msgBox(title: String, prompt: String, buttons: ButtonSet): String
}

external enum class Button {
    CLOSE,
    OK,
    CANCEL,
    YES,
    NO
}

external enum class ButtonSet {
    OK,
    OK_CANCEL,
    YES_NO,
    YES_NO_CANCEL
}

external enum class ColorType {
    UNSUPPORTED,
    RGB,
    THEME
}

external interface Logger {
    fun clear()
    fun getLog(): String
    fun log(data: Any): Logger
    fun log(format: String, vararg values: Any): Logger
}

external interface Menu {
    fun addItem(caption: String, functionName: String): Menu
    fun addSeparator(): Menu
    fun addSubMenu(menu: Menu): Menu
    fun addToUi()
}

external enum class MimeType {
    GOOGLE_APPS_SCRIPT,
    GOOGLE_DRAWINGS,
    GOOGLE_DOCS,
    GOOGLE_FORMS,
    GOOGLE_SHEETS,
    GOOGLE_SITES,
    GOOGLE_SLIDES,
    FOLDER,
    BMP,
    GIF,
    JPEG,
    PNG,
    SVG,
    PDF,
    CSS,
    CSV,
    HTML,
    JAVASCRIPT,
    PLAIN_TEXT,
    RTF,
    OPENDOCUMENT_GRAPHICS,
    OPENDOCUMENT_PRESENTATION,
    OPENDOCUMENT_SPREADSHEET,
    OPENDOCUMENT_TEXT,
    MICROSOFT_EXCEL,
    MICROSOFT_EXCEL_LEGACY,
    MICROSOFT_POWERPOINT,
    MICROSOFT_POWERPOINT_LEGACY,
    MICROSOFT_WORD,
    MICROSOFT_WORD_LEGACY,
    ZIP
}

external enum class Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER
}

external interface PromptResponse {
    fun getResponseText(): String
    fun getSelectedButton(): Button
}

external interface RgbColor {
    fun asHexString(): String
    fun getBlue(): Integer
    fun getColorType(): ColorType
    fun getGreen(): Integer
    fun getRed(): Integer
}

external interface Session {
    fun getActiveUser(): User
    fun getActiveUserLocale(): String
    fun getEffectiveUser(): User
    fun getScriptTimeZone(): String
    fun getTemporaryActiveUserKey(): String
    fun getTimeZone(): String
    fun getUser(): User
}

external interface Ui {
    var Button: Any
    var ButtonSet: Any
    fun alert(prompt: String): Button
    fun alert(prompt: String, buttons: ButtonSet): Button
    fun alert(title: String, prompt: String, buttons: ButtonSet): Button
    fun createAddonMenu(): Menu
    fun createMenu(caption: String): Menu
    fun prompt(prompt: String): PromptResponse
    fun prompt(prompt: String, buttons: ButtonSet): PromptResponse
    fun prompt(title: String, prompt: String, buttons: ButtonSet): PromptResponse
    fun showModalDialog(userInterface: HtmlOutput, title: String)
    fun showModelessDialog(userInterface: HtmlOutput, title: String)
    fun showSidebar(userInterface: HtmlOutput)
    fun showDialog(userInterface: HtmlOutput)
}

external interface User {
    fun getEmail(): String
    fun getUserLoginId(): String
}

external enum class Weekday {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
}

external interface console {
    fun error()
    fun error(formatOrObject: Any?, vararg values: Any)
    fun error(formatOrObject: String?, vararg values: Any)
    fun info()
    fun info(formatOrObject: Any?, vararg values: Any)
    fun info(formatOrObject: String?, vararg values: Any)
    fun log()
    fun log(formatOrObject: Any?, vararg values: Any)
    fun log(formatOrObject: String?, vararg values: Any)
    fun time(label: String)
    fun timeEnd(label: String)
    fun warn()
    fun warn(formatOrObject: Any?, vararg values: Any)
    fun warn(formatOrObject: String?, vararg values: Any)
}

@Suppress("EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
external interface Date {
    override fun toString(): String
    fun toDateString(): String
    fun toTimeString(): String
    fun toLocaleString(): String
    fun toLocaleDateString(): String
    fun toLocaleTimeString(): String
    fun valueOf(): Number
    fun getTime(): Number
    fun getFullYear(): Number
    fun getUTCFullYear(): Number
    fun getMonth(): Number
    fun getUTCMonth(): Number
    fun getDate(): Number
    fun getUTCDate(): Number
    fun getDay(): Number
    fun getUTCDay(): Number
    fun getHours(): Number
    fun getUTCHours(): Number
    fun getMinutes(): Number
    fun getUTCMinutes(): Number
    fun getSeconds(): Number
    fun getUTCSeconds(): Number
    fun getMilliseconds(): Number
    fun getUTCMilliseconds(): Number
    fun getTimezoneOffset(): Number
    fun setTime(time: Number): Number
    fun setMilliseconds(ms: Number): Number
    fun setUTCMilliseconds(ms: Number): Number
    fun setSeconds(sec: Number, ms: Number = definedExternally): Number
    fun setUTCSeconds(sec: Number, ms: Number = definedExternally): Number
    fun setMinutes(min: Number, sec: Number = definedExternally, ms: Number = definedExternally): Number
    fun setUTCMinutes(min: Number, sec: Number = definedExternally, ms: Number = definedExternally): Number
    fun setHours(hours: Number, min: Number = definedExternally, sec: Number = definedExternally, ms: Number = definedExternally): Number
    fun setUTCHours(hours: Number, min: Number = definedExternally, sec: Number = definedExternally, ms: Number = definedExternally): Number
    fun setDate(date: Number): Number
    fun setUTCDate(date: Number): Number
    fun setMonth(month: Number, date: Number = definedExternally): Number
    fun setUTCMonth(month: Number, date: Number = definedExternally): Number
    fun setFullYear(year: Number, month: Number = definedExternally, date: Number = definedExternally): Number
    fun setUTCFullYear(year: Number, month: Number = definedExternally, date: Number = definedExternally): Number
    fun toUTCString(): String
    fun toISOString(): String
    fun toJSON(key: Any = definedExternally): String

    companion object : DateConstructor by definedExternally
}

external interface DateConstructor {
    @nativeInvoke
    operator fun invoke(): String
    var prototype: Date
    fun parse(s: String): Number
    fun UTC(year: Number, month: Number, date: Number = definedExternally, hours: Number = definedExternally, minutes: Number = definedExternally, seconds: Number = definedExternally, ms: Number = definedExternally): Number
    fun now(): Number
}