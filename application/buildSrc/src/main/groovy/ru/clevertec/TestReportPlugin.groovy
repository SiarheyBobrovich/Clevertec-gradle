package ru.clevertec

import org.gradle.api.Project
import org.gradle.api.Plugin

class TestReportPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        project.tasks.register("deleteReportDir") {
            doFirst {
                project.delete "$project.rootDir/reports"
            }
        }

        project.tasks.register('copyReports') {
            dependsOn 'deleteReportDir'

            onlyIf {
                project.file("$project.buildDir").exists()
            }
            doFirst {
                project.copy {
                    from("$project.buildDir/reports")
                    into("$project.rootDir/reports/reports")
                }
            }
            doLast {
                project.copy {
                    from("$project.buildDir/test-results")
                    into("$project.rootDir/reports/test-results")
                }
            }
        }
    }
}
