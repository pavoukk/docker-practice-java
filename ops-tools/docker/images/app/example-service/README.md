# How to use hot reload

- Build application using maven `mvn clean package`
- Start docker compose using `docker-compose -f ops-tools/docker/docker-compose.yml up`
- Create application run configuration in IDE for `org.springframework.boot.devtools.RemoteSpringApplication`
- Configure `http://localhost:8888` as program arguments for created application run configuration
- Run created run configuration
- To check hot reload, open <http://localhost:8888/hello>, try to change `net.thumbtack.exampleservice.endpoints.HelloController.hello`, and hit `Build -> Build project` (Ctrl + F9)
