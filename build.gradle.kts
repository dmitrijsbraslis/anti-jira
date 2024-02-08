plugins {
    id("java")
}

group = "com.app"
version = "0.1"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web:3.2.0")
    implementation("org.springframework.boot:spring-boot-starter-thymeleaf:3.2.0")
    implementation("org.springframework.boot:spring-boot-starter-jdbc:3.2.0")
    implementation("org.springframework.boot:spring-boot-starter-security:3.2.0")
    implementation("org.postgresql:postgresql:42.7.1")

    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}