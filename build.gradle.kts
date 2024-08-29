buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:8.0.2")
        classpath("com.google.dagger:hilt-android-gradle-plugin:2.45")
        classpath("io.realm:realm-gradle-plugin:10.16.0") // استفاده از نسخه موجود
    }
}
