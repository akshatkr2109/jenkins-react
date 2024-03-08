pipeline {
    agent any

    stages {
        stage('List Snapshots') {
            steps {
                sh 'echo "Hello"'
                sh 'export a="first word"'
                    }
                }
        stage('Check value') {
            steps {
                sh 'echo "$a"'
                sh 'echo "----"'
                sh 'echo $a'
                sh 'echo "----"'
                    }
                }
        // stage('Ask for Input') {
        //     steps {
        //         script {
        //             def userInput = input(
        //                 id: 'deleteInput',
        //                 message: 'Do you want to delete any snapshot? Type "yes" to proceed, or "no" to abort.',
        //                 parameters: [string(defaultValue: 'no', description: 'User input', name: 'Delete')]
        //             )

        //             if (userInput.toLowerCase() == 'yes') {
        //                 echo 'Deleting snapshots...'
        //                 // You may add the deletion logic here using AWS CLI or SDK
        //                 // Example: sh "aws ec2 delete-snapshot --snapshot-id <snapshot-id>"
        //             } else {
        //                 error('Pipeline aborted as per user input.')
        //             }
        //         }
        //     }
        // }
    }
}