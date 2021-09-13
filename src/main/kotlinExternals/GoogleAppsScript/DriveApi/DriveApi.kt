package GoogleAppsScript.DriveApi


external interface Drive_Collection_AboutCollection {
    fun get(): Drive_Schema_About
    fun get(optionalArgs: Any?): Drive_Schema_About
}

external interface Drive_Collection_AppsCollection {
    fun get(appId: String): Drive_Schema_App
    fun list(): Drive_Schema_AppList
    fun list(optionalArgs: Any?): Drive_Schema_AppList
}

external interface Drive_Collection_ChangesCollection {
    fun get(changeId: String): Drive_Schema_Change
    fun get(changeId: String, optionalArgs: Any?): Drive_Schema_Change
    fun getStartPageToken(): Drive_Schema_StartPageToken
    fun getStartPageToken(optionalArgs: Any?): Drive_Schema_StartPageToken
    fun list(): Drive_Schema_ChangeList
    fun list(optionalArgs: Any?): Drive_Schema_ChangeList
    fun watch(resource: Drive_Schema_Channel): Drive_Schema_Channel
    fun watch(resource: Drive_Schema_Channel, optionalArgs: Any?): Drive_Schema_Channel
}

external interface Drive_Collection_ChannelsCollection {
    fun stop(resource: Drive_Schema_Channel)
}

external interface Drive_Collection_ChildrenCollection {
    fun get(folderId: String, childId: String): Drive_Schema_ChildReference
    fun insert(resource: Drive_Schema_ChildReference, folderId: String): Drive_Schema_ChildReference
    fun insert(resource: Drive_Schema_ChildReference, folderId: String, optionalArgs: Any?): Drive_Schema_ChildReference
    fun list(folderId: String): Drive_Schema_ChildList
    fun list(folderId: String, optionalArgs: Any?): Drive_Schema_ChildList
    fun remove(folderId: String, childId: String)
}

external interface Drive_Collection_CommentsCollection {
    fun get(fileId: String, commentId: String): Drive_Schema_Comment
    fun get(fileId: String, commentId: String, optionalArgs: Any?): Drive_Schema_Comment
    fun insert(resource: Drive_Schema_Comment, fileId: String): Drive_Schema_Comment
    fun list(fileId: String): Drive_Schema_CommentList
    fun list(fileId: String, optionalArgs: Any?): Drive_Schema_CommentList
    fun patch(resource: Drive_Schema_Comment, fileId: String, commentId: String): Drive_Schema_Comment
    fun remove(fileId: String, commentId: String)
    fun update(resource: Drive_Schema_Comment, fileId: String, commentId: String): Drive_Schema_Comment
}

external interface Drive_Collection_DrivesCollection {
    fun get(driveId: String): Drive_Schema_Drive
    fun get(driveId: String, optionalArgs: Any?): Drive_Schema_Drive
    fun hide(driveId: String): Drive_Schema_Drive
    fun insert(resource: Drive_Schema_Drive, requestId: String): Drive_Schema_Drive
    fun list(): Drive_Schema_DriveList
    fun list(optionalArgs: Any?): Drive_Schema_DriveList
    fun remove(driveId: String)
    fun unhide(driveId: String): Drive_Schema_Drive
    fun update(resource: Drive_Schema_Drive, driveId: String): Drive_Schema_Drive
    fun update(resource: Drive_Schema_Drive, driveId: String, optionalArgs: Any?): Drive_Schema_Drive
}

external interface Drive_Collection_FilesCollection {
    fun copy(resource: Drive_Schema_File, fileId: String): Drive_Schema_File
    fun copy(resource: Drive_Schema_File, fileId: String, optionalArgs: Any?): Drive_Schema_File
    fun emptyTrash()
    fun export(fileId: String, mimeType: String)
    fun generateIds(): Drive_Schema_GeneratedIds
    fun generateIds(optionalArgs: Any?): Drive_Schema_GeneratedIds
    fun get(fileId: String): Drive_Schema_File
    fun get(fileId: String, optionalArgs: Any?): Drive_Schema_File
    fun insert(resource: Drive_Schema_File): Drive_Schema_File
    fun insert(resource: Drive_Schema_File, mediaData: Any): Drive_Schema_File
    fun insert(resource: Drive_Schema_File, mediaData: Any, optionalArgs: Any?): Drive_Schema_File
    fun list(): Drive_Schema_FileList
    fun list(optionalArgs: Any?): Drive_Schema_FileList
    fun patch(resource: Drive_Schema_File, fileId: String): Drive_Schema_File
    fun patch(resource: Drive_Schema_File, fileId: String, optionalArgs: Any?): Drive_Schema_File
    fun remove(fileId: String)
    fun remove(fileId: String, optionalArgs: Any?)
    fun touch(fileId: String): Drive_Schema_File
    fun touch(fileId: String, optionalArgs: Any?): Drive_Schema_File
    fun trash(fileId: String): Drive_Schema_File
    fun trash(fileId: String, optionalArgs: Any?): Drive_Schema_File
    fun untrash(fileId: String): Drive_Schema_File
    fun untrash(fileId: String, optionalArgs: Any?): Drive_Schema_File
    fun update(resource: Drive_Schema_File, fileId: String): Drive_Schema_File
    fun update(resource: Drive_Schema_File, fileId: String, mediaData: Any): Drive_Schema_File
    fun update(resource: Drive_Schema_File, fileId: String, mediaData: Any, optionalArgs: Any?): Drive_Schema_File
    fun watch(resource: Drive_Schema_Channel, fileId: String): Drive_Schema_Channel
    fun watch(resource: Drive_Schema_Channel, fileId: String, optionalArgs: Any?): Drive_Schema_Channel
}

