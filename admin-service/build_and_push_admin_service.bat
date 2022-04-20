@echo off
.\gradlew clean build & docker build . -t rujfyls/admin-service:latest & docker push rujfyls/admin-service:latest & pause
