@echo off
cd ..\user-service\ & build_and_push_user_service.bat & cd ..\case-service\ & build_and_push_case_service.bat & cd ..\admin-service\ & build_and_push_admin_service.bat & pause
