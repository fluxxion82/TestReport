// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    repositories {
        google()
        mavenCentral()
        mavenLocal()
        gradlePluginPortal()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:7.2.0")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.7.10")
    }
}

// does not create jacocoTestReportTest anywhere
//allprojects {
//    apply(plugin = "jacoco")
//}

// does not create jacocoTestReportTest anywhere here, but in my project I see it under the project tasks
subprojects {
    apply(plugin = "jacoco")
}
