import extension.*
import org.jetbrains.compose.ExperimentalComposeLibrary

plugins {
    id("multiplatform-library")
    id("org.jetbrains.compose")
}

kotlin {
    sourceSets {
        named("commonMain") {
            dependencies {
                implementation(compose.runtime)
                implementation(compose.foundation)
                implementation(compose.material3)
                implementation(compose.materialIconsExtended)
                implementation(compose.preview)
                @OptIn(ExperimentalComposeLibrary::class)
                implementation(compose.components.resources)
            }
        }
        named("commonTest") {
            dependencies {
                implementation(kotlin("test"))
            }
        }
        named("androidMain") {
            dependencies {
                implementation(libs.androidxActivities)
            }
        }
        named("androidUnitTest")
        named("desktopMain")
        named("desktopTest")
    }
}
