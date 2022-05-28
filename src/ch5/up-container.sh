docker container run -it\
                     -p 8080:8080\
                     --mount type=bind,src=$(pwd)/Sample,dst=/usr/local/tomcat/webapps/Sample\
                     --mount type=bind,src=$(pwd)/RegistrationForm,dst=/usr/local/tomcat/webapps/RegistrationForm\
                     tech-java:tomcat bash
