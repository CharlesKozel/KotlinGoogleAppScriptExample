/**
 * Any code here will run at the start of any GAS function execution. Useful for setting up dependency injection
 * or other logic that should always be run before any other part of your program.
 */
fun main() {
    println("Hello from Kotlin!")
}

@JsExport
fun demoGmail() {
    println("Running Demo Gmail")

    GmailApp.getInboxThreads(0 , 10).forEach {
        println(it.getFirstMessageSubject())
    }
}