docker container run -it\
                     -p 8080:8080\
                     --mount type=bind,src=$(pwd)/Sample,dst=/usr/local/tomcat/webapps/Sample\
                     tech-java:tomcat bash
