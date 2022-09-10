pipeline{

    agent any

    stages {

        stage ('Compile Stage') {

            steps {

                withMaven(maven: 'apache-maven-3.6.3') {
                    sh 'mvn clean install'

                }

            }
        }
    stage ('Test Stage') {

            steps {

                withMaven(maven: 'apache-maven-3.6.3') {
                    sh 'mvn test'

                }

            }
        }


        stage ('Cucumber Reports') {

            steps {
                cucumber buildStatus: "UNSTABLE",
                    fileIncludePattern: "**/cucumber.json",
                    jsonReportDirectory: 'target'

            }

        }

    }

}
