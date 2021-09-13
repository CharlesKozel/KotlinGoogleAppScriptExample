plugins {
    kotlin("js") version "1.5.30"
}

group = "charles.kozel"
version = "1.0-SNAPSHOT"

repositories {
    jcenter()
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

kotlin {
    js(IR) {
        binaries.executable()
        browser {

        }
    }

    sourceSets {
        val main by getting {
            kotlin.srcDirs("$projectDir/src/main/kotlinExternals")
        }
    }
}

/**
 * Takes the compiled Kotlin/JS code and prepends the "PrependToGoogleAppsScript.js" contents to create a new .js file.
 * This is done to expose top level functions to the GAS console.
 */
tasks.register("ClaspPackage") {
    dependsOn("build", "cleanTest", "test", "ClaspCopy")
    doLast {
        println("Clasp Package Running...")

        val prependToScript = File("$projectDir/src/PrependToGoogleAppsScript.js")
        val webPackedJs = File("$buildDir/distributions/KotlinGoogleAppScriptExample.js")

        val claspOutputFile = File("$buildDir/clasp/compiled.js")
        claspOutputFile.parentFile.mkdirs()
        claspOutputFile.writeBytes(prependToScript.readBytes())
        claspOutputFile.appendBytes(webPackedJs.readBytes())

        println("Clasp Package Complete.")
    }
}

tasks.register<Copy>("ClaspCopy") {
    from(layout.projectDirectory.file("clasp/.clasp.json"), layout.projectDirectory.file("clasp/appsscript.json"))
    into(layout.buildDirectory.dir("clasp"))
}

task<Exec>("ClaspUpload") {
    dependsOn("ClaspPackage")
    workingDir("$buildDir/clasp")

    if (System.getProperty("os.name").toLowerCase().contains("windows")) {
        commandLine("cmd", "/c", "clasp push")
    } else {
        commandLine("clasp push")
    }
}

/* TODO not sure what is going on, but this logic is needed to make the test task
*   run/fail again after it already failed but no source changes were made.
*   Otherwise rerunning a failed build result in a pass. */
tasks.named("test") {
    outputs.upToDateWhen { false }
    dependsOn("cleanTest")
}
