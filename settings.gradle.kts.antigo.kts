import java.util.Properties

// Carrega as propriedades do arquivo 'secrets.properties'
val secrets = Properties()
val secretsFile = file("secrets.properties")
if (secretsFile.exists()) {
    secrets.load(secretsFile.inputStream())
}

pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven {
            url = uri("https://api.mapbox.com/downloads/v2/releases/maven")
            authentication {
                // VERSÃO FINAL: Usando o caminho completo, que não dá erro.
                create<org.gradle.api.artifacts.repositories.BasicAuthentication>("basic")
            }
            credentials {
                username = "mapbox"
                password = secrets.getProperty("MAPBOX_API_KEY")
            }
        }
    }
}

rootProject.name = "Zippy GO"
include(":app")