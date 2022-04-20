@echo off
.\gradlew clean build & docker build . -t rujfyls/case-service:latest & docker push rujfyls/case-service:latest & pause
