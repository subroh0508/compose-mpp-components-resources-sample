plugins {
    id("android-application")
}

dependencies {
    implementation(compose.runtime)
    implementation(compose.foundation)
    implementation(compose.material3)
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.core)
    implementation(libs.androidx.activity.compose)

    implementation(project(":features:module1"))
    // implementation(project(":features:module2"))
}

android { namespace = "app.compose.mpp.sample" }
