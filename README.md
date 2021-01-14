Airline with Microserive
=============
This project is a master's degree thesis in February 2021. Airline with microservice is based on event-driven architecture and
asynchronous communication. This web project implemented airline booking service using [RabbitMQ](https://www.rabbitmq.com/) and microservice architecture. 
Then i used the load test tool [nGrinder](http://naver.github.io/ngrinder/) to perform stress test.
> The whole project was writen with Spring([STS](https://spring.io/tools))

사진 1

How to Run
=============
Requirements
-------------
This project was built in Ubuntu 20.04.1 LTS.
* [Spring Tool Suite 4.8.0 - Linux 64-Bit](https://spring.io/tools)
* [RabbitMQ](https://www.rabbitmq.com/)
* [Apache Maven 3.6.3](https://maven.apache.org/)

Clone this repo
-------------
    git clone https://github.com/JungTaeCAU/airlineweb/edit/main/README.md

Run in Local
-------------
1. Booking Service
    $ cd Booking-Service
    $ mvn clean install -Dmaven.test.skip=true
2. Search Service
    $ cd Search-Service
    $ mvn clean install -Dmaven.test.skip=true
3. Fares Service
    $ cd Fares-Service
    $ mvn clean install -Dmaven.test.skip=true
4. CheckIn Service
    $ cd CheckIn-Service
    $ mvn clean install -Dmaven.test.skip=true
