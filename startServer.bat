@echo off

netstat -na | find "LISTENING" | find /C /I ":8084" > NUL
if %errorlevel%==0 goto :eof

pushd  "C:\Program Files\Apache Software Foundation\Tomcat 8.0\bin"
call startup.bat
goto :eof

:eof