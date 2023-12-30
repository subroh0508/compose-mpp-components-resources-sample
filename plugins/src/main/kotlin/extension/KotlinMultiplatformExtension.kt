package extension

import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension

enum class Target { ANDROID, DESKTOP }

fun KotlinMultiplatformExtension.targets(vararg target: Target) {
    applyDefaultHierarchyTemplate()
    target.toList().forEach {
        when (it) {
            Target.ANDROID -> androidTarget()
            Target.DESKTOP -> desktop()
        }
    }
}

private fun KotlinMultiplatformExtension.desktop() {
    jvm("desktop") {
        compilations.all {
            kotlinOptions.jvmTarget = "17"
        }
    }
}
