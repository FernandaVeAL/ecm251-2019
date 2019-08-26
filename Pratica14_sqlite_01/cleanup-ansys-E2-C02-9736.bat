@echo off
set LOCALHOST=%COMPUTERNAME%
if /i "%LOCALHOST%"=="E2-C02" (taskkill /f /pid 14300)
if /i "%LOCALHOST%"=="E2-C02" (taskkill /f /pid 9736)

del /F cleanup-ansys-E2-C02-9736.bat
