# Heroku
https://devcenter.heroku.com/articles/deploying-spring-boot-apps-to-heroku#creating-a-spring-boot-app
u: mpf.dejaeger@gmail.com
p: K!mm!e123

mvn clean spring-boot:run

- create a heroku account
- download and install heroku cli you can download from here https://devcenter.heroku.com/articles/deploying-spring-boot-apps-to-heroku#creating-a-spring-boot-app
- $ heroku login

- create a spring boot application using https://start.spring.io/
- or install the spring boot cli you can download from here https://docs.spring.io/spring-boot/docs/current/reference/html/getting-started.html#getting-started.installing.cli

Preparing your Spring Boot app for Heroku
- $ git init
- $ git add .
- $ git commit -m "First commit"
- $ heroku create --buildpack heroku/java

- $ git push heroku master
- $ heroku open

- $ heroku logs --tail

# Call the API
- https://peaceful-spire-50223.herokuapp.com/?username=miel