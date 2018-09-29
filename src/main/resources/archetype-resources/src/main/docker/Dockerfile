FROM tomcat:latest

COPY ${artifactId}.jar /usr/local/tomcat/webapps/

RUN CMD ["catlina.sh", "run"]