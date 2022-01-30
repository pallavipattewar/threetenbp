def name;
pipeline {
    agent any
    stages {
        stage('Build Stage') {
            steps {
                script{
                bat "mvn -B -DskipTests clean package"
                  }
            }
        }
                stage('Testing Stage') {
		        steps {
		          	script {
				        bat "mvn test"
					//bat "mvn test -Dtest="org.threeten.bp.TestTrial%**""                  }
				post{
                          always{
                              	junit "**/target/surefire-reports/TEST-org.joda.threeten.bp.Test**.xml"
                           }
				}
            }
        }
       }
     }
        
