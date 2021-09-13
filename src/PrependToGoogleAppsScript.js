/* Exposes @JsExport functions in Kotlin as top level functions in the GAS code
* so they can be referenced from the GAS console.
* This is manually generated so must be kept in sync with Main.kt
*
* Kotlin code is compiled to JS which will expose a global named based on the project eg: KotlinGoogleAppScriptExample
* Any @JsExport functions are exposed on that object.
* */

function demoGmail() {
    KotlinGoogleAppScriptExample.demoGmail()
}
