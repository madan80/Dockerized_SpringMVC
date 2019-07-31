Common terminology:
1. Docker: Docker is a containerization platform that packages our application and all its 
   dependencies together in the form of a docker container to ensure that the application 
   works seamlessly in any environment.
   
2. Dockerfile: Dockerfile is a text document that contains all the commands a user can
   call on the command line to assemble an image. A valid Dockerfile must start with a 
   FROM instruction.
   
3. Docker Image: It is made of a Dockerfile + any necessary dependencies.

4. Docker Container: A container is a standard unit of software that packages up code 
   and all its dependencies so the application runs quickly and reliably from one 
   computing environment to another.
   A Docker container image is a lightweight, standalone, executable package of software 
   that includes everything needed to run an application: code, runtime, system tools, 
   system libraries and settings.
   
5. Docker Compose: It is a tool for defining and running multi-container Docker 
   applications. With Compose, we use a YAML file to configure our application’s 
   services. Then, with a single command, we create and start all the services from 
   from the configuration.
   
   For more information, please visit https://docs.docker.com/compose/.



Docker installation and important commands 
(Refer https://docs.docker.com/engine/reference/commandline/docker/ for detail)
-------------------------------------------
1. Download Dockerhub from https://www.docker.com/get-started and install it on your machine.

2. Once Docker installation is complete, execute following command from terminal.

     $ docker run hello-world 
     
   Above command downloads the hello-world image and runs it.
   
3. For checking the docker images on your system, execute the following command.

     $docker images
     
4. For searching an image in the Docker Hub , execute the following command.

     $ docker search <image>
     
5.    docker run – Runs a command in a new container.
6.    docker start – Starts one or more stopped containers
7.    docker stop – Stops one or more running containers
8.    docker build – Builds an image form a Docker file
9.    docker pull – Pulls an image or a repository from a registry
10.   docker push – Pushes an image or a repository to a registry
11.   docker export – Exports a container’s filesystem as a tar archive
12.   docker exec – Runs a command in a run-time container
13.   docker search – Searches the Docker Hub for images
14.   docker attach – Attaches to a running container
15.   docker commit – Creates a new image from a container’s changes

-----------------------------------------
Writing Dockerfile: Please refer https://docs.docker.com/engine/reference/builder/ to understand various instructions.

=> Use following command to connect to a Docker container.

docker exec -it --user root container_id /bin/sh

=> Use following command to inspect the Docker container to find relevant information and IP.

    docker inspect container_id
    
=> Use following command to get container name along with respective IP address

   docker inspect -f '{{.Name}} - {{range .NetworkSettings.Networks}}{{.IPAddress}}{{end}}' $(docker ps -aq)
   
=> To delete all the images, execute following command.

  docker rmi -f $(docker images -a -q)
  
=> To delete all containers including its volumes use,
   docker rm -vf $(docker ps -a -q)

