plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.example.samsungcallrecorderhelper"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.samsungcallrecorderhelper"
        minSdk = 26
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
    }

    // Keep Java and Kotlin bytecode targets aligned for GitHub Actions builds.
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = "17"
    }
}
