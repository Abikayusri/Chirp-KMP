import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    `kotlin-dsl`
}

group = "abika.sinau.convention.buildlogic"

dependencies {
    compileOnly(libs.android.gradlePlugin)
    compileOnly(libs.android.tools.common)
    compileOnly(libs.kotlin.gradlePlugin)
    compileOnly(libs.compose.gradlePlugin)
    compileOnly(libs.ksp.gradlePlugin)
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

kotlin {
    compilerOptions {
        jvmTarget = JvmTarget.JVM_17
    }
}

tasks {
    validatePlugins {
        enableStricterValidation = true
        failOnWarning = true
    }
}

gradlePlugin {
    plugins {
        register("androidApplication") {
            id = "abika.sinau.convention.android.application"
            implementationClass = "AndroidApplicationConventionPlugin"
        }

        register("androidComposeApplication") {
            id = "abika.sinau.convention.android.application.compose"
            implementationClass = "AndroidApplicationComposeConventionPlugin"
        }

        register("cmpApplication") {
            id = "abika.sinau.convention.cmp.application"
            implementationClass = "CmpApplicationConventionPlugin"
        }
        register("kmpLibrary") {
            id = "abika.sinau.convention.kmp.library"
            implementationClass = "KmpLibraryConventionPlugin"
        }
    }
}