package GoogleAppsScript.Gmail

import kotlin.js.*
import GoogleAppsScript.Integer
import GoogleAppsScript.Base.Blob
import GoogleAppsScript.Byte
import GoogleAppsScript.Base.BlobSource
import GoogleAppsScript.Base.Date

external interface GmailApp {
    fun createDraft(recipient: String, subject: String, body: String): GmailDraft
    fun createDraft(recipient: String, subject: String, body: String, options: GmailAdvancedOptions): GmailDraft
    fun createLabel(name: String): GmailLabel
    fun deleteLabel(label: GmailLabel): GmailApp
    fun getAliases(): Array<String>
    fun getChatThreads(): Array<GmailThread>
    fun getChatThreads(start: Integer, max: Integer): Array<GmailThread>
    fun getDraft(draftId: String): GmailDraft
    fun getDraftMessages(): Array<GmailMessage>
    fun getDrafts(): Array<GmailDraft>
    fun getInboxThreads(): Array<GmailThread>
    fun getInboxThreads(start: Integer, max: Integer): Array<GmailThread>
    fun getInboxUnreadCount(): Integer
    fun getMessageById(id: String): GmailMessage
    fun getMessagesForThread(thread: GmailThread): Array<GmailMessage>
    fun getMessagesForThreads(threads: Array<GmailThread>): Array<Array<GmailMessage>>
    fun getPriorityInboxThreads(): Array<GmailThread>
    fun getPriorityInboxThreads(start: Integer, max: Integer): Array<GmailThread>
    fun getPriorityInboxUnreadCount(): Integer
    fun getSpamThreads(): Array<GmailThread>
    fun getSpamThreads(start: Integer, max: Integer): Array<GmailThread>
    fun getSpamUnreadCount(): Integer
    fun getStarredThreads(): Array<GmailThread>
    fun getStarredThreads(start: Integer, max: Integer): Array<GmailThread>
    fun getStarredUnreadCount(): Integer
    fun getThreadById(id: String): GmailThread
    fun getTrashThreads(): Array<GmailThread>
    fun getTrashThreads(start: Integer, max: Integer): Array<GmailThread>
    fun getUserLabelByName(name: String): GmailLabel
    fun getUserLabels(): Array<GmailLabel>
    fun markMessageRead(message: GmailMessage): GmailApp
    fun markMessageUnread(message: GmailMessage): GmailApp
    fun markMessagesRead(messages: Array<GmailMessage>): GmailApp
    fun markMessagesUnread(messages: Array<GmailMessage>): GmailApp
    fun markThreadImportant(thread: GmailThread): GmailApp
    fun markThreadRead(thread: GmailThread): GmailApp
    fun markThreadUnimportant(thread: GmailThread): GmailApp
    fun markThreadUnread(thread: GmailThread): GmailApp
    fun markThreadsImportant(threads: Array<GmailThread>): GmailApp
    fun markThreadsRead(threads: Array<GmailThread>): GmailApp
    fun markThreadsUnimportant(threads: Array<GmailThread>): GmailApp
    fun markThreadsUnread(threads: Array<GmailThread>): GmailApp
    fun moveMessageToTrash(message: GmailMessage): GmailApp
    fun moveMessagesToTrash(messages: Array<GmailMessage>): GmailApp
    fun moveThreadToArchive(thread: GmailThread): GmailApp
    fun moveThreadToInbox(thread: GmailThread): GmailApp
    fun moveThreadToSpam(thread: GmailThread): GmailApp
    fun moveThreadToTrash(thread: GmailThread): GmailApp
    fun moveThreadsToArchive(threads: Array<GmailThread>): GmailApp
    fun moveThreadsToInbox(threads: Array<GmailThread>): GmailApp
    fun moveThreadsToSpam(threads: Array<GmailThread>): GmailApp
    fun moveThreadsToTrash(threads: Array<GmailThread>): GmailApp
    fun refreshMessage(message: GmailMessage): GmailApp
    fun refreshMessages(messages: Array<GmailMessage>): GmailApp
    fun refreshThread(thread: GmailThread): GmailApp
    fun refreshThreads(threads: Array<GmailThread>): GmailApp
    fun search(query: String): Array<GmailThread>
    fun search(query: String, start: Integer, max: Integer): Array<GmailThread>
    fun sendEmail(recipient: String, subject: String, body: String): GmailApp
    fun sendEmail(recipient: String, subject: String, body: String, options: GmailAdvancedOptions): GmailApp
    fun setCurrentMessageAccessToken(accessToken: String)
    fun starMessage(message: GmailMessage): GmailApp
    fun starMessages(messages: Array<GmailMessage>): GmailApp
    fun unstarMessage(message: GmailMessage): GmailApp
    fun unstarMessages(messages: Array<GmailMessage>): GmailApp
}

external interface GmailAttachment {
    fun copyBlob(): Blob
    fun getAs(contentType: String): Blob
    fun getBytes(): Array<Byte>
    fun getContentType(): String
    fun getDataAsString(): String
    fun getDataAsString(charset: String): String
    fun getHash(): String
    fun getName(): String
    fun getSize(): Integer
    fun isGoogleType(): Boolean
    fun setBytes(data: Array<Byte>): Blob
    fun setContentType(contentType: String): Blob
    fun setContentTypeFromExtension(): Blob
    fun setDataFromString(string: String): Blob
    fun setDataFromString(string: String, charset: String): Blob
    fun setName(name: String): Blob
    fun getAllBlobs(): Array<Blob>
}

