dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS)
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
    versionCatalogs {
        create("libs") {
            from(files("../gradle/libs.versions.toml"))
        }

//        create("androidConfig") {
//            from(files("../gradle/android-config.versions.toml"))
//        }
    }
}

rootProject.name = "build-logic"
include(":convention")