pipeline {
    agent any //{label 'slave'}
    stages {
        stage('git_checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/Anilbamnote/student-ui-app.git'
            }
        }
        stage('build') {
            steps {
                sh 'mvn clean package'
            }
        }
        stage('test') {
            steps {
                echo "test success"
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