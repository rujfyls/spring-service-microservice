@echo off
.\gradlew clean build & docker build . -t rujfyls/user-service:latest & docker push rujfyls/user-service:latest & pause
