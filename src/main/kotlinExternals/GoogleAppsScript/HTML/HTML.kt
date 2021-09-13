package GoogleAppsScript.HTML

import kotlin.js.*
import GoogleAppsScript.Base.Blob
import GoogleAppsScript.Integer
import GoogleAppsScript.Base.BlobSource

external interface HtmlOutput {
    fun addMetaTag(name: String, content: String): HtmlOutput
    fun append(addedContent: String): HtmlOutput
    fun appendUntrusted(addedContent: String): HtmlOutput
    fun asTemplate(): HtmlTemplate
    fun clear(): HtmlOutput
    fun getAs(contentType: String): Blob
    fun getBlob(): Blob
    fun getContent(): String
    fun getFaviconUrl(): String
    fun getHeight(): Integer
    fun getMetaTags(): Array<HtmlOutputMetaTag>
    fun getTitle(): String
    fun getWidth(): Integer
    fun setContent(content: String): HtmlOutput
    fun setFaviconUrl(iconUrl: String): HtmlOutput
    fun setHeight(height: Integer): HtmlOutput
    fun setSandboxMode(mode: SandboxMode): HtmlOutput
    fun setTitle(title: String): HtmlOutput
    fun setWidth(width: Integer): HtmlOutput
    fun setXFrameOptionsMode(mode: XFrameOptionsMode): HtmlOutput
}

external interface HtmlOutputMetaTag {
    fun getContent(): String
    fun getName(): String
}

external interface HtmlService {
    var SandboxMode: Any
    var XFrameOptionsMode: Any
    fun createHtmlOutput(): HtmlOutput
    fun createHtmlOutput(blob: BlobSource): HtmlOutput
    fun createHtmlOutput(html: String): HtmlOutput
    fun createHtmlOutputFromFile(filename: String): HtmlOutput
    fun createTemplate(blob: BlobSource): HtmlTemplate
    fun createTemplate(html: String): HtmlTemplate
    fun createTemplateFromFile(filename: String): HtmlTemplate
    fun getUserAgent(): String
}

external interface HtmlTemplate {
    fun evaluate(): HtmlOutput
    fun getCode(): String
    fun getCodeWithComments(): String
    fun getRawContent(): String
    @nativeGetter
    operator fun get(propName: String): Any?
    @nativeSetter
    operator fun set(propName: String, value: Any)
}

external enum class SandboxMode {
    EMULATED,
    IFRAME,
    NATIVE
}

external enum class XFrameOptionsMode {
    ALLOWALL,
    DEFAULT
}