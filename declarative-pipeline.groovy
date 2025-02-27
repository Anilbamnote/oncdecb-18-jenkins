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
               sh '/opt/maven/bin/mvn sonar:sonar -Dsonar.projectKey=studentapp -Dsonar.host.url=http://54.169.2.191:9000 -Dsonar.login=b19ad7fb0e8127abf515458a64c49dcba8c946ef'
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