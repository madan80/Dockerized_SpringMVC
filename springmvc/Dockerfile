# FROM instruction is used to specify the valid docker image name. This is the first instruction in Dockerfile.
# Specified Docker image is downloaded from Docker hub registry if it is not found in local.
FROM tomcat:8.0.20-jre8
#MAINTAINER instruction is used to specify about the author who creates the image.
MAINTAINER Madan
#COPY instruction is used to copy files and directories to the destination within the  filesystem of Docker image.
COPY /target/springmvc.war /usr/local/tomcat/webapps/
#CMD instruction is used to set a command to be executed when running a container. There must be only one CMD in a
# Dockerfile. If more than one CMD is found then only last CMD is effective.
CMD ["catalina.sh", "run"]