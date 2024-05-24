
## Spring Boot Application with Helm Deployment using Jenkins Pipeline
This repository contains a Spring Boot application and the necessary configuration for create container image with aplication, deployment using Helm charts and a Jenkins pipeline.

### Project Structure
* `src/main/java:` Source code for your Spring Boot application.\
* `pom.xml:` Maven project configuration file.
* `charts:` Helm chart directory.
  * `Chart.yaml:` Helm chart definition.
  * `templates:` Helm chart template files.
    * `deployment.yaml:` Deployment manifest template.
    * `service.yaml:` Service manifest template.
    * `values.yaml:` Default values for the chart.
* `Dockerfile:` To buling image with sample springboot application jar
* `Jenkinsfile:` Jenkins pipeline script to automate build, build a image and push to artifactory and deployment with helm package.

### Prerequisites
* Java
* Maven
* Helm
* Artifactory
* k3d server
* Jenkins

### Building and Packaging
Clone the repository.
Navigate to the project directory:
```
cd sample-springboot-cicd-k8s
```
Build and package the Spring Boot application using Maven:
```
mvn clean package
```
This will create a JAR file in the target directory, typically named \<application-name\>.jar.

#### Deploying with Helm

Navigate to the charts directory:
```
cd sample-springboot-cicd-k8s/charts
```
Use below command to install helm chart directly from project folder into k3d (Note: make sure k3d cnnection established)
```
helm install <remote-app-name> <local-app-name>
```                                    

### Jenkins Pipeline
This project includes a Jenkinsfile that defines a Jenkins pipeline for building application, creating container image and push to artifactory and deploying the application using Helm.


### Running the Pipeline:

* Create a job in Jenkins and configure it to use the Jenkinsfile from your repository.
* Trigger the job to initiate the build and deployment pipeline..

