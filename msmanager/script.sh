docker build -t robertpolanski/msmanager:v1 .

docker run -p 8080:8080 robertpolanski/msmanager:v1

docker push robertpolanski/msmanager:v1
