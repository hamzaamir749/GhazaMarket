pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
        maven(url = "https://jitpack.io")
    }

    resolutionStrategy.eachPlugin {
        when (requested.id.id) {
            "dagger.hilt.android.plugin" -> {
                useModule("com.google.dagger:hilt-android-gradle-plugin:2.44")
            }
            "com.google.gms.google-services" -> {
                useModule("com.google.gms:google-services:4.3.14")
            }
            "com.google.firebase.crashlytics" -> {
                useModule("com.google.firebase:firebase-crashlytics-gradle:2.9.2")
            }
        }
    }
}


dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven(url = "https://jitpack.io")
    }
}
rootProject.name = "Ghaza Market"
include(":app")
