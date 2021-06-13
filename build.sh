docker-compose stop
docker-compose rm
mvn clean install
docker-compose build
docker-compose up -d