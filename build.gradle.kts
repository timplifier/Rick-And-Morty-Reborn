import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    alias(libs.plugins.agp.application) apply false
    alias(libs.plugins.agp.library) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.devtools.ksp) apply false
    id(libs.plugins.java.library.get().pluginId)
    alias(libs.plugins.dokka)
    alias(libs.plugins.ktlint) apply false
}

buildscript {
    dependencies {
        classpath(libs.dokka.gradle)
        classpath(libs.dokka.android.gradle)
        classpath(libs.dokka.android.documentation)
    }
}
allprojects {
    apply(plugin = rootProject.project.libs.plugins.dokka.get().pluginId)
    apply(plugin = rootProject.project.libs.plugins.ktlint.get().pluginId)
    tasks.withType<KotlinCompile>().configureEach {
        kotlinOptions {
            jvmTarget = rootProject.project.androidConfig.versions.kotlinJvmTarget.get()
        }
    }
}