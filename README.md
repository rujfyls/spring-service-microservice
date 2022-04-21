<h1>Spring User Microservice</h1>


__________________________________________________

<h5>Данный проект представляет из себя микросервис, который выполняет всего две операции, это добавление нового пользователя, и просмотр всех имеющихся. При создании нового пользователя, происходит обращение к микросервису case-service, и оттуда получаем рандомное дело, которое надо выполнить пользователю.</h5>

Особенностью данного проекта является то, что оба микросервиса загружены в  docker  hub, и оркестрирует их  k8s . Так же подключен  Admin Server  для контроля двух сервисов.

---------------------------------------------------


Технологии: Java, Spring Boot, Flyway, Swagger, Lombok, PostgreSQL, Docker, Kubernetes, Feign, AdminServer


---------------------------------------------------


**Возможности**
<br><br>

- GET method **/user-service/users** (получение всех пользователей) <br>
Формат ответа:
<pre>
{
    "id" : number,
    "name" : "string"
    "e_mail" : "string"
    "password" : "string"
    "created_at" : date
    "case_for_user" : "string"
}</pre>

- POST method **/user-service/users** (создание нового пользователя) <br>
  Формат запроса:
<pre>
{
    "name" : "string"
    "e_mail" : "string"
    "password" : "string"
}</pre>

- GET method **/admin-service** для контроля за микросервисами.



--------------------------------------------------------


**Развертывание приложения**
<br><br>
1. Запускаем БД в Docker -> _cd config-service_ -> _docker compose -f compose-environment up_
2. Запускаем bat файл для создания image и выгрузки их в docker hub, sh будет готов позднее :)
<br> _.\build_and_push_ALL_service.bat_
3. Создание кластера -> _kind create cluster --config kind-config.yml_
<br> по завершению -> _cd .._
4. Установите Ingress, реализации от NGINX
5. Применяем готовые конфигурации:
 - _kubectl apply -f ./admin-service/k8s/_
 - _kubectl apply -f ./case-service/k8s/_
 - _kubectl apply -f ./user-service/k8s/_
 - _kubectl apply -f ./config-service/ingress.yml_
6. Ingress запустится на порту: 8888
