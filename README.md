# Spring-boot-externalize-properties
Externalize property file with spring boot



run the application by importing repo as spring boot application.

the application.properties file in the main/resource folder is overridden by the file placed in current directory/config or current directory path.

before running application check property file in config folder of this project, this application.properties file will override the property inside main/resource application.properies and somefile.properties files.

run the application and git http:localhost:8080/greetings 

in console you should see the external property values which override the internal application.properties and somefile.properties.


this is achived by configuraion in PropertiesResolver.java file.

go through PropertiesResolver.java for configuration 

to know more about overriding hireracy go through https://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-external-config.html link.


thank you for reading.
