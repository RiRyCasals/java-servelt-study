docker container run -it\
                     -p 8080:8080\
                     --mount type=bind,src=$(pwd)/Example,dst=/usr/local/tomcat/webapps/Example\
                     --mount type=bind,src=$(pwd)/ex,dst=/usr/local/tomcat/webapps/ex\
                     tech-java:tomcat bash
