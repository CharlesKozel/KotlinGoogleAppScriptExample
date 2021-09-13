package GoogleAppsScript.GmailApi

external interface Gmail_Collection_Users_Messages_AttachmentsCollection {
    fun get(userId: String, messageId: String, id: String): Gmail_Schema_MessagePartBody
}

external interface Gmail_Collection_Users_Settings_Sendas_SmimeInfoCollection {
    fun get(userId: String, sendAsEmail: String, id: String): Gmail_Schema_SmimeInfo
    fun insert(resource: Gmail_Schema_SmimeInfo, userId: String, sendAsEmail: String): Gmail_Schema_SmimeInfo
    fun list(userId: String, sendAsEmail: String): Gmail_Schema_ListSmimeInfoResponse
    fun remove(userId: String, sendAsEmail: String, id: String)
    fun setDefault(userId: String, sendAsEmail: String, id: String)
}

external interface Gmail_Collection_Users_Settings_DelegatesCollection {
    fun create(resource: Gmail_Schema_Delegate, userId: String): Gmail_Schema_Delegate
    fun get(userId: String, delegateEmail: String): Gmail_Schema_Delegate
    fun list(userId: String): Gmail_Schema_ListDelegatesResponse
    fun remove(userId: String, delegateEmail: String)
}

external interface Gmail_Collection_Users_Settings_FiltersCollection {
    fun create(resource: Gmail_Schema_Filter, userId: String): Gmail_Schema_Filter
    fun get(userId: String, id: String): Gmail_Schema_Filter
    fun list(userId: String): Gmail_Schema_ListFiltersResponse
    fun remove(userId: String, id: String)
}

external interface Gmail_Collection_Users_Settings_ForwardingAddressesCollection {
    fun create(resource: Gmail_Schema_ForwardingAddress, userId: String): Gmail_Schema_ForwardingAddress
    fun get(userId: String, forwardingEmail: String): Gmail_Schema_ForwardingAddress
    fun list(userId: String): Gmail_Schema_ListForwardingAddressesResponse
    fun remove(userId: String, forwardingEmail: String)
}

external interface Gmail_Collection_Users_Settings_SendAsCollection {
    var SmimeInfo: Gmail_Collection_Users_Settings_Sendas_SmimeInfoCollection?
        get() = definedExternally
        set(value) = definedExternally
    fun create(resource: Gmail_Schema_SendAs, userId: String): Gmail_Schema_SendAs
    fun get(userId: String, sendAsEmail: String): Gmail_Schema_SendAs
    fun list(userId: String): Gmail_Schema_ListSendAsResponse
    fun patch(resource: Gmail_Schema_SendAs, userId: String, sendAsEmail: String): Gmail_Schema_SendAs
    fun remove(userId: String, sendAsEmail: String)
    fun update(resource: Gmail_Schema_SendAs, userId: String, sendAsEmail: String): Gmail_Schema_SendAs
    fun verify(userId: String, sendAsEmail: String)
}

external interface Gmail_Collection_Users_DraftsCollection {
    fun create(resource: Gmail_Schema_Draft, userId: String): Gmail_Schema_Draft
    fun create(resource: Gmail_Schema_Draft, userId: String, mediaData: Any): Gmail_Schema_Draft
    fun get(userId: String, id: String): Gmail_Schema_Draft
    fun get(userId: String, id: String, optionalArgs: Any?): Gmail_Schema_Draft
    fun list(userId: String): Gmail_Schema_ListDraftsResponse
    fun list(userId: String, optionalArgs: Any?): Gmail_Schema_ListDraftsResponse
    fun remove(userId: String, id: String)
    fun send(resource: Gmail_Schema_Draft, userId: String): Gmail_Schema_Message
    fun send(resource: Gmail_Schema_Draft, userId: String, mediaData: Any): Gmail_Schema_Message
    fun update(resource: Gmail_Schema_Draft, userId: String, id: String): Gmail_Schema_Draft
    fun update(resource: Gmail_Schema_Draft, userId: String, id: String, mediaData: Any): Gmail_Schema_Draft
}

external interface Gmail_Collection_Users_HistoryCollection {
    fun list(userId: String): Gmail_Schema_ListHistoryResponse
    fun list(userId: String, optionalArgs: Any?): Gmail_Schema_ListHistoryResponse
}

