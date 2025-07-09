# StudentData_API
### Technologies Used 
Java Spring Boot 3.5.3 , Maven 3.9.10 , PostgreSql , 

### Dependencies Used 
Spring Web , Jpa , Postgresql Driver , Thymeleaf 

#### Steps to Use this API 
Step 1 : Clone this Repo 
Step 2 : Connect the database i.e change the application.properties ... Database connection Strings 
Step 3 : Run this program 

Get All Data By 
http://localhost:8080/students

Get data using ID 
http://localhost:8080/students/ID

Post Data 
http://localhost:8080/students
{   
    "course":"CSE",
    "email":"raunakranjann@gmail.com",
    "phno":"1234567890",
    "name":"Raunak Ranjan",
    "roll":"22CS03"
}

Post Multiple Data
http://localhost:8080/students/multiple

[{   
    "course":"CSE",
    "email":"saurabh@gmail.com",
    "phno":"1234567890",
    "name":"Saurabh bist",
    "roll":"22CS07"
},{   
    "course":"CSE",
    "email":"dev@gmail.com",
    "phno":"1234567890",
    "name":"Dev Soni",
    "roll":"22CS11"
}]







Update Data using ID
http://localhost:8080/students/ID

{   
    "course":"CSE",
    "email":"xyz@gmail.com",
    "phno":"00112901",
    "name":"Raunak Ranjan",
    "roll":"22CS007"
}

Delete Data using ID 
http://localhost:8080/students/ID
