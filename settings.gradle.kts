pluginManagement {
    plugins {
        kotlin("jvm")                               version "1.6.10" apply false

        id("org.jetbrains.dokka")                       version "0.9.18" apply false
        id("com.github.spotbugs")                       version "5.0.4" apply false
        id("org.owasp.dependencycheck")                 version "6.0.1" apply false
        id("org.hidetake.swagger.generator")            version "2.18.2" apply false
        id("com.github.johnrengelman.shadow")           version "2.0.0" apply false
        id("org.jetbrains.kotlin.plugin.spring")        version "1.6.10" apply false
        id("com.github.jk1.dependency-license-report")  version "1.16" apply false
        id("com.gradle.build-scan")                     version "3.9" apply false
        id("signing")
    }
    repositories {
        maven(url = "https://maven.pkg.github.com/methodic-labs/methodic")
        maven(url = "https://plugins.gradle.org/m2/")
        mavenCentral()
    }

    buildScan {
        termsOfServiceUrl = "https://gradle.com/terms-of-service"
        termsOfServiceAgree = "yes"
    }
}

rootProject.name="methodic"

include("chronicle-api")
include("chronicle-server")
include("chronicle")
include("rhizome")
include("rhizome-client")
include("shared-gradles")
