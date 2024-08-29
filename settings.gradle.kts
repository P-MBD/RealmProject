pluginManagement {
    repositories {
        google()
        mavenCentral()
        maven { url = uri("https://jitpack.io") } // اضافه کردن مخزن JitPack
        gradlePluginPortal()


    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven { url = uri("https://jitpack.io") } // اضافه کردن مخزن JitPack


    }
}

rootProject.name = "RealmProject"
include(":app")