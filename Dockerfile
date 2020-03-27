FROM openjdk:8-jre

MAINTAINER Marsh Dsilva , dsilvamarsh@gmail.com

ARG JAR_FILE=target/*.war 

WORKDIR /app

COPY ${JAR_FILE} com-gabhasti-product-ux.war

ENTRYPOINT ["java", "-jar" , "com-gabhasti-product-ux.war"]

