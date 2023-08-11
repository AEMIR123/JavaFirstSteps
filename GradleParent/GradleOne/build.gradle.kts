plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(group = "com.liferay", name = "com.liferay.petra.reflect", version = "5.1.4")
    implementation(group = "com.aliyun.dts.deliver", name = "dts-deliver-api", version = "1.0.0")
}

tasks.test {
    useJUnitPlatform()
}