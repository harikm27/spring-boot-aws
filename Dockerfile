FROM openjdk:11
EXPOSE 8080
ADD target/spring-boot-aws.war spring-boot-aws.war
ENTRYPOINT [ "java","-jar","spring-boot-aws.war"]