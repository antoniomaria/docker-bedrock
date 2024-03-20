## Build docker image

docker buildx build -t app:java . -f Dockerfile

## Run docker image

docker run --rm  -it --name java-hello-app app:java