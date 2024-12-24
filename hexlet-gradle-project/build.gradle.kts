/*
 * This file was generated by the Gradle 'init' task.
 *
 * This is a general purpose Gradle build.
 * To learn more about Gradle by exploring our Samples at https://docs.gradle.org/8.7/samples
 * This project uses @Incubating APIs which are subject to change.
 */
plugins {
    id("se.patrikerdes.use-latest-versions") version "0.2.18"
    id("com.github.ben-manes.versions") version "0.51.0"

    // Поддержка запуска из командной строки
    application
}

repositories {
    // Подключаем автоматическая работа с репозиторием Maven Central
    mavenCentral()
}

// Для плагина application указываем главный класс приложения
application {
    // Входная точка
    mainClass.set("io.hexlet.example.App")
}

// Библиотеки зависимостей
dependencies {
    implementation("org.apache.commons:commons-lang3:3.17.0")
}