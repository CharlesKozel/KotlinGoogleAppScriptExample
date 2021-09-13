package GoogleAppsScript.Utilities

import GoogleAppsScript.Byte
import GoogleAppsScript.Base.Date
import GoogleAppsScript.Base.BlobSource
import GoogleAppsScript.Base.Blob
import GoogleAppsScript.Char
import GoogleAppsScript.Integer

external enum class Charset {
    US_ASCII,
    UTF_8
}

external enum class DigestAlgorithm {
    MD2,
    MD5,
    SHA_1,
    SHA_256,
    SHA_384,
    SHA_512
}

external enum class MacAlgorithm {
    HMAC_MD5,
    HMAC_SHA_1,
    HMAC_SHA_256,
    HMAC_SHA_384,
    HMAC_SHA_512
}

external enum class RsaAlgorithm {
    RSA_SHA_1,
    RSA_SHA_256
}

external interface Utilities {
    var Charset: Any
    var DigestAlgorithm: Any
    var MacAlgorithm: Any
    var RsaAlgorithm: Any
    fun base64Decode(encoded: String): Array<Byte>
    fun base64Decode(encoded: String, charset: Charset): Array<Byte>
    fun base64DecodeWebSafe(encoded: String): Array<Byte>
    fun base64DecodeWebSafe(encoded: String, charset: Charset): Array<Byte>
    fun base64Encode(data: Array<Byte>): String
    fun base64Encode(data: String): String
    fun base64Encode(data: String, charset: Charset): String
    fun base64EncodeWebSafe(data: Array<Byte>): String
    fun base64EncodeWebSafe(data: String): String
    fun base64EncodeWebSafe(data: String, charset: Charset): String
    fun computeDigest(algorithm: DigestAlgorithm, value: Array<Byte>): Array<Byte>
    fun computeDigest(algorithm: DigestAlgorithm, value: String): Array<Byte>
    fun computeDigest(algorithm: DigestAlgorithm, value: String, charset: Charset): Array<Byte>
    fun computeHmacSha256Signature(value: Array<Byte>, key: Array<Byte>): Array<Byte>
    fun computeHmacSha256Signature(value: String, key: String): Array<Byte>
    fun computeHmacSha256Signature(value: String, key: String, charset: Charset): Array<Byte>
    fun computeHmacSignature(algorithm: MacAlgorithm, value: Array<Byte>, key: Array<Byte>): Array<Byte>
    fun computeHmacSignature(algorithm: MacAlgorithm, value: String, key: String): Array<Byte>
    fun computeHmacSignature(algorithm: MacAlgorithm, value: String, key: String, charset: Charset): Array<Byte>
    fun computeRsaSha1Signature(value: String, key: String): Array<Byte>
    fun computeRsaSha1Signature(value: String, key: String, charset: Charset): Array<Byte>
    fun computeRsaSha256Signature(value: String, key: String): Array<Byte>
    fun computeRsaSha256Signature(value: String, key: String, charset: Charset): Array<Byte>
    fun computeRsaSignature(algorithm: RsaAlgorithm, value: String, key: String): Array<Byte>
    fun computeRsaSignature(algorithm: RsaAlgorithm, value: String, key: String, charset: Charset): Array<Byte>
    fun formatDate(date: Date, timeZone: String, format: String): String
    fun formatString(template: String, vararg args: Any): String
    fun getUuid(): String
    fun gzip(blob: BlobSource): Blob
    fun gzip(blob: BlobSource, name: String): Blob
    fun newBlob(data: Array<Byte>): Blob
    fun newBlob(data: Array<Byte>, contentType: String): Blob
    fun newBlob(data: Array<Byte>, contentType: String, name: String): Blob
    fun newBlob(data: String): Blob
    fun newBlob(data: String, contentType: String): Blob
    fun newBlob(data: String, contentType: String, name: String): Blob
    fun parseCsv(csv: String): Array<Array<String>>
    fun parseCsv(csv: String, delimiter: Char): Array<Array<String>>
    fun sleep(milliseconds: Integer)
    fun ungzip(blob: BlobSource): Blob
    fun unzip(blob: BlobSource): Array<Blob>
    fun zip(blobs: Array<BlobSource>): Blob
    fun zip(blobs: Array<BlobSource>, name: String): Blob
    fun jsonParse(jsonString: String): Any
    fun jsonStringify(obj: Any): String
}