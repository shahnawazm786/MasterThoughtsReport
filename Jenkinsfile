
pipeline {
agent any
stages {
stage('Compile') {
steps {
echo 'Compiling..'
build 'Compile'
}
}
stage('Code_Review') {
steps {
echo 'Code Review..'
build 'Code_Review'
}
}
stage('Test') {
steps {
echo 'Testing..'
build 'Test'
}
}
stage('Build and Deploy') {
steps {
echo 'Deploying….'
build 'Build and Deploy'
}
}
}
post
{
failure
{
echo 'Build Failed'
}
}
}
