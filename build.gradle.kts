import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    alias(libs.plugins.kotlin.mpp) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.compose) apply false
    alias(libs.plugins.buildconfig) apply false
}

// workaround: https://youtrack.jetbrains.com/issue/KT-55947/Unable-to-set-kapt-jvm-target-version
subprojects {
    tasks.withType(KotlinCompile::class) {
        kotlinOptions.jvmTarget = "17"
    }
}
