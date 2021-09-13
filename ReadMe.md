# Kotlin GoogleAppScript Example

## What?
[GoogleAppsScript](https://developers.google.com/apps-script) allows you to write JavaScript based applications
that interact with various Google services (Spreadsheets, Drive, GMail, etc). The programs run in the cloud
and can be scheduled to run with a specific frequency or on specific days. 

This is a sample application demoing how to use Kotlin/JS to write code that can be run from GoogleAppsScript.

## Why?

I love Kotlin and was using GoogleAppsScript to automate report processing for my small business. I had not
used Kotlin/JS before and wanted to see if I could get it to work with GAS. (I did!) 

Now I can use my preferred language and Kotlin Multiplatform libraries to write code that interacts with 
Google services and runs automatically in GAS cloud. 

**Note:** Not everything works perfectly, I needed to manually modify the TypeScript definitions for GAS
so [Dukat](https://github.com/Kotlin/dukat) could generate the external type definitions for Kotlin.
Also there were some places I needed to use [json](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.js/json.html)
instead of the Dukat generated types when calling GAS functions.

## Setup
See [Clasp ReadMe](/clasp/ReadMe.md) for how to configure Clasp to upload your compiled code to GAS.

Then build with the Gradle task 'claspUpload' to build and upload your code.

`./gradlew ClaspUpload`