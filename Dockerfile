FROM openjdk:17-alpine
	ENV APP_NAME aws
	COPY ./target/*.jar  /app/aws.jar
	WORKDIR /app
	ENTRYPOINT ["java","-jar","aws.jar"]
	EXPOSE 80