pipeline {

tools{
    maven 'maven default'
}
agent  any

stages {
    stage('Maven build') {
        steps {
           sh 'mvn clean install'                
            }
        }
    }
}
