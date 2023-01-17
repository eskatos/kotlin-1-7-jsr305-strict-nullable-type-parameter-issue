import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.8.0-RC" apply false
}

project(":j") {
    apply(plugin = "java-library")
    dependencies {
        "implementation"("org.jspecify:jspecify:0.3.0")
    }
}

project(":k") {
    apply(plugin = "org.jetbrains.kotlin.jvm")
    dependencies {
        "implementation"(project(":j"))
    }
    tasks.withType<KotlinCompile>().configureEach {
        kotlinOptions {
            // Set to 1.6 to make compilation succeed
            languageVersion = "1.7"
            apiVersion = "1.7"
            freeCompilerArgs += listOf(
                "-Xjsr305=strict",
                // Uncomment to make compilation succeed
                // "-XXLanguage:-TypeEnhancementImprovementsInStrictMode",
            )
        }
    }
}

subprojects {
    configure<JavaPluginExtension> {
        toolchain {
            languageVersion.set(JavaLanguageVersion.of(11))
        }
    }
    repositories { mavenCentral() }
}
