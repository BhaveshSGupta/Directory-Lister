@echo off
set %b=C:\Users\Bhavesh\Desktop\afflited marketing
for /d %b in (*.*) do dir /on "%%a" >> get_list.txt
