enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

dependencyResolutionManagement {
    repositories {
        mavenLocal()
        mavenCentral()

        gradlePluginPortal()

        // Geyser, Floodgate, Cumulus etc.
        maven("https://repo.opencollab.dev/main")
        maven("https://repo.opencollab.dev/maven-snapshots")

        // Minecraft
        maven("https://libraries.minecraft.net") {
            name = "minecraft"
            mavenContent {
                releasesOnly()
            }
        }

        // Architectury
        maven("https://maven.architectury.dev/")

        // Forge
        maven("https://maven.minecraftforge.net/")

        // Fabric
        maven("https://maven.fabricmc.net/")

        // Sponge Snapshots
        maven("https://repo.spongepowered.org/repository/maven-public/")

        // PackConverter
        maven("https://jitpack.io") {
            content {
                includeGroupByRegex("com\\.github\\..*")
            }
        }

        // For Adventure snapshots
        maven("https://s01.oss.sonatype.org/content/repositories/snapshots/")
    }
}

pluginManagement {
    repositories {
        gradlePluginPortal()

        maven("https://repo.opencollab.dev/maven-snapshots")
        maven("https://jitpack.io") {
            content {
                includeGroupByRegex("com\\.github\\..*")
            }
        }

        maven("https://maven.architectury.dev/")
        maven("https://maven.minecraftforge.net/")
        maven("https://maven.fabricmc.net/")
    }

    plugins {
        id("net.kyori.blossom") version "1.2.0"
        id("net.kyori.indra")
        id("net.kyori.indra.git")
    }

    includeBuild("build-logic")
}

rootProject.name = "hydraulic-parent"

include(":shared")
include(":fabric")
include(":forge")