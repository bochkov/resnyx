# RESNYX

Telegram Bot API types and methods as Java model with Jackson serialization/deserialization

Bot API 10.1  
June 11, 2026

It's recommended to first read the [manual](https://core.telegram.org/bots/api).

Compiled jar available in [this](https://maven.sergeybochkov.com/#/releases/resnyx/resnyx) repository.

Gradle Groovy example:
```groovy
repositories {
    maven {
        url "https://maven.sergeybochkov.com/maven2/releases"
    }
}

dependencies {
    implementation 'resnyx:resnyx:<version>'
}
```