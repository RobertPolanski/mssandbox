docker build -t robertpolanski/calculator:v1 .

docker run -p 8080:8080 robertpolanski/calculator:v1

docker push robertpolanski/calculator:v1