external interface Drive_Collection_ParentsCollection {
    fun get(fileId: String, parentId: String): Drive_Schema_ParentReference
    fun insert(resource: Drive_Schema_ParentReference, fileId: String): Drive_Schema_ParentReference
    fun insert(resource: Drive_Schema_ParentReference, fileId: String, optionalArgs: Any?): Drive_Schema_ParentReference
    fun list(fileId: String): Drive_Schema_ParentList
    fun remove(fileId: String, parentId: String)
}

external interface Drive_Collection_PermissionsCollection {
    fun get(fileId: String, permissionId: String): Drive_Schema_Permission
    fun get(fileId: String, permissionId: String, optionalArgs: Any?): Drive_Schema_Permission
    fun getIdForEmail(email: String): Drive_Schema_PermissionId
    fun insert(resource: Drive_Schema_Permission, fileId: String): Drive_Schema_Permission
    fun insert(resource: Drive_Schema_Permission, fileId: String, optionalArgs: Any?): Drive_Schema_Permission
    fun list(fileId: String): Drive_Schema_PermissionList
    fun list(fileId: String, optionalArgs: Any?): Drive_Schema_PermissionList
    fun patch(resource: Drive_Schema_Permission, fileId: String, permissionId: String): Drive_Schema_Permission
    fun patch(resource: Drive_Schema_Permission, fileId: String, permissionId: String, optionalArgs: Any?): Drive_Schema_Permission
    fun remove(fileId: String, permissionId: String)
    fun remove(fileId: String, permissionId: String, optionalArgs: Any?)
    fun update(resource: Drive_Schema_Permission, fileId: String, permissionId: String): Drive_Schema_Permission
    fun update(resource: Drive_Schema_Permission, fileId: String, permissionId: String, optionalArgs: Any?): Drive_Schema_Permission
}

external interface Drive_Collection_PropertiesCollection {
    fun get(fileId: String, propertyKey: String): Drive_Schema_Property
    fun get(fileId: String, propertyKey: String, optionalArgs: Any?): Drive_Schema_Property
    fun insert(resource: Drive_Schema_Property, fileId: String): Drive_Schema_Property
    fun list(fileId: String): Drive_Schema_PropertyList
    fun patch(resource: Drive_Schema_Property, fileId: String, propertyKey: String): Drive_Schema_Property
    fun patch(resource: Drive_Schema_Property, fileId: String, propertyKey: String, optionalArgs: Any?): Drive_Schema_Property
    fun remove(fileId: String, propertyKey: String)
    fun remove(fileId: String, propertyKey: String, optionalArgs: Any?)
    fun update(resource: Drive_Schema_Property, fileId: String, propertyKey: String): Drive_Schema_Property
    fun update(resource: Drive_Schema_Property, fileId: String, propertyKey: String, optionalArgs: Any?): Drive_Schema_Property
}

external interface Drive_Collection_RealtimeCollection {
    fun get(fileId: String)
    fun get(fileId: String, optionalArgs: Any?)
    fun update(fileId: String)
    fun update(fileId: String, mediaData: Any)
    fun update(fileId: String, mediaData: Any, optionalArgs: Any?)
}

external interface Drive_Collection_RepliesCollection {
    fun get(fileId: String, commentId: String, replyId: String): Drive_Schema_CommentReply
    fun get(fileId: String, commentId: String, replyId: String, optionalArgs: Any?): Drive_Schema_CommentReply
    fun insert(resource: Drive_Schema_CommentReply, fileId: String, commentId: String): Drive_Schema_CommentReply
    fun list(fileId: String, commentId: String): Drive_Schema_CommentReplyList
    fun list(fileId: String, commentId: String, optionalArgs: Any?): Drive_Schema_CommentReplyList
    fun patch(resource: Drive_Schema_CommentReply, fileId: String, commentId: String, replyId: String): Drive_Schema_CommentReply
    fun remove(fileId: String, commentId: String, replyId: String)
    fun update(resource: Drive_Schema_CommentReply, fileId: String, commentId: String, replyId: String): Drive_Schema_CommentReply
}

external interface Drive_Collection_RevisionsCollection {
    fun get(fileId: String, revisionId: String): Drive_Schema_Revision
    fun list(fileId: String): Drive_Schema_RevisionList
    fun list(fileId: String, optionalArgs: Any?): Drive_Schema_RevisionList
    fun patch(resource: Drive_Schema_Revision, fileId: String, revisionId: String): Drive_Schema_Revision
    fun remove(fileId: String, revisionId: String)
    fun update(resource: Drive_Schema_Revision, fileId: String, revisionId: String): Drive_Schema_Revision
}

external interface Drive_Collection_TeamdrivesCollection {
    fun get(teamDriveId: String): Drive_Schema_TeamDrive
    fun get(teamDriveId: String, optionalArgs: Any?): Drive_Schema_TeamDrive
    fun insert(resource: Drive_Schema_TeamDrive, requestId: String): Drive_Schema_TeamDrive
    fun list(): Drive_Schema_TeamDriveList
    fun list(optionalArgs: Any?): Drive_Schema_TeamDriveList
    fun remove(teamDriveId: String)
    fun update(resource: Drive_Schema_TeamDrive, teamDriveId: String): Drive_Schema_TeamDrive
    fun update(resource: Drive_Schema_TeamDrive, teamDriveId: String, optionalArgs: Any?): Drive_Schema_TeamDrive
}

