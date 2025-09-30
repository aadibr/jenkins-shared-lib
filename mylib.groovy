// vars/myLib.groovy

def cleanWorkspace() {
    echo "Cleaning workspace..."
    deleteDir()
}

def cloneRepo(String repoUrl) {
    echo "Cloning repository: ${repoUrl}"
    git url: repoUrl
}

def buildApp() {
    echo "Building application..."
    sh './build.sh'  // Replace with your actual build command
}

def deployApp(String env) {
    echo "Deploying to ${env}..."
    sh "./deploy.sh ${env}"  // Replace with your deploy command
}

