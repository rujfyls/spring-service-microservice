FROM alpine:latest
RUN apk add openjdk11
COPY /build/libs/app.jar /app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]


# .\gradlew clean build              создание jar через консоль
# ls .\build\libs\

# docker rmi rujfyls/user-service:latest удаление образа

#docker run -ti --rm -e DATASOURCE_HOST=192.168.1.58 -p 8081:8080 rujfyls/user-service:latest
#--rm очистка контейна после выхода из него
#-p 8081:8080 порт снаружи, по которому мы работаем:порт внутри контейнера