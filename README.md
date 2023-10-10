# RESNYX

Telegram Bot API types and methods as Java model with Jackson serialization/deserialization

Bot API 6.9  
September 22, 2023

It's recommended to first read the [manual](https://core.telegram.org/bots/api).

Compiled jar available in [this](https://maven.sergeybochkov.com/releases) repository.

Gradle Groovy example:
```groovy
repositories {
    maven {
        url "https://maven.sergeybochkov.com/releases"
    }
}

dependencies {
    implementation 'resnyx:resnyx:<version>'
}
```