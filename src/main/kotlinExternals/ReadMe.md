## What are Kotlin Externals?
When compiling Kotlin for JavaScript you can declare types/functions that will be available 
to the executing Kotlin/JS code with the **external** keyword. 
https://kotlinlang.org/docs/js-interop.html#external-modifier

They are kinda like **.d.ts* files when using TypeScript. 

These files specify some interfaces available when using Google Apps Script. 

## How were these files created?
Google provides TypeScript definitions for Google Apps Script interfaces [in this NPM package](https://www.npmjs.com/package/@types/google-apps-script). 
You can depend on NPM packages though Gradle, and if they contain TypeScript definitions the Kotlin Gradle
plugin will attempt to automatically generate External definitions using [Dukat](https://github.com/Kotlin/dukat).

However for the Google Apps Script TypeScript definitions the "API" definitions have nested namespaces that
result in incomplete external files generated which result in compilation errors.

I worked around this by manually editing the TypeScript definitions for the interfaces I needed to remove 
the nested namespaces and then manually running Dukat on the modified files. 