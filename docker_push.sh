#!/usr/bin/env bash
set -e

./mvnw clean install -DskipTests=true
docker build -t srorange123/springboot-backend:1.0 .

echo "$DOCKER_TOKEN" | docker login -u "$DOCKER_USER" --password-stdin

docker push srorange123/springboot-backend:1.0
