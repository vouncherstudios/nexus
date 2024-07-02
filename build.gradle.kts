plugins {
    id("net.kyori.indra") version Versions.INDRA
}

allprojects {
    group = "com.vouncherstudios"
    version = "1.0.0"
    description = "A runtime dependency management library for Java."
}

subprojects {
    apply(plugin = "net.kyori.indra")

    repositories {
        mavenCentral()
    }

    indra {
        javaVersions {
            target(8)
        }
    }
}