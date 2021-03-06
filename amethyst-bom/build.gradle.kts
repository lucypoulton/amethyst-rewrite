plugins {
    `java-platform`
}

repositories {
    mavenCentral()
}

javaPlatform.allowDependencies()

val squirtgunVersion = "2.0.0-pre8"
val adventureVersion = "4.9.3"
val gsonVersion = "2.8.0"
val configurateVersion = "4.1.2"

dependencies {
    constraints {
        api("net.lucypoulton:squirtgun-api:$squirtgunVersion")
        api("net.kyori:adventure-api:$adventureVersion")
        api("org.spongepowered:configurate-core:$configurateVersion")
        api("org.jetbrains:annotations:22.0.0")

        api("com.google.code.gson:gson:$gsonVersion") {
            because("minecraft uses ancient versions of gson")
        }
        api("org.spongepowered:configurate-gson:$configurateVersion")
        api("net.lucypoulton:squirtgun-platform-bukkit:$squirtgunVersion")
    }
}