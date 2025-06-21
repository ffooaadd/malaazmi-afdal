pluginManagement {
    repositories {
        google()
        mavenCentral()
        maven("https://jitpack.io") // ✅ لدعم مكتبات من GitHub مثل android-pdf-viewer
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven("https://jitpack.io") // ✅ تأكد أن هذا موجود لدعم jitpack
    }
}

rootProject.name = "MalaazmiAFDAL"
include(":app")
