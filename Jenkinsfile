pipeline{
	agent any
	tools
	{
		maven 'maven-3.6.3'
	}
	stages{
		stage('initial'){
		steps { cmd 'mvn clean package'} 
		}
	}
}