external interface GmailDraft {
    fun deleteDraft()
    fun getId(): String
    fun getMessage(): GmailMessage
    fun getMessageId(): String
    fun send(): GmailMessage
    fun update(recipient: String, subject: String, body: String): GmailDraft
    fun update(recipient: String, subject: String, body: String, options: GmailAdvancedOptions): GmailDraft
}

external interface `T$0` {
    @nativeGetter
    operator fun get(imageKey: String): BlobSource?
    @nativeSetter
    operator fun set(imageKey: String, value: BlobSource)
}

external interface GmailAdvancedOptions {
    var attachments: Array<BlobSource>?
        get() = definedExternally
        set(value) = definedExternally
    var bcc: String?
        get() = definedExternally
        set(value) = definedExternally
    var cc: String?
        get() = definedExternally
        set(value) = definedExternally
    var from: String?
        get() = definedExternally
        set(value) = definedExternally
    var htmlBody: String?
        get() = definedExternally
        set(value) = definedExternally
    var inlineImages: `T$0`?
        get() = definedExternally
        set(value) = definedExternally
    var name: String?
        get() = definedExternally
        set(value) = definedExternally
    var noReply: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var replyTo: String?
        get() = definedExternally
        set(value) = definedExternally
}

typealias GmailDraftOptions = GmailAdvancedOptions

external interface GmailAttachmentOptions {
    var includeInlineImages: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var includeAttachments: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface GmailLabel {
    fun addToThread(thread: GmailThread): GmailLabel
    fun addToThreads(threads: Array<GmailThread>): GmailLabel
    fun deleteLabel()
    fun getName(): String
    fun getThreads(): Array<GmailThread>
    fun getThreads(start: Integer, max: Integer): Array<GmailThread>
    fun getUnreadCount(): Integer
    fun removeFromThread(thread: GmailThread): GmailLabel
    fun removeFromThreads(threads: Array<GmailThread>): GmailLabel
}

external interface GmailMessage {
    fun createDraftReply(body: String): GmailDraft
    fun createDraftReply(body: String, options: GmailAdvancedOptions): GmailDraft
    fun createDraftReplyAll(body: String): GmailDraft
    fun createDraftReplyAll(body: String, options: GmailAdvancedOptions): GmailDraft
    fun forward(recipient: String): GmailMessage
    fun forward(recipient: String, options: GmailAdvancedOptions): GmailMessage
    fun getAttachments(): Array<GmailAttachment>
    fun getAttachments(options: GmailAttachmentOptions): Array<GmailAttachment>
    fun getBcc(): String
    fun getBody(): String
    fun getCc(): String
    fun getDate(): Date
    fun getFrom(): String
    fun getHeader(name: String): String
    fun getId(): String
    fun getPlainBody(): String
    fun getRawContent(): String
    fun getReplyTo(): String
    fun getSubject(): String
    fun getThread(): GmailThread
    fun getTo(): String
    fun isDraft(): Boolean
    fun isInChats(): Boolean
    fun isInInbox(): Boolean
    fun isInPriorityInbox(): Boolean
    fun isInTrash(): Boolean
    fun isStarred(): Boolean
    fun isUnread(): Boolean
    fun markRead(): GmailMessage
    fun markUnread(): GmailMessage
    fun moveToTrash(): GmailMessage
    fun refresh(): GmailMessage
    fun reply(body: String): GmailMessage
    fun reply(body: String, options: GmailAdvancedOptions): GmailMessage
    fun replyAll(body: String): GmailMessage
    fun replyAll(body: String, options: GmailAdvancedOptions): GmailMessage
    fun star(): GmailMessage
    fun unstar(): GmailMessage
}

external interface GmailThread {
    fun addLabel(label: GmailLabel): GmailThread
    fun createDraftReply(body: String): GmailDraft
    fun createDraftReply(body: String, options: GmailAdvancedOptions): GmailDraft
    fun createDraftReplyAll(body: String): GmailDraft
    fun createDraftReplyAll(body: String, options: GmailAdvancedOptions): GmailDraft
    fun getFirstMessageSubject(): String
    fun getId(): String
    fun getLabels(): Array<GmailLabel>
    fun getLastMessageDate(): Date
    fun getMessageCount(): Integer
    fun getMessages(): Array<GmailMessage>
    fun getPermalink(): String
    fun hasStarredMessages(): Boolean
    fun isImportant(): Boolean
    fun isInChats(): Boolean
    fun isInInbox(): Boolean
    fun isInPriorityInbox(): Boolean
    fun isInSpam(): Boolean
    fun isInTrash(): Boolean
    fun isUnread(): Boolean
    fun markImportant(): GmailThread
    fun markRead(): GmailThread
    fun markUnimportant(): GmailThread
    fun markUnread(): GmailThread
    fun moveToArchive(): GmailThread
    fun moveToInbox(): GmailThread
    fun moveToSpam(): GmailThread
    fun moveToTrash(): GmailThread
    fun refresh(): GmailThread
    fun removeLabel(label: GmailLabel): GmailThread
    fun reply(body: String): GmailThread
    fun reply(body: String, options: GmailAdvancedOptions): GmailThread
    fun replyAll(body: String): GmailThread
    fun replyAll(body: String, options: GmailAdvancedOptions): GmailThread
}