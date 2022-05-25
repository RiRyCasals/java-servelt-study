docker container run -it\
                     --mount type=bind,src=$(pwd)/src,dst=/work/src\
                     tech-java:normal
