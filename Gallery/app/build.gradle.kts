
plugins {
    // Apply the application plugin to add support for building a CLI application in Java.
    application
}

repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()
}

dependencies {
    // This dependency is used by the application.
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.9.2")
}

tasks.test {
	useJUnitPlatform()
    testLogging {
		events("failed")
        exceptionFormat = org.gradle.api.tasks.testing.logging.TestExceptionFormat.FULL
	}
}

// Apply a specific Java toolchain to ease working on different environments.
java {                                      
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

application {
    // Define the main class for the application.
    mainClass.set("com.stj.polyglot.gallery.Gallery")
}
