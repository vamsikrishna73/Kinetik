//plugins {
//    id("java-library")
//    alias(libs.plugins.jetbrains.kotlin.jvm)
//}
//java {
//    sourceCompatibility = JavaVersion.VERSION_11
//    targetCompatibility = JavaVersion.VERSION_11
//}
//kotlin {
//    compilerOptions {
//        jvmTarget = org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_11
//    }
//}
plugins {
    `java-gradle-plugin`
//    kotlin("jvm")
    id("org.jetbrains.kotlin.jvm") version "1.9.22"
}
repositories {
    google()
    mavenCentral()
}
group = "com.kinetik"
version = "1.0.0"

gradlePlugin {
    plugins {
        create("kinetikPlugin") {
            id = "com.kinetik.plugin"
            implementationClass = "com.kinetik.gradle.KinetikPlugin"
        }
    }
}

dependencies {
    implementation(gradleApi())
    implementation("com.android.tools.build:gradle:8.2.2")
    implementation("org.ow2.asm:asm:9.6")
    implementation("org.ow2.asm:asm-commons:9.6")
}