external interface Drive_Schema_About {
    var additionalRoleInfo: Array<Drive_Schema_AboutAdditionalRoleInfo>?
        get() = definedExternally
        set(value) = definedExternally
    var canCreateDrives: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var canCreateTeamDrives: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var domainSharingPolicy: String?
        get() = definedExternally
        set(value) = definedExternally
    var driveThemes: Array<Drive_Schema_AboutDriveThemes>?
        get() = definedExternally
        set(value) = definedExternally
    var etag: String?
        get() = definedExternally
        set(value) = definedExternally
    var exportFormats: Array<Drive_Schema_AboutExportFormats>?
        get() = definedExternally
        set(value) = definedExternally
    var features: Array<Drive_Schema_AboutFeatures>?
        get() = definedExternally
        set(value) = definedExternally
    var folderColorPalette: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var importFormats: Array<Drive_Schema_AboutImportFormats>?
        get() = definedExternally
        set(value) = definedExternally
    var isCurrentAppInstalled: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var kind: String?
        get() = definedExternally
        set(value) = definedExternally
    var languageCode: String?
        get() = definedExternally
        set(value) = definedExternally
    var largestChangeId: String?
        get() = definedExternally
        set(value) = definedExternally
    var maxUploadSizes: Array<Drive_Schema_AboutMaxUploadSizes>?
        get() = definedExternally
        set(value) = definedExternally
    var name: String?
        get() = definedExternally
        set(value) = definedExternally
    var permissionId: String?
        get() = definedExternally
        set(value) = definedExternally
    var quotaBytesByService: Array<Drive_Schema_AboutQuotaBytesByService>?
        get() = definedExternally
        set(value) = definedExternally
    var quotaBytesTotal: String?
        get() = definedExternally
        set(value) = definedExternally
    var quotaBytesUsed: String?
        get() = definedExternally
        set(value) = definedExternally
    var quotaBytesUsedAggregate: String?
        get() = definedExternally
        set(value) = definedExternally
    var quotaBytesUsedInTrash: String?
        get() = definedExternally
        set(value) = definedExternally
    var quotaType: String?
        get() = definedExternally
        set(value) = definedExternally
    var remainingChangeIds: String?
        get() = definedExternally
        set(value) = definedExternally
    var rootFolderId: String?
        get() = definedExternally
        set(value) = definedExternally
    var selfLink: String?
        get() = definedExternally
        set(value) = definedExternally
    var teamDriveThemes: Array<Drive_Schema_AboutTeamDriveThemes>?
        get() = definedExternally
        set(value) = definedExternally
    var user: Drive_Schema_User?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Drive_Schema_AboutAdditionalRoleInfo {
    var roleSets: Array<Drive_Schema_AboutAdditionalRoleInfoRoleSets>?
        get() = definedExternally
        set(value) = definedExternally
    var type: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Drive_Schema_AboutAdditionalRoleInfoRoleSets {
    var additionalRoles: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var primaryRole: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Drive_Schema_AboutDriveThemes {
    var backgroundImageLink: String?
        get() = definedExternally
        set(value) = definedExternally
    var colorRgb: String?
        get() = definedExternally
        set(value) = definedExternally
    var id: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Drive_Schema_AboutExportFormats {
    var source: String?
        get() = definedExternally
        set(value) = definedExternally
    var targets: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Drive_Schema_AboutFeatures {
    var featureName: String?
        get() = definedExternally
        set(value) = definedExternally
    var featureRate: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Drive_Schema_AboutImportFormats {
    var source: String?
        get() = definedExternally
        set(value) = definedExternally
    var targets: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Drive_Schema_AboutMaxUploadSizes {
    var size: String?
        get() = definedExternally
        set(value) = definedExternally
    var type: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Drive_Schema_AboutQuotaBytesByService {
    var bytesUsed: String?
        get() = definedExternally
        set(value) = definedExternally
    var serviceName: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Drive_Schema_AboutTeamDriveThemes {
    var backgroundImageLink: String?
        get() = definedExternally
        set(value) = definedExternally
    var colorRgb: String?
        get() = definedExternally
        set(value) = definedExternally
    var id: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Drive_Schema_App {
    var authorized: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var createInFolderTemplate: String?
        get() = definedExternally
        set(value) = definedExternally
    var createUrl: String?
        get() = definedExternally
        set(value) = definedExternally
    var hasDriveWideScope: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var icons: Array<Drive_Schema_AppIcons>?
        get() = definedExternally
        set(value) = definedExternally
    var id: String?
        get() = definedExternally
        set(value) = definedExternally
    var installed: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var kind: String?
        get() = definedExternally
        set(value) = definedExternally
    var longDescription: String?
        get() = definedExternally
        set(value) = definedExternally
    var name: String?
        get() = definedExternally
        set(value) = definedExternally
    var objectType: String?
        get() = definedExternally
        set(value) = definedExternally
    var openUrlTemplate: String?
        get() = definedExternally
        set(value) = definedExternally
    var primaryFileExtensions: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var primaryMimeTypes: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var productId: String?
        get() = definedExternally
        set(value) = definedExternally
    var productUrl: String?
        get() = definedExternally
        set(value) = definedExternally
    var secondaryFileExtensions: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var secondaryMimeTypes: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var shortDescription: String?
        get() = definedExternally
        set(value) = definedExternally
    var supportsCreate: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var supportsImport: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var supportsMultiOpen: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var supportsOfflineCreate: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var useByDefault: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Drive_Schema_AppIcons {
    var category: String?
        get() = definedExternally
        set(value) = definedExternally
    var iconUrl: String?
        get() = definedExternally
        set(value) = definedExternally
    var size: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Drive_Schema_AppList {
    var defaultAppIds: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var etag: String?
        get() = definedExternally
        set(value) = definedExternally
    var items: Array<Drive_Schema_App>?
        get() = definedExternally
        set(value) = definedExternally
    var kind: String?
        get() = definedExternally
        set(value) = definedExternally
    var selfLink: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Drive_Schema_Change {
    var deleted: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var drive: Drive_Schema_Drive?
        get() = definedExternally
        set(value) = definedExternally
    var driveId: String?
        get() = definedExternally
        set(value) = definedExternally
    var file: Drive_Schema_File?
        get() = definedExternally
        set(value) = definedExternally
    var fileId: String?
        get() = definedExternally
        set(value) = definedExternally
    var id: String?
        get() = definedExternally
        set(value) = definedExternally
    var kind: String?
        get() = definedExternally
        set(value) = definedExternally
    var modificationDate: String?
        get() = definedExternally
        set(value) = definedExternally
    var selfLink: String?
        get() = definedExternally
        set(value) = definedExternally
    var teamDrive: Drive_Schema_TeamDrive?
        get() = definedExternally
        set(value) = definedExternally
    var teamDriveId: String?
        get() = definedExternally
        set(value) = definedExternally
    var type: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Drive_Schema_ChangeList {
    var etag: String?
        get() = definedExternally
        set(value) = definedExternally
    var items: Array<Drive_Schema_Change>?
        get() = definedExternally
        set(value) = definedExternally
    var kind: String?
        get() = definedExternally
        set(value) = definedExternally
    var largestChangeId: String?
        get() = definedExternally
        set(value) = definedExternally
    var newStartPageToken: String?
        get() = definedExternally
        set(value) = definedExternally
    var nextLink: String?
        get() = definedExternally
        set(value) = definedExternally
    var nextPageToken: String?
        get() = definedExternally
        set(value) = definedExternally
    var selfLink: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Drive_Schema_Channel {
    var address: String?
        get() = definedExternally
        set(value) = definedExternally
    var expiration: String?
        get() = definedExternally
        set(value) = definedExternally
    var id: String?
        get() = definedExternally
        set(value) = definedExternally
    var kind: String?
        get() = definedExternally
        set(value) = definedExternally
    var params: Any?
        get() = definedExternally
        set(value) = definedExternally
    var payload: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var resourceId: String?
        get() = definedExternally
        set(value) = definedExternally
    var resourceUri: String?
        get() = definedExternally
        set(value) = definedExternally
    var token: String?
        get() = definedExternally
        set(value) = definedExternally
    var type: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Drive_Schema_ChildList {
    var etag: String?
        get() = definedExternally
        set(value) = definedExternally
    var items: Array<Drive_Schema_ChildReference>?
        get() = definedExternally
        set(value) = definedExternally
    var kind: String?
        get() = definedExternally
        set(value) = definedExternally
    var nextLink: String?
        get() = definedExternally
        set(value) = definedExternally
    var nextPageToken: String?
        get() = definedExternally
        set(value) = definedExternally
    var selfLink: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Drive_Schema_ChildReference {
    var childLink: String?
        get() = definedExternally
        set(value) = definedExternally
    var id: String?
        get() = definedExternally
        set(value) = definedExternally
    var kind: String?
        get() = definedExternally
        set(value) = definedExternally
    var selfLink: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Drive_Schema_Comment {
    var anchor: String?
        get() = definedExternally
        set(value) = definedExternally
    var author: Drive_Schema_User?
        get() = definedExternally
        set(value) = definedExternally
    var commentId: String?
        get() = definedExternally
        set(value) = definedExternally
    var content: String?
        get() = definedExternally
        set(value) = definedExternally
    var context: Drive_Schema_CommentContext?
        get() = definedExternally
        set(value) = definedExternally
    var createdDate: String?
        get() = definedExternally
        set(value) = definedExternally
    var deleted: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var fileId: String?
        get() = definedExternally
        set(value) = definedExternally
    var fileTitle: String?
        get() = definedExternally
        set(value) = definedExternally
    var htmlContent: String?
        get() = definedExternally
        set(value) = definedExternally
    var kind: String?
        get() = definedExternally
        set(value) = definedExternally
    var modifiedDate: String?
        get() = definedExternally
        set(value) = definedExternally
    var replies: Array<Drive_Schema_CommentReply>?
        get() = definedExternally
        set(value) = definedExternally
    var selfLink: String?
        get() = definedExternally
        set(value) = definedExternally
    var status: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Drive_Schema_CommentContext {
    var type: String?
        get() = definedExternally
        set(value) = definedExternally
    var value: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Drive_Schema_CommentList {
    var items: Array<Drive_Schema_Comment>?
        get() = definedExternally
        set(value) = definedExternally
    var kind: String?
        get() = definedExternally
        set(value) = definedExternally
    var nextLink: String?
        get() = definedExternally
        set(value) = definedExternally
    var nextPageToken: String?
        get() = definedExternally
        set(value) = definedExternally
    var selfLink: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Drive_Schema_CommentReply {
    var author: Drive_Schema_User?
        get() = definedExternally
        set(value) = definedExternally
    var content: String?
        get() = definedExternally
        set(value) = definedExternally
    var createdDate: String?
        get() = definedExternally
        set(value) = definedExternally
    var deleted: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var htmlContent: String?
        get() = definedExternally
        set(value) = definedExternally
    var kind: String?
        get() = definedExternally
        set(value) = definedExternally
    var modifiedDate: String?
        get() = definedExternally
        set(value) = definedExternally
    var replyId: String?
        get() = definedExternally
        set(value) = definedExternally
    var verb: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Drive_Schema_CommentReplyList {
    var items: Array<Drive_Schema_CommentReply>?
        get() = definedExternally
        set(value) = definedExternally
    var kind: String?
        get() = definedExternally
        set(value) = definedExternally
    var nextLink: String?
        get() = definedExternally
        set(value) = definedExternally
    var nextPageToken: String?
        get() = definedExternally
        set(value) = definedExternally
    var selfLink: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Drive_Schema_Drive {
    var backgroundImageFile: Drive_Schema_DriveBackgroundImageFile?
        get() = definedExternally
        set(value) = definedExternally
    var backgroundImageLink: String?
        get() = definedExternally
        set(value) = definedExternally
    var capabilities: Drive_Schema_DriveCapabilities?
        get() = definedExternally
        set(value) = definedExternally
    var colorRgb: String?
        get() = definedExternally
        set(value) = definedExternally
    var createdDate: String?
        get() = definedExternally
        set(value) = definedExternally
    var hidden: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var id: String?
        get() = definedExternally
        set(value) = definedExternally
    var kind: String?
        get() = definedExternally
        set(value) = definedExternally
    var name: String?
        get() = definedExternally
        set(value) = definedExternally
    var restrictions: Drive_Schema_DriveRestrictions?
        get() = definedExternally
        set(value) = definedExternally
    var themeId: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Drive_Schema_DriveBackgroundImageFile {
    var id: String?
        get() = definedExternally
        set(value) = definedExternally
    var width: Number?
        get() = definedExternally
        set(value) = definedExternally
    var xCoordinate: Number?
        get() = definedExternally
        set(value) = definedExternally
    var yCoordinate: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Drive_Schema_DriveCapabilities {
    var canAddChildren: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var canChangeCopyRequiresWriterPermissionRestriction: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var canChangeDomainUsersOnlyRestriction: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var canChangeDriveBackground: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var canChangeDriveMembersOnlyRestriction: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var canComment: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var canCopy: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var canDeleteChildren: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var canDeleteDrive: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var canDownload: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var canEdit: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var canListChildren: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var canManageMembers: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var canReadRevisions: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var canRename: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var canRenameDrive: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var canShare: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var canTrashChildren: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Drive_Schema_DriveList {
    var items: Array<Drive_Schema_Drive>?
        get() = definedExternally
        set(value) = definedExternally
    var kind: String?
        get() = definedExternally
        set(value) = definedExternally
    var nextPageToken: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Drive_Schema_DriveRestrictions {
    var adminManagedRestrictions: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var copyRequiresWriterPermission: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var domainUsersOnly: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var driveMembersOnly: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Drive_Schema_File {
    var alternateLink: String?
        get() = definedExternally
        set(value) = definedExternally
    var appDataContents: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var canComment: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var canReadRevisions: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var capabilities: Drive_Schema_FileCapabilities?
        get() = definedExternally
        set(value) = definedExternally
    var copyRequiresWriterPermission: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var copyable: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var createdDate: String?
        get() = definedExternally
        set(value) = definedExternally
    var defaultOpenWithLink: String?
        get() = definedExternally
        set(value) = definedExternally
    var description: String?
        get() = definedExternally
        set(value) = definedExternally
    var downloadUrl: String?
        get() = definedExternally
        set(value) = definedExternally
    var driveId: String?
        get() = definedExternally
        set(value) = definedExternally
    var editable: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var embedLink: String?
        get() = definedExternally
        set(value) = definedExternally
    var etag: String?
        get() = definedExternally
        set(value) = definedExternally
    var explicitlyTrashed: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var exportLinks: Any?
        get() = definedExternally
        set(value) = definedExternally
    var fileExtension: String?
        get() = definedExternally
        set(value) = definedExternally
    var fileSize: String?
        get() = definedExternally
        set(value) = definedExternally
    var folderColorRgb: String?
        get() = definedExternally
        set(value) = definedExternally
    var fullFileExtension: String?
        get() = definedExternally
        set(value) = definedExternally
    var hasAugmentedPermissions: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var hasThumbnail: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var headRevisionId: String?
        get() = definedExternally
        set(value) = definedExternally
    var iconLink: String?
        get() = definedExternally
        set(value) = definedExternally
    var id: String?
        get() = definedExternally
        set(value) = definedExternally
    var imageMediaMetadata: Drive_Schema_FileImageMediaMetadata?
        get() = definedExternally
        set(value) = definedExternally
    var indexableText: Drive_Schema_FileIndexableText?
        get() = definedExternally
        set(value) = definedExternally
    var isAppAuthorized: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var kind: String?
        get() = definedExternally
        set(value) = definedExternally
    var labels: Drive_Schema_FileLabels?
        get() = definedExternally
        set(value) = definedExternally
    var lastModifyingUser: Drive_Schema_User?
        get() = definedExternally
        set(value) = definedExternally
    var lastModifyingUserName: String?
        get() = definedExternally
        set(value) = definedExternally
    var lastViewedByMeDate: String?
        get() = definedExternally
        set(value) = definedExternally
    var markedViewedByMeDate: String?
        get() = definedExternally
        set(value) = definedExternally
    var md5Checksum: String?
        get() = definedExternally
        set(value) = definedExternally
    var mimeType: String?
        get() = definedExternally
        set(value) = definedExternally
    var modifiedByMeDate: String?
        get() = definedExternally
        set(value) = definedExternally
    var modifiedDate: String?
        get() = definedExternally
        set(value) = definedExternally
    var openWithLinks: Any?
        get() = definedExternally
        set(value) = definedExternally
    var originalFilename: String?
        get() = definedExternally
        set(value) = definedExternally
    var ownedByMe: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var ownerNames: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var owners: Array<Drive_Schema_User>?
        get() = definedExternally
        set(value) = definedExternally
    var parents: Array<Drive_Schema_ParentReference>?
        get() = definedExternally
        set(value) = definedExternally
    var permissionIds: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var permissions: Array<Drive_Schema_Permission>?
        get() = definedExternally
        set(value) = definedExternally
    var properties: Array<Drive_Schema_Property>?
        get() = definedExternally
        set(value) = definedExternally
    var quotaBytesUsed: String?
        get() = definedExternally
        set(value) = definedExternally
    var selfLink: String?
        get() = definedExternally
        set(value) = definedExternally
    var shareable: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var shared: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var sharedWithMeDate: String?
        get() = definedExternally
        set(value) = definedExternally
    var sharingUser: Drive_Schema_User?
        get() = definedExternally
        set(value) = definedExternally
    var shortcutDetails: Drive_Schema_ShortcutDetails?
        get() = definedExternally
        set(value) = definedExternally
    var spaces: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var teamDriveId: String?
        get() = definedExternally
        set(value) = definedExternally
    var thumbnail: Drive_Schema_FileThumbnail?
        get() = definedExternally
        set(value) = definedExternally
    var thumbnailLink: String?
        get() = definedExternally
        set(value) = definedExternally
    var thumbnailVersion: String?
        get() = definedExternally
        set(value) = definedExternally
    var title: String?
        get() = definedExternally
        set(value) = definedExternally
    var trashedDate: String?
        get() = definedExternally
        set(value) = definedExternally
    var trashingUser: Drive_Schema_User?
        get() = definedExternally
        set(value) = definedExternally
    var userPermission: Drive_Schema_Permission?
        get() = definedExternally
        set(value) = definedExternally
    var version: String?
        get() = definedExternally
        set(value) = definedExternally
    var videoMediaMetadata: Drive_Schema_FileVideoMediaMetadata?
        get() = definedExternally
        set(value) = definedExternally
    var webContentLink: String?
        get() = definedExternally
        set(value) = definedExternally
    var webViewLink: String?
        get() = definedExternally
        set(value) = definedExternally
    var writersCanShare: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Drive_Schema_FileCapabilities {
    var canAddChildren: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var canChangeCopyRequiresWriterPermission: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var canChangeRestrictedDownload: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var canComment: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var canCopy: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var canDelete: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var canDeleteChildren: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var canDownload: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var canEdit: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var canListChildren: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var canMoveChildrenOutOfDrive: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var canMoveChildrenOutOfTeamDrive: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var canMoveChildrenWithinDrive: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var canMoveChildrenWithinTeamDrive: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var canMoveItemIntoTeamDrive: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var canMoveItemOutOfDrive: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var canMoveItemOutOfTeamDrive: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var canMoveItemWithinDrive: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var canMoveItemWithinTeamDrive: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var canMoveTeamDriveItem: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var canReadRevisions: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var canReadDrive: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var canReadTeamDrive: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var canRemoveChildren: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var canRename: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var canShare: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var canTrash: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var canTrashChildren: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var canUntrash: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Drive_Schema_FileImageMediaMetadata {
    var aperture: Number?
        get() = definedExternally
        set(value) = definedExternally
    var cameraMake: String?
        get() = definedExternally
        set(value) = definedExternally
    var cameraModel: String?
        get() = definedExternally
        set(value) = definedExternally
    var colorSpace: String?
        get() = definedExternally
        set(value) = definedExternally
    var date: String?
        get() = definedExternally
        set(value) = definedExternally
    var exposureBias: Number?
        get() = definedExternally
        set(value) = definedExternally
    var exposureMode: String?
        get() = definedExternally
        set(value) = definedExternally
    var exposureTime: Number?
        get() = definedExternally
        set(value) = definedExternally
    var flashUsed: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var focalLength: Number?
        get() = definedExternally
        set(value) = definedExternally
    var height: Number?
        get() = definedExternally
        set(value) = definedExternally
    var isoSpeed: Number?
        get() = definedExternally
        set(value) = definedExternally
    var lens: String?
        get() = definedExternally
        set(value) = definedExternally
    var location: Drive_Schema_FileImageMediaMetadataLocation?
        get() = definedExternally
        set(value) = definedExternally
    var maxApertureValue: Number?
        get() = definedExternally
        set(value) = definedExternally
    var meteringMode: String?
        get() = definedExternally
        set(value) = definedExternally
    var rotation: Number?
        get() = definedExternally
        set(value) = definedExternally
    var sensor: String?
        get() = definedExternally
        set(value) = definedExternally
    var subjectDistance: Number?
        get() = definedExternally
        set(value) = definedExternally
    var whiteBalance: String?
        get() = definedExternally
        set(value) = definedExternally
    var width: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Drive_Schema_FileImageMediaMetadataLocation {
    var altitude: Number?
        get() = definedExternally
        set(value) = definedExternally
    var latitude: Number?
        get() = definedExternally
        set(value) = definedExternally
    var longitude: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Drive_Schema_FileIndexableText {
    var text: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Drive_Schema_FileLabels {
    var hidden: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var modified: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var restricted: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var starred: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var trashed: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var viewed: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Drive_Schema_FileList {
    var etag: String?
        get() = definedExternally
        set(value) = definedExternally
    var incompleteSearch: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var items: Array<Drive_Schema_File>?
        get() = definedExternally
        set(value) = definedExternally
    var kind: String?
        get() = definedExternally
        set(value) = definedExternally
    var nextLink: String?
        get() = definedExternally
        set(value) = definedExternally
    var nextPageToken: String?
        get() = definedExternally
        set(value) = definedExternally
    var selfLink: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Drive_Schema_FileThumbnail {
    var image: String?
        get() = definedExternally
        set(value) = definedExternally
    var mimeType: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Drive_Schema_FileVideoMediaMetadata {
    var durationMillis: String?
        get() = definedExternally
        set(value) = definedExternally
    var height: Number?
        get() = definedExternally
        set(value) = definedExternally
    var width: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Drive_Schema_GeneratedIds {
    var ids: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var kind: String?
        get() = definedExternally
        set(value) = definedExternally
    var space: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Drive_Schema_ParentList {
    var etag: String?
        get() = definedExternally
        set(value) = definedExternally
    var items: Array<Drive_Schema_ParentReference>?
        get() = definedExternally
        set(value) = definedExternally
    var kind: String?
        get() = definedExternally
        set(value) = definedExternally
    var selfLink: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Drive_Schema_ParentReference {
    var id: String?
        get() = definedExternally
        set(value) = definedExternally
    var isRoot: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var kind: String?
        get() = definedExternally
        set(value) = definedExternally
    var parentLink: String?
        get() = definedExternally
        set(value) = definedExternally
    var selfLink: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Drive_Schema_Permission {
    var additionalRoles: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var authKey: String?
        get() = definedExternally
        set(value) = definedExternally
    var deleted: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var domain: String?
        get() = definedExternally
        set(value) = definedExternally
    var emailAddress: String?
        get() = definedExternally
        set(value) = definedExternally
    var etag: String?
        get() = definedExternally
        set(value) = definedExternally
    var expirationDate: String?
        get() = definedExternally
        set(value) = definedExternally
    var id: String?
        get() = definedExternally
        set(value) = definedExternally
    var kind: String?
        get() = definedExternally
        set(value) = definedExternally
    var name: String?
        get() = definedExternally
        set(value) = definedExternally
    var permissionDetails: Array<Drive_Schema_PermissionPermissionDetails>?
        get() = definedExternally
        set(value) = definedExternally
    var photoLink: String?
        get() = definedExternally
        set(value) = definedExternally
    var role: String? /* "owner" | "organizer" | "fileOrganizer" | "writer" | "reader" */
        get() = definedExternally
        set(value) = definedExternally
    var selfLink: String?
        get() = definedExternally
        set(value) = definedExternally
    var teamDrivePermissionDetails: Array<Drive_Schema_PermissionTeamDrivePermissionDetails>?
        get() = definedExternally
        set(value) = definedExternally
    var type: String?
        get() = definedExternally
        set(value) = definedExternally
    var value: String?
        get() = definedExternally
        set(value) = definedExternally
    var withLink: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Drive_Schema_PermissionId {
    var id: String?
        get() = definedExternally
        set(value) = definedExternally
    var kind: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Drive_Schema_PermissionList {
    var etag: String?
        get() = definedExternally
        set(value) = definedExternally
    var items: Array<Drive_Schema_Permission>?
        get() = definedExternally
        set(value) = definedExternally
    var kind: String?
        get() = definedExternally
        set(value) = definedExternally
    var nextPageToken: String?
        get() = definedExternally
        set(value) = definedExternally
    var selfLink: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Drive_Schema_PermissionPermissionDetails {
    var additionalRoles: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var inherited: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var inheritedFrom: String?
        get() = definedExternally
        set(value) = definedExternally
    var permissionType: String?
        get() = definedExternally
        set(value) = definedExternally
    var role: String? /* "organizer" | "fileOrganizer" | "writer" | "reader" */
        get() = definedExternally
        set(value) = definedExternally
}

external interface Drive_Schema_PermissionTeamDrivePermissionDetails {
    var additionalRoles: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var inherited: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var inheritedFrom: String?
        get() = definedExternally
        set(value) = definedExternally
    var role: String?
        get() = definedExternally
        set(value) = definedExternally
    var teamDrivePermissionType: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Drive_Schema_Property {
    var etag: String?
        get() = definedExternally
        set(value) = definedExternally
    var key: String?
        get() = definedExternally
        set(value) = definedExternally
    var kind: String?
        get() = definedExternally
        set(value) = definedExternally
    var selfLink: String?
        get() = definedExternally
        set(value) = definedExternally
    var value: String?
        get() = definedExternally
        set(value) = definedExternally
    var visibility: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Drive_Schema_PropertyList {
    var etag: String?
        get() = definedExternally
        set(value) = definedExternally
    var items: Array<Drive_Schema_Property>?
        get() = definedExternally
        set(value) = definedExternally
    var kind: String?
        get() = definedExternally
        set(value) = definedExternally
    var selfLink: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Drive_Schema_Revision {
    var downloadUrl: String?
        get() = definedExternally
        set(value) = definedExternally
    var etag: String?
        get() = definedExternally
        set(value) = definedExternally
    var exportLinks: Any?
        get() = definedExternally
        set(value) = definedExternally
    var fileSize: String?
        get() = definedExternally
        set(value) = definedExternally
    var id: String?
        get() = definedExternally
        set(value) = definedExternally
    var kind: String?
        get() = definedExternally
        set(value) = definedExternally
    var lastModifyingUser: Drive_Schema_User?
        get() = definedExternally
        set(value) = definedExternally
    var lastModifyingUserName: String?
        get() = definedExternally
        set(value) = definedExternally
    var md5Checksum: String?
        get() = definedExternally
        set(value) = definedExternally
    var mimeType: String?
        get() = definedExternally
        set(value) = definedExternally
    var modifiedDate: String?
        get() = definedExternally
        set(value) = definedExternally
    var originalFilename: String?
        get() = definedExternally
        set(value) = definedExternally
    var pinned: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var publishAuto: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var published: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var publishedLink: String?
        get() = definedExternally
        set(value) = definedExternally
    var publishedOutsideDomain: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var selfLink: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Drive_Schema_RevisionList {
    var etag: String?
        get() = definedExternally
        set(value) = definedExternally
    var items: Array<Drive_Schema_Revision>?
        get() = definedExternally
        set(value) = definedExternally
    var kind: String?
        get() = definedExternally
        set(value) = definedExternally
    var nextPageToken: String?
        get() = definedExternally
        set(value) = definedExternally
    var selfLink: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Drive_Schema_ShortcutDetails {
    var targetId: String?
        get() = definedExternally
        set(value) = definedExternally
    var targetMimeType: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Drive_Schema_StartPageToken {
    var kind: String?
        get() = definedExternally
        set(value) = definedExternally
    var startPageToken: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Drive_Schema_TeamDrive {
    var backgroundImageFile: Drive_Schema_TeamDriveBackgroundImageFile?
        get() = definedExternally
        set(value) = definedExternally
    var backgroundImageLink: String?
        get() = definedExternally
        set(value) = definedExternally
    var capabilities: Drive_Schema_TeamDriveCapabilities?
        get() = definedExternally
        set(value) = definedExternally
    var colorRgb: String?
        get() = definedExternally
        set(value) = definedExternally
    var createdDate: String?
        get() = definedExternally
        set(value) = definedExternally
    var id: String?
        get() = definedExternally
        set(value) = definedExternally
    var kind: String?
        get() = definedExternally
        set(value) = definedExternally
    var name: String?
        get() = definedExternally
        set(value) = definedExternally
    var restrictions: Drive_Schema_TeamDriveRestrictions?
        get() = definedExternally
        set(value) = definedExternally
    var themeId: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Drive_Schema_TeamDriveBackgroundImageFile {
    var id: String?
        get() = definedExternally
        set(value) = definedExternally
    var width: Number?
        get() = definedExternally
        set(value) = definedExternally
    var xCoordinate: Number?
        get() = definedExternally
        set(value) = definedExternally
    var yCoordinate: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Drive_Schema_TeamDriveCapabilities {
    var canAddChildren: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var canChangeCopyRequiresWriterPermissionRestriction: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var canChangeDomainUsersOnlyRestriction: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var canChangeTeamDriveBackground: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var canChangeTeamMembersOnlyRestriction: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var canComment: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var canCopy: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var canDeleteChildren: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var canDeleteTeamDrive: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var canDownload: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var canEdit: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var canListChildren: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var canManageMembers: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var canReadRevisions: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var canRemoveChildren: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var canRename: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var canRenameTeamDrive: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var canShare: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var canTrashChildren: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Drive_Schema_TeamDriveList {
    var items: Array<Drive_Schema_TeamDrive>?
        get() = definedExternally
        set(value) = definedExternally
    var kind: String?
        get() = definedExternally
        set(value) = definedExternally
    var nextPageToken: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Drive_Schema_TeamDriveRestrictions {
    var adminManagedRestrictions: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var copyRequiresWriterPermission: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var domainUsersOnly: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var teamMembersOnly: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Drive_Schema_User {
    var displayName: String?
        get() = definedExternally
        set(value) = definedExternally
    var emailAddress: String?
        get() = definedExternally
        set(value) = definedExternally
    var isAuthenticatedUser: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var kind: String?
        get() = definedExternally
        set(value) = definedExternally
    var permissionId: String?
        get() = definedExternally
        set(value) = definedExternally
    var picture: Drive_Schema_UserPicture?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Drive_Schema_UserPicture {
    var url: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Drive {
    var About: Drive_Collection_AboutCollection?
        get() = definedExternally
        set(value) = definedExternally
    var Apps: Drive_Collection_AppsCollection?
        get() = definedExternally
        set(value) = definedExternally
    var Changes: Drive_Collection_ChangesCollection?
        get() = definedExternally
        set(value) = definedExternally
    var Channels: Drive_Collection_ChannelsCollection?
        get() = definedExternally
        set(value) = definedExternally
    var Children: Drive_Collection_ChildrenCollection?
        get() = definedExternally
        set(value) = definedExternally
    var Comments: Drive_Collection_CommentsCollection?
        get() = definedExternally
        set(value) = definedExternally
    var Drives: Drive_Collection_DrivesCollection?
        get() = definedExternally
        set(value) = definedExternally
    var Files: Drive_Collection_FilesCollection?
        get() = definedExternally
        set(value) = definedExternally
    var Parents: Drive_Collection_ParentsCollection?
        get() = definedExternally
        set(value) = definedExternally
    var Permissions: Drive_Collection_PermissionsCollection?
        get() = definedExternally
        set(value) = definedExternally
    var Properties: Drive_Collection_PropertiesCollection?
        get() = definedExternally
        set(value) = definedExternally
    var Realtime: Drive_Collection_RealtimeCollection?
        get() = definedExternally
        set(value) = definedExternally
    var Replies: Drive_Collection_RepliesCollection?
        get() = definedExternally
        set(value) = definedExternally
    var Revisions: Drive_Collection_RevisionsCollection?
        get() = definedExternally
        set(value) = definedExternally
    var Teamdrives: Drive_Collection_TeamdrivesCollection?
        get() = definedExternally
        set(value) = definedExternally
    fun newChannel(): Drive_Schema_Channel
    fun newChildReference(): Drive_Schema_ChildReference
    fun newComment(): Drive_Schema_Comment
    fun newCommentContext(): Drive_Schema_CommentContext
    fun newCommentReply(): Drive_Schema_CommentReply
    fun newDrive(): Drive_Schema_Drive
    fun newDriveBackgroundImageFile(): Drive_Schema_DriveBackgroundImageFile
    fun newDriveCapabilities(): Drive_Schema_DriveCapabilities
    fun newDriveRestrictions(): Drive_Schema_DriveRestrictions
    fun newFile(): Drive_Schema_File
    fun newFileCapabilities(): Drive_Schema_FileCapabilities
    fun newFileImageMediaMetadata(): Drive_Schema_FileImageMediaMetadata
    fun newFileImageMediaMetadataLocation(): Drive_Schema_FileImageMediaMetadataLocation
    fun newFileIndexableText(): Drive_Schema_FileIndexableText
    fun newFileLabels(): Drive_Schema_FileLabels
    fun newFileThumbnail(): Drive_Schema_FileThumbnail
    fun newFileVideoMediaMetadata(): Drive_Schema_FileVideoMediaMetadata
    fun newParentReference(): Drive_Schema_ParentReference
    fun newPermission(): Drive_Schema_Permission
    fun newPermissionPermissionDetails(): Drive_Schema_PermissionPermissionDetails
    fun newPermissionTeamDrivePermissionDetails(): Drive_Schema_PermissionTeamDrivePermissionDetails
    fun newProperty(): Drive_Schema_Property
    fun newRevision(): Drive_Schema_Revision
    fun newTeamDrive(): Drive_Schema_TeamDrive
    fun newTeamDriveBackgroundImageFile(): Drive_Schema_TeamDriveBackgroundImageFile
    fun newTeamDriveCapabilities(): Drive_Schema_TeamDriveCapabilities
    fun newTeamDriveRestrictions(): Drive_Schema_TeamDriveRestrictions
    fun newUser(): Drive_Schema_User
    fun newUserPicture(): Drive_Schema_UserPicture
}