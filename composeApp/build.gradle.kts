import org.jetbrains.compose.desktop.application.dsl.TargetFormat
import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl

plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.composeMultiplatform)
    alias(libs.plugins.composeCompiler)
    id("maven-publish")
    id("com.vanniktech.maven.publish") version "0.36.0"
}

kotlin {
    js {
        browser()
        binaries.executable()
    }

    @OptIn(ExperimentalWasmDsl::class)
    wasmJs {
        browser()
        binaries.executable()
    }



    sourceSets {
        commonMain.dependencies {
            implementation(libs.compose.runtime)
            implementation(libs.compose.foundation)
            implementation(libs.compose.material3)
            implementation(libs.compose.ui)
            implementation(libs.compose.components.resources)
            implementation(libs.compose.uiToolingPreview)
            implementation(libs.androidx.lifecycle.viewmodelCompose)
            implementation(libs.androidx.lifecycle.runtimeCompose)

            implementation(kotlinWrappers.browser)
            implementation(kotlinWrappers.js)
            implementation(kotlinWrappers.web)
        }
        commonTest.dependencies {
            implementation(libs.kotlin.test)
        }
    }
}

group = "io.github.ujimatsudoma"
version = "0.0.1"

mavenPublishing {
    publishToMavenCentral()

    signAllPublications()

    coordinates(group.toString(), "kotlin-eagle-cool", version.toString())

    pom {
        name = "kotlin-eagle-cool"
        description = "Kotlin wrapper of Eagle Plugin API"
        inceptionYear = "2026"
        url = "https://github.com/UjimatsuDoma/kotlin-eagle-cool"
        licenses {
            license {
                name.set("The Apache License, Version 2.0")
                url.set("https://www.apache.org/licenses/LICENSE-2.0.txt")
                distribution.set("https://www.apache.org/licenses/LICENSE-2.0.txt")
            }
        }
        developers {
            developer {
                id = "UjimatsuDoma"
                name = "宇治松童磨"
                url = "https://github.com/UjimatsuDoma"
            }
        }
        scm {
            url.set("https://github.com/UjimatsuDoma/ChaquoFontTools")
            connection.set("scm:git:git://github.com/UjimatsuDoma/ChaquoFontTools.git")
            developerConnection.set("scm:git:ssh://git@github.com:UjimatsuDoma/ChaquoFontTools.git")
        }
    }
    publishing {
        publications {
            repositories {
                maven {
                    credentials {
                        username = System.getenv("USERNAME")
                        password = System.getenv("PASSWORD")
                    }
                }
            }
        }
    }
}

//publishing {
//    publications {
//        create<MavenPublication>("maven") {
//            from(components["kotlin"]) // Automatically includes target artifacts
//            groupId = "io.github.ujimatsudoma"
//            artifactId = "kotlin-eagle-cool"
//            version = "0.0.1-SNAPSHOT"
//        }
//    }
//    repositories {
//        maven {
//            url = uri("https://github.com/UjimatsuDoma/kotlin-eagle-cool")
//        }
//    }
//}