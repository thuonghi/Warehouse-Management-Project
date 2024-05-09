plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // implementation("org.testng:testng:7.1.0")
    implementation("org.testng:testng:7.1.0")
    // https://mvnrepository.com/artifact/org.testng/testng
    testImplementation ("org.testng:testng:7.9.0");
    // https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java
    implementation ("org.seleniumhq.selenium:selenium-java:4.18.1")
    // https://mvnrepository.com/artifact/junit/junit
    testImplementation ("junit:junit:4.13.2")
    // https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager
    implementation ("io.github.bonigarcia:webdrivermanager:5.7.0")
    // https://mvnrepository.com/artifact/org.slf4j/slf4j-simple
    testImplementation ("org.slf4j:slf4j-simple:1.7.36")
    // https://mvnrepository.com/artifact/org.apache.poi/poi
    implementation ("org.apache.poi:poi:5.2.3")
    // https://mvnrepository.com/artifact/org.apache.poi/poi-ooxml
    implementation ("org.apache.poi:poi-ooxml:5.2.3")
    // https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-core
    implementation("org.apache.logging.log4j:log4j-core:3.0.0-alpha1")
}

tasks.test {
    useJUnitPlatform()
}