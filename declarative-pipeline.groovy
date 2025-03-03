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
         stage('artifact-upload') {
            steps {
               sh 'aws s3 cp target/studentapp-2.2-SNAPSHOT.war  s3://my-terra-bucket00999'
           }
        }
    }
        // stage('deploy') {
        //     steps {
        //         deploy adapters: [tomcat9(credentialsId: 'tomacat-cred', path: '', url: 'http://47.128.241.201:8080')], contextPath: '/', war: '**/*.war'
        //     }
        // }
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