external interface Gmail_Collection_Users_LabelsCollection {
    fun create(resource: Gmail_Schema_Label, userId: String): Gmail_Schema_Label
    fun get(userId: String, id: String): Gmail_Schema_Label
    fun list(userId: String): Gmail_Schema_ListLabelsResponse
    fun patch(resource: Gmail_Schema_Label, userId: String, id: String): Gmail_Schema_Label
    fun remove(userId: String, id: String)
    fun update(resource: Gmail_Schema_Label, userId: String, id: String): Gmail_Schema_Label
}

external interface Gmail_Collection_Users_MessagesCollection {
    var Attachments: Gmail_Collection_Users_Messages_AttachmentsCollection?
        get() = definedExternally
        set(value) = definedExternally
    fun batchDelete(resource: Gmail_Schema_BatchDeleteMessagesRequest, userId: String)
    fun batchModify(resource: Gmail_Schema_BatchModifyMessagesRequest, userId: String)
    fun get(userId: String, id: String): Gmail_Schema_Message
    fun get(userId: String, id: String, optionalArgs: Any?): Gmail_Schema_Message
    fun import(resource: Gmail_Schema_Message, userId: String): Gmail_Schema_Message
    fun import(resource: Gmail_Schema_Message, userId: String, mediaData: Any): Gmail_Schema_Message
    fun import(resource: Gmail_Schema_Message, userId: String, mediaData: Any, optionalArgs: Any?): Gmail_Schema_Message
    fun insert(resource: Gmail_Schema_Message, userId: String): Gmail_Schema_Message
    fun insert(resource: Gmail_Schema_Message, userId: String, mediaData: Any): Gmail_Schema_Message
    fun insert(resource: Gmail_Schema_Message, userId: String, mediaData: Any, optionalArgs: Any?): Gmail_Schema_Message
    fun list(userId: String): Gmail_Schema_ListMessagesResponse
    fun list(userId: String, optionalArgs: Any?): Gmail_Schema_ListMessagesResponse
    fun modify(resource: Gmail_Schema_ModifyMessageRequest, userId: String, id: String): Gmail_Schema_Message
    fun remove(userId: String, id: String)
    fun send(resource: Gmail_Schema_Message, userId: String): Gmail_Schema_Message
    fun send(resource: Gmail_Schema_Message, userId: String, mediaData: Any): Gmail_Schema_Message
    fun trash(userId: String, id: String): Gmail_Schema_Message
    fun untrash(userId: String, id: String): Gmail_Schema_Message
}

external interface Gmail_Collection_Users_SettingsCollection {
    var Delegates: Gmail_Collection_Users_Settings_DelegatesCollection?
        get() = definedExternally
        set(value) = definedExternally
    var Filters: Gmail_Collection_Users_Settings_FiltersCollection?
        get() = definedExternally
        set(value) = definedExternally
    var ForwardingAddresses: Gmail_Collection_Users_Settings_ForwardingAddressesCollection?
        get() = definedExternally
        set(value) = definedExternally
    var SendAs: Gmail_Collection_Users_Settings_SendAsCollection?
        get() = definedExternally
        set(value) = definedExternally
    fun getAutoForwarding(userId: String): Gmail_Schema_AutoForwarding
    fun getImap(userId: String): Gmail_Schema_ImapSettings
    fun getPop(userId: String): Gmail_Schema_PopSettings
    fun getVacation(userId: String): Gmail_Schema_VacationSettings
    fun updateAutoForwarding(resource: Gmail_Schema_AutoForwarding, userId: String): Gmail_Schema_AutoForwarding
    fun updateImap(resource: Gmail_Schema_ImapSettings, userId: String): Gmail_Schema_ImapSettings
    fun updatePop(resource: Gmail_Schema_PopSettings, userId: String): Gmail_Schema_PopSettings
    fun updateVacation(resource: Gmail_Schema_VacationSettings, userId: String): Gmail_Schema_VacationSettings
}

external interface Gmail_Collection_Users_ThreadsCollection {
    fun get(userId: String, id: String): Gmail_Schema_Thread
    fun get(userId: String, id: String, optionalArgs: Any?): Gmail_Schema_Thread
    fun list(userId: String): Gmail_Schema_ListThreadsResponse
    fun list(userId: String, optionalArgs: Any?): Gmail_Schema_ListThreadsResponse
    fun modify(resource: Gmail_Schema_ModifyThreadRequest, userId: String, id: String): Gmail_Schema_Thread
    fun remove(userId: String, id: String)
    fun trash(userId: String, id: String): Gmail_Schema_Thread
    fun untrash(userId: String, id: String): Gmail_Schema_Thread
}

