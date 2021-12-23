FROM tomcat:jre8-openjdk-slim-buster

LABEL authors="duyanhnn@outlook.com"

# set log4j2.formatMsgNoLookups=true to avoid Log4j vulnerability
ENV JAVA_OPTS="$JAVA_OPTS -Dlog4j2.formatMsgNoLookups=true"

COPY ./target/servlet-demo-01.war $CATALINA_HOME/webapps/ROOT.war

EXPOSE 8080