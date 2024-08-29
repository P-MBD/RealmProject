plugins {
    id("com.android.application")
    kotlin("android") version "1.8.0"
    kotlin("kapt") version "1.8.0"
    id("realm-android")
    id("dagger.hilt.android.plugin")
}

android {
    namespace = "com.example.realmproject"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.realmproject"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    // تنظیم نسخه جاوا برای هماهنگی با Kotlin
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.8.0")
    implementation("io.realm:realm-android-library:10.16.0")
    kapt("io.realm:realm-gradle-plugin:10.16.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.8.0")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.8.0")
    implementation("com.google.dagger:hilt-android:2.45")
    implementation("com.google.android.material:material:1.9.0")
    kapt("com.google.dagger:hilt-compiler:2.45")
}
