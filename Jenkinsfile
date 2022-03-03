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
				//def count = demo()
				int count = 4
				
				if(count == 0) 
				{
					//bat "mvn test -Dtest="org.threeten.bp.TestTrial""
					bat "mvn test -Dtest=!TestTrial"
                   		 }
				else
				{
					//bat "mvn test -Dtest=!"org.threeten.bp.TestTrial""
					bat "mvn test -Dtest=TestTrial"
					
				}
			}
			
		}
		post{
			
                          always{
                              	//junit "**/target/surefire-reports/TEST-org.joda.time.TestAllPackages.xml"
				  junit "**/target/surefire-reports/TEST-org.threeten.bp.TestTrial.xml"
				//log()
                        
                       }
	}
    }
}

}
