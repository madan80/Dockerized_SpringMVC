# FROM instruction is used to specify the valid docker image name. This is the first instruction in Dockerfile.
# Specified Docker image is downloaded from Docker hub registry if it is not found in local.
FROM mysql:5.7.23
#MAINTAINER instruction is used to specify about the author who creates the image.
MAINTAINER Madan
#COPY instruction is used to copy files and directories to the destination within the  filesystem of Docker image.
COPY initdb.d/* /docker-entrypoint-initdb.d/
COPY conf.d/* /etc/mysql/conf.d/
#ENV instruction is used to set environment variable with key and value.
ENV MYSQL_HOST=localhost
ENV MYSQL_ROOT_PASSWORD=root

