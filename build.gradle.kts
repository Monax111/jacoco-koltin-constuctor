plugins {
    kotlin("jvm") version "1.6.10"

    jacoco
}

allprojects {
    group = "ru.tinkoff.top.ci"
    version = "1"
}

repositories {
    mavenCentral()
}



dependencies {

    testImplementation(group = "org.junit.jupiter", name = "junit-jupiter-api", version = "5.9.1")
    testRuntimeOnly(group = "org.junit.jupiter", name = "junit-jupiter-engine", version = "5.9.1")

}


tasks {
    wrapper {
        gradleVersion = "7.4"
    }

}




tasks {
    jacocoTestReport {
        reports {
            html.required.set(true)
        }
        dependsOn(test)
    }

    jacocoTestCoverageVerification {
        violationRules {
            rule {
                limit {
                    minimum = "1.0".toBigDecimal() // проверяем 100% покрытие
                }
            }
        }
        dependsOn(test)
    }

    check {
        dependsOn(jacocoTestCoverageVerification)
    }

    test{
        useJUnitPlatform()
    }
}
