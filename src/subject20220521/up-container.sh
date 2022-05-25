docker container run -it\
                     -p 8080:8080\
                     --mount type=bind,src=$(pwd)/HelloServlet,dst=/usr/local/tomcat/webapps/HelloServlet\
                     tech-java:tomcat bash
