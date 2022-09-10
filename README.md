## Comandos

- mvn clean package //irá gerar o build> carros-0.0.1-SNAPSHOT.jar
- docker build -t app.jar . //gerar imagem nomeando como: app.ar
- docker images // neste caso deverá listar: app.jar
- docker run -p 8080:8080 app.jar // Gerar um container através da imagem criada, sendo necessário liberar a porta especificada para que o servidor tomcate do spring boot possa funcionar

 http://localhost:8080/ping
