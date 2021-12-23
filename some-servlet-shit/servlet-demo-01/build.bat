@ECHO OFF

call mvn clean install
call docker rmi -f servlet-demo-01:1.1
call docker build -t servlet-demo-01:1.1 .

echo Done script...
timeout /t 5