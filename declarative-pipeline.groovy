pipeline {
    agent  {label 'node1'}
    stages {
        stage('git_checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/Anilbamnote/student-ui-app.git'
            }
        }
        stage('build') {
            steps {
                sh '/opt/maven/bin/mvn clean package'
            }
        }
        stage('test') {
            steps {
               withSonarQubeEnv(installationName: 'sonar', credentialsId: 'sonar-cred') {
                 sh '/opt/maven/bin/mvn sonar:sonar'
            }


            }
        }
        stage('Quality_Gate') {
            steps {
             timeout(10) {
                
               }
                 waitForQualityGate true
            }
        }
        stage('deploy') {
            steps {
                echo "depoly success"
            }
        }
    }
}





// pipeline {
//     agent {label 'slave'}
//     stages {
//         stage('git_ckeckout') {
//             steps {
//                 echo "pull success"
//             }
//         }
//         stage('bild') {
//             steps {
//                 echo "bild success"
//             }
//         }
//         stage('test') {
//             steps {
//                 echo "test success"
//             }
//         }
//         stage('Deploy') {
//             steps {
//                 echo "Deploy success"
//             }
//         }
//     }
// }