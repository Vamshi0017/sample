FROM openjdk:8-jdk

EXPOSE 9090

ADD target/sample-ecs-vk.jar sample-ecs-vk.jar

ENTRYPOINT ["java","-jar","sample-ecs-vk.jar"]