package GoogleAppsScript.Drive

import GoogleAppsScript.Integer
import GoogleAppsScript.Base.Blob
import GoogleAppsScript.Base.BlobSource
import GoogleAppsScript.Base.Date


external enum class Access {
    ANYONE,
    ANYONE_WITH_LINK,
    DOMAIN,
    DOMAIN_WITH_LINK,
    PRIVATE
}

external interface DriveApp {
    var Access: Any
    var Permission: Any
    fun addFile(child: File): Folder
    fun addFolder(child: Folder): Folder
    fun continueFileIterator(continuationToken: String): FileIterator
    fun continueFolderIterator(continuationToken: String): FolderIterator
    fun createFile(blob: BlobSource): File
    fun createFile(name: String, content: String): File
    fun createFile(name: String, content: String, mimeType: String): File
    fun createFolder(name: String): Folder
    fun createShortcut(targetId: String): File
    fun getFileById(id: String): File
    fun getFiles(): FileIterator
    fun getFilesByName(name: String): FileIterator
    fun getFilesByType(mimeType: String): FileIterator
    fun getFolderById(id: String): Folder
    fun getFolders(): FolderIterator
    fun getFoldersByName(name: String): FolderIterator
    fun getRootFolder(): Folder
    fun getStorageLimit(): Integer
    fun getStorageUsed(): Integer
    fun getTrashedFiles(): FileIterator
    fun getTrashedFolders(): FolderIterator
    fun removeFile(child: File): Folder
    fun removeFolder(child: Folder): Folder
    fun searchFiles(params: String): FileIterator
    fun searchFolders(params: String): FolderIterator
}

external interface File {
    fun addCommenter(emailAddress: String): File
    fun addCommenter(user: GoogleAppsScript.Base.User): File
    fun addCommenters(emailAddresses: Array<String>): File
    fun addEditor(emailAddress: String): File
    fun addEditor(user: GoogleAppsScript.Base.User): File
    fun addEditors(emailAddresses: Array<String>): File
    fun addViewer(emailAddress: String): File
    fun addViewer(user: GoogleAppsScript.Base.User): File
    fun addViewers(emailAddresses: Array<String>): File
    fun getAccess(email: String): Permission
    fun getAccess(user: GoogleAppsScript.Base.User): Permission
    fun getAs(contentType: String): Blob
    fun getBlob(): Blob
    fun getDateCreated(): Date
    fun getDescription(): String?
    fun getDownloadUrl(): String
    fun getEditors(): Array<User>
    fun getId(): String
    fun getLastUpdated(): Date
    fun getMimeType(): String
    fun getName(): String
    fun getOwner(): User
    fun getParents(): FolderIterator
    fun getSharingAccess(): Access
    fun getSharingPermission(): Permission
    fun getSize(): Integer
    fun getTargetId(): String?
    fun getThumbnail(): Blob
    fun getUrl(): String
    fun getViewers(): Array<User>
    fun isShareableByEditors(): Boolean
    fun isStarred(): Boolean
    fun isTrashed(): Boolean
    fun makeCopy(): File
    fun makeCopy(destination: Folder): File
    fun makeCopy(name: String): File
    fun makeCopy(name: String, destination: Folder): File
    fun moveTo(destination: Folder): File
    fun removeCommenter(emailAddress: String): File
    fun removeCommenter(user: GoogleAppsScript.Base.User): File
    fun removeEditor(emailAddress: String): File
    fun removeEditor(user: GoogleAppsScript.Base.User): File
    fun removeViewer(emailAddress: String): File
    fun removeViewer(user: GoogleAppsScript.Base.User): File
    fun revokePermissions(user: String): File
    fun revokePermissions(user: GoogleAppsScript.Base.User): File
    fun setContent(content: String): File
    fun setDescription(description: String): File
    fun setName(name: String): File
    fun setOwner(emailAddress: String): File
    fun setOwner(user: GoogleAppsScript.Base.User): File
    fun setShareableByEditors(shareable: Boolean): File
    fun setSharing(accessType: Access, permissionType: Permission): File
    fun setStarred(starred: Boolean): File
    fun setTrashed(trashed: Boolean): File
}

external interface FileIterator {
    fun getContinuationToken(): String
    fun hasNext(): Boolean
    fun next(): File
}

external interface Folder {
    fun addEditor(emailAddress: String): Folder
    fun addEditor(user: GoogleAppsScript.Base.User): Folder
    fun addEditors(emailAddresses: Array<String>): Folder
    fun addFile(child: File): Folder
    fun addFolder(child: Folder): Folder
    fun addViewer(emailAddress: String): Folder
    fun addViewer(user: GoogleAppsScript.Base.User): Folder
    fun addViewers(emailAddresses: Array<String>): Folder
    fun createFile(blob: BlobSource): File
    fun createFile(name: String, content: String): File
    fun createFile(name: String, content: String, mimeType: String): File
    fun createFolder(name: String): Folder
    fun getAccess(email: String): Permission
    fun getAccess(user: GoogleAppsScript.Base.User): Permission
    fun getDateCreated(): Date
    fun getDescription(): String?
    fun getEditors(): Array<User>
    fun getFiles(): FileIterator
    fun getFilesByName(name: String): FileIterator
    fun getFilesByType(mimeType: String): FileIterator
    fun getFolders(): FolderIterator
    fun getFoldersByName(name: String): FolderIterator
    fun getId(): String
    fun getLastUpdated(): Date
    fun getName(): String
    fun getOwner(): User
    fun getParents(): FolderIterator
    fun getSharingAccess(): Access
    fun getSharingPermission(): Permission
    fun getSize(): Integer
    fun getUrl(): String
    fun getViewers(): Array<User>
    fun isShareableByEditors(): Boolean
    fun isStarred(): Boolean
    fun isTrashed(): Boolean
    fun moveTo(destination: Folder): Folder
    fun removeEditor(emailAddress: String): Folder
    fun removeEditor(user: GoogleAppsScript.Base.User): Folder
    fun removeFile(child: File): Folder
    fun removeFolder(child: Folder): Folder
    fun removeViewer(emailAddress: String): Folder
    fun removeViewer(user: GoogleAppsScript.Base.User): Folder
    fun revokePermissions(user: String): Folder
    fun revokePermissions(user: GoogleAppsScript.Base.User): Folder
    fun searchFiles(params: String): FileIterator
    fun searchFolders(params: String): FolderIterator
    fun setDescription(description: String): Folder
    fun setName(name: String): Folder
    fun setOwner(emailAddress: String): Folder
    fun setOwner(user: GoogleAppsScript.Base.User): Folder
    fun setShareableByEditors(shareable: Boolean): Folder
    fun setSharing(accessType: Access, permissionType: Permission): Folder
    fun setStarred(starred: Boolean): Folder
    fun setTrashed(trashed: Boolean): Folder
}

external interface FolderIterator {
    fun getContinuationToken(): String
    fun hasNext(): Boolean
    fun next(): Folder
}

external enum class Permission {
    VIEW,
    EDIT,
    COMMENT,
    OWNER,
    ORGANIZER,
    NONE
}

external interface User {
    fun getDomain(): String
    fun getEmail(): String
    fun getName(): String
    fun getPhotoUrl(): String
    fun getUserLoginId(): String
}