external interface Gmail_Collection_UsersCollection {
    var Drafts: Gmail_Collection_Users_DraftsCollection?
        get() = definedExternally
        set(value) = definedExternally
    var History: Gmail_Collection_Users_HistoryCollection?
        get() = definedExternally
        set(value) = definedExternally
    var Labels: Gmail_Collection_Users_LabelsCollection?
        get() = definedExternally
        set(value) = definedExternally
    var Messages: Gmail_Collection_Users_MessagesCollection?
        get() = definedExternally
        set(value) = definedExternally
    var Settings: Gmail_Collection_Users_SettingsCollection?
        get() = definedExternally
        set(value) = definedExternally
    var Threads: Gmail_Collection_Users_ThreadsCollection?
        get() = definedExternally
        set(value) = definedExternally
    fun getProfile(userId: String): Gmail_Schema_Profile
    fun stop(userId: String)
    fun watch(resource: Gmail_Schema_WatchRequest, userId: String): Gmail_Schema_WatchResponse
}

external interface Gmail_Schema_AutoForwarding {
    var disposition: String?
        get() = definedExternally
        set(value) = definedExternally
    var emailAddress: String?
        get() = definedExternally
        set(value) = definedExternally
    var enabled: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Gmail_Schema_BatchDeleteMessagesRequest {
    var ids: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Gmail_Schema_BatchModifyMessagesRequest {
    var addLabelIds: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var ids: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var removeLabelIds: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Gmail_Schema_Delegate {
    var delegateEmail: String?
        get() = definedExternally
        set(value) = definedExternally
    var verificationStatus: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Gmail_Schema_Draft {
    var id: String?
        get() = definedExternally
        set(value) = definedExternally
    var message: Gmail_Schema_Message?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Gmail_Schema_Filter {
    var action: Gmail_Schema_FilterAction?
        get() = definedExternally
        set(value) = definedExternally
    var criteria: Gmail_Schema_FilterCriteria?
        get() = definedExternally
        set(value) = definedExternally
    var id: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Gmail_Schema_FilterAction {
    var addLabelIds: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var forward: String?
        get() = definedExternally
        set(value) = definedExternally
    var removeLabelIds: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Gmail_Schema_FilterCriteria {
    var excludeChats: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var from: String?
        get() = definedExternally
        set(value) = definedExternally
    var hasAttachment: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var negatedQuery: String?
        get() = definedExternally
        set(value) = definedExternally
    var query: String?
        get() = definedExternally
        set(value) = definedExternally
    var size: Number?
        get() = definedExternally
        set(value) = definedExternally
    var sizeComparison: String?
        get() = definedExternally
        set(value) = definedExternally
    var subject: String?
        get() = definedExternally
        set(value) = definedExternally
    var to: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Gmail_Schema_ForwardingAddress {
    var forwardingEmail: String?
        get() = definedExternally
        set(value) = definedExternally
    var verificationStatus: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Gmail_Schema_History {
    var id: String?
        get() = definedExternally
        set(value) = definedExternally
    var labelsAdded: Array<Gmail_Schema_HistoryLabelAdded>?
        get() = definedExternally
        set(value) = definedExternally
    var labelsRemoved: Array<Gmail_Schema_HistoryLabelRemoved>?
        get() = definedExternally
        set(value) = definedExternally
    var messages: Array<Gmail_Schema_Message>?
        get() = definedExternally
        set(value) = definedExternally
    var messagesAdded: Array<Gmail_Schema_HistoryMessageAdded>?
        get() = definedExternally
        set(value) = definedExternally
    var messagesDeleted: Array<Gmail_Schema_HistoryMessageDeleted>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Gmail_Schema_HistoryLabelAdded {
    var labelIds: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var message: Gmail_Schema_Message?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Gmail_Schema_HistoryLabelRemoved {
    var labelIds: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var message: Gmail_Schema_Message?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Gmail_Schema_HistoryMessageAdded {
    var message: Gmail_Schema_Message?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Gmail_Schema_HistoryMessageDeleted {
    var message: Gmail_Schema_Message?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Gmail_Schema_ImapSettings {
    var autoExpunge: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var enabled: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var expungeBehavior: String?
        get() = definedExternally
        set(value) = definedExternally
    var maxFolderSize: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Gmail_Schema_Label {
    var color: Gmail_Schema_LabelColor?
        get() = definedExternally
        set(value) = definedExternally
    var id: String?
        get() = definedExternally
        set(value) = definedExternally
    var labelListVisibility: String?
        get() = definedExternally
        set(value) = definedExternally
    var messageListVisibility: String?
        get() = definedExternally
        set(value) = definedExternally
    var messagesTotal: Number?
        get() = definedExternally
        set(value) = definedExternally
    var messagesUnread: Number?
        get() = definedExternally
        set(value) = definedExternally
    var name: String?
        get() = definedExternally
        set(value) = definedExternally
    var threadsTotal: Number?
        get() = definedExternally
        set(value) = definedExternally
    var threadsUnread: Number?
        get() = definedExternally
        set(value) = definedExternally
    var type: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Gmail_Schema_LabelColor {
    var backgroundColor: String?
        get() = definedExternally
        set(value) = definedExternally
    var textColor: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Gmail_Schema_ListDelegatesResponse {
    var delegates: Array<Gmail_Schema_Delegate>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Gmail_Schema_ListDraftsResponse {
    var drafts: Array<Gmail_Schema_Draft>?
        get() = definedExternally
        set(value) = definedExternally
    var nextPageToken: String?
        get() = definedExternally
        set(value) = definedExternally
    var resultSizeEstimate: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Gmail_Schema_ListFiltersResponse {
    var filter: Array<Gmail_Schema_Filter>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Gmail_Schema_ListForwardingAddressesResponse {
    var forwardingAddresses: Array<Gmail_Schema_ForwardingAddress>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Gmail_Schema_ListHistoryResponse {
    var history: Array<Gmail_Schema_History>?
        get() = definedExternally
        set(value) = definedExternally
    var historyId: String?
        get() = definedExternally
        set(value) = definedExternally
    var nextPageToken: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Gmail_Schema_ListLabelsResponse {
    var labels: Array<Gmail_Schema_Label>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Gmail_Schema_ListMessagesResponse {
    var messages: Array<Gmail_Schema_Message>?
        get() = definedExternally
        set(value) = definedExternally
    var nextPageToken: String?
        get() = definedExternally
        set(value) = definedExternally
    var resultSizeEstimate: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Gmail_Schema_ListSendAsResponse {
    var sendAs: Array<Gmail_Schema_SendAs>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Gmail_Schema_ListSmimeInfoResponse {
    var smimeInfo: Array<Gmail_Schema_SmimeInfo>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Gmail_Schema_ListThreadsResponse {
    var nextPageToken: String?
        get() = definedExternally
        set(value) = definedExternally
    var resultSizeEstimate: Number?
        get() = definedExternally
        set(value) = definedExternally
    var threads: Array<Gmail_Schema_Thread>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Gmail_Schema_Message {
    var historyId: String?
        get() = definedExternally
        set(value) = definedExternally
    var id: String?
        get() = definedExternally
        set(value) = definedExternally
    var internalDate: String?
        get() = definedExternally
        set(value) = definedExternally
    var labelIds: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var payload: Gmail_Schema_MessagePart?
        get() = definedExternally
        set(value) = definedExternally
    var raw: String?
        get() = definedExternally
        set(value) = definedExternally
    var sizeEstimate: Number?
        get() = definedExternally
        set(value) = definedExternally
    var snippet: String?
        get() = definedExternally
        set(value) = definedExternally
    var threadId: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Gmail_Schema_MessagePart {
    var body: Gmail_Schema_MessagePartBody?
        get() = definedExternally
        set(value) = definedExternally
    var filename: String?
        get() = definedExternally
        set(value) = definedExternally
    var headers: Array<Gmail_Schema_MessagePartHeader>?
        get() = definedExternally
        set(value) = definedExternally
    var mimeType: String?
        get() = definedExternally
        set(value) = definedExternally
    var partId: String?
        get() = definedExternally
        set(value) = definedExternally
    var parts: Array<Gmail_Schema_MessagePart>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Gmail_Schema_MessagePartBody {
    var attachmentId: String?
        get() = definedExternally
        set(value) = definedExternally
    var data: String?
        get() = definedExternally
        set(value) = definedExternally
    var size: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Gmail_Schema_MessagePartHeader {
    var name: String?
        get() = definedExternally
        set(value) = definedExternally
    var value: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Gmail_Schema_ModifyMessageRequest {
    var addLabelIds: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var removeLabelIds: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Gmail_Schema_ModifyThreadRequest {
    var addLabelIds: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var removeLabelIds: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Gmail_Schema_PopSettings {
    var accessWindow: String?
        get() = definedExternally
        set(value) = definedExternally
    var disposition: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Gmail_Schema_Profile {
    var emailAddress: String?
        get() = definedExternally
        set(value) = definedExternally
    var historyId: String?
        get() = definedExternally
        set(value) = definedExternally
    var messagesTotal: Number?
        get() = definedExternally
        set(value) = definedExternally
    var threadsTotal: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Gmail_Schema_SendAs {
    var displayName: String?
        get() = definedExternally
        set(value) = definedExternally
    var isDefault: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var isPrimary: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var replyToAddress: String?
        get() = definedExternally
        set(value) = definedExternally
    var sendAsEmail: String?
        get() = definedExternally
        set(value) = definedExternally
    var signature: String?
        get() = definedExternally
        set(value) = definedExternally
    var smtpMsa: Gmail_Schema_SmtpMsa?
        get() = definedExternally
        set(value) = definedExternally
    var treatAsAlias: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var verificationStatus: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Gmail_Schema_SmimeInfo {
    var encryptedKeyPassword: String?
        get() = definedExternally
        set(value) = definedExternally
    var expiration: String?
        get() = definedExternally
        set(value) = definedExternally
    var id: String?
        get() = definedExternally
        set(value) = definedExternally
    var isDefault: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var issuerCn: String?
        get() = definedExternally
        set(value) = definedExternally
    var pem: String?
        get() = definedExternally
        set(value) = definedExternally
    var pkcs12: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Gmail_Schema_SmtpMsa {
    var host: String?
        get() = definedExternally
        set(value) = definedExternally
    var password: String?
        get() = definedExternally
        set(value) = definedExternally
    var port: Number?
        get() = definedExternally
        set(value) = definedExternally
    var securityMode: String?
        get() = definedExternally
        set(value) = definedExternally
    var username: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Gmail_Schema_Thread {
    var historyId: String?
        get() = definedExternally
        set(value) = definedExternally
    var id: String?
        get() = definedExternally
        set(value) = definedExternally
    var messages: Array<Gmail_Schema_Message>?
        get() = definedExternally
        set(value) = definedExternally
    var snippet: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Gmail_Schema_VacationSettings {
    var enableAutoReply: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var endTime: String?
        get() = definedExternally
        set(value) = definedExternally
    var responseBodyHtml: String?
        get() = definedExternally
        set(value) = definedExternally
    var responseBodyPlainText: String?
        get() = definedExternally
        set(value) = definedExternally
    var responseSubject: String?
        get() = definedExternally
        set(value) = definedExternally
    var restrictToContacts: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var restrictToDomain: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var startTime: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Gmail_Schema_WatchRequest {
    var labelFilterAction: String?
        get() = definedExternally
        set(value) = definedExternally
    var labelIds: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var topicName: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Gmail_Schema_WatchResponse {
    var expiration: String?
        get() = definedExternally
        set(value) = definedExternally
    var historyId: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Gmail {
    var Users: Gmail_Collection_UsersCollection?
        get() = definedExternally
        set(value) = definedExternally
    fun newAutoForwarding(): Gmail_Schema_AutoForwarding
    fun newBatchDeleteMessagesRequest(): Gmail_Schema_BatchDeleteMessagesRequest
    fun newBatchModifyMessagesRequest(): Gmail_Schema_BatchModifyMessagesRequest
    fun newDelegate(): Gmail_Schema_Delegate
    fun newDraft(): Gmail_Schema_Draft
    fun newFilter(): Gmail_Schema_Filter
    fun newFilterAction(): Gmail_Schema_FilterAction
    fun newFilterCriteria(): Gmail_Schema_FilterCriteria
    fun newForwardingAddress(): Gmail_Schema_ForwardingAddress
    fun newImapSettings(): Gmail_Schema_ImapSettings
    fun newLabel(): Gmail_Schema_Label
    fun newLabelColor(): Gmail_Schema_LabelColor
    fun newMessage(): Gmail_Schema_Message
    fun newMessagePart(): Gmail_Schema_MessagePart
    fun newMessagePartBody(): Gmail_Schema_MessagePartBody
    fun newMessagePartHeader(): Gmail_Schema_MessagePartHeader
    fun newModifyMessageRequest(): Gmail_Schema_ModifyMessageRequest
    fun newModifyThreadRequest(): Gmail_Schema_ModifyThreadRequest
    fun newPopSettings(): Gmail_Schema_PopSettings
    fun newSendAs(): Gmail_Schema_SendAs
    fun newSmimeInfo(): Gmail_Schema_SmimeInfo
    fun newSmtpMsa(): Gmail_Schema_SmtpMsa
    fun newVacationSettings(): Gmail_Schema_VacationSettings
    fun newWatchRequest(): Gmail_Schema_WatchRequest
}