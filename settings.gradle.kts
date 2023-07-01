pluginManagement {
    plugins {
        kotlin("jvm")                               version "1.8.20" apply false

        id("org.jetbrains.dokka")                       version "1.8.10" apply false
        id("com.github.spotbugs")                       version "5.0.14" apply false
        id("org.owasp.dependencycheck")                 version "6.0.1" apply false
        id("org.hidetake.swagger.generator")            version "2.18.2" apply false
        id("com.github.johnrengelman.shadow")           version "2.0.0" apply false
        id("org.jetbrains.kotlin.plugin.spring")        version "1.8.20" apply false
        id("com.github.jk1.dependency-license-report")  version "1.16" apply false

        id("idea")
        id("jacoco")
        id("checkstyle")
        id("maven-publish")
        id("signing")
    }
    repositories {
        maven(url = "https://maven.pkg.github.com/methodic-labs/methodic")
        maven(url = "https://plugins.gradle.org/m2/")
        mavenCentral()
    }
}

rootProject.name="methodic"

include("chronicle-api")
include("chronicle-server")
//include("chronicle")
include("rhizome")
include("rhizome-client")
