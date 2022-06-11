docker container run -it\
                     -p 8080:8080\
                     --mount type=bind,src=$(pwd)/CompoundInterest,dst=/usr/local/tomcat/webapps/CompoundInterest\
                     tech-java:tomcat bash
