pluginManagement {
    includeBuild("build-logic")
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS)
    repositories {
        google()
        mavenCentral()
    }

    versionCatalogs {
        create("androidConfig") {
            from(files("gradle/android-config.versions.toml"))
        }
    }
}

rootProject.name = "Rick And Morty Reborn"
include(":app")
//include(":build-logic")