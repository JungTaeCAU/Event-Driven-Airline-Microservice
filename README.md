# Event-Driven-Airline-Microservice

This project is a master's degree thesis in February 2021. Airline with microservice is based on event-driven architecture and
asynchronous communication. This web project implemented airline booking service using [RabbitMQ](https://www.rabbitmq.com/) and microservice architecture. 
Then i used the load test tool [nGrinder](http://naver.github.io/ngrinder/) to perform stress test.
> The whole project was writen with Spring([STS](https://spring.io/tools))

<img src = "https://user-images.githubusercontent.com/37211139/104693386-e9687480-574c-11eb-945a-bb8b2872eb51.png" width = "70%"/>

How to Run
=============
Requirements
-------------
This project was built in Ubuntu 20.04.1 LTS.
* [Spring Tool Suite 4.8.0 - Linux 64-Bit](https://spring.io/tools)
* [RabbitMQ](https://www.rabbitmq.com/)
* [Apache Maven 3.6.3](https://maven.apache.org/)
* [nGrinder](http://naver.github.io/ngrinder/)

Clone this repo
-------------
    git clone https://github.com/JungTaeCAU/airlineweb/edit/main/README.md
RabbitMQ Cluster
-------------
I used docker to cluster RabbitMQ. More detail is in the link below
* [RabbitMQ Cluster](https://github.com/bijukunjummen/docker-rabbitmq-cluster)

Run in Local
-------------
1. Booking Service
<pre>
<code>
$ cd book
$ mvn clean install -Dmaven.test.skip=true
</code>
</pre>
2. Search Service
<pre>
<code>
$ cd search
$ mvn clean install -Dmaven.test.skip=true
</code>
</pre>    
3. Fares Service
<pre>
<code>
$ cd fares
$ mvn clean install -Dmaven.test.skip=true
</code>
</pre>    
4. CheckIn Service
<pre>
<code>
$ cd checkin
$ mvn clean install -Dmaven.test.skip=true
</code>
</pre>    

or more easy way..
-------------
just simply import this project on STS then drag all service and click Start

<img src = "https://user-images.githubusercontent.com/37211139/105005381-95c19800-5a78-11eb-85d6-4ee3b73a25ed.gif" width = "50%" />

Stress test with nGrinder
-------------
Follow the guide in nGrinder Documents to launch. [nGrinder](http://naver.github.io/ngrinder/)
i made 2 scenarios
+ 1 agent
+ 1000 vuser, 1500 vuser, 2000 vuser

<img src = "https://user-images.githubusercontent.com/37211139/104693618-52e88300-574d-11eb-9b28-a89f16e4f121.JPG" width = "70%" />

For stress test on heavy load
+ 1 agent
+ 4000 vuser

<img src = "https://user-images.githubusercontent.com/37211139/104693846-ac50b200-574d-11eb-8e54-8084324e42c3.JPG" width = "70%" />

Conclusion and Future Challenges
-------------
In this paper, i implemented a flight reservation system by applying an event-driven architecture which is one step further from the existing microservice architecture. 
Event-driven architectures can rule out inter-service dependencies by replacing communications for cross-service data references with asynchronous event-based message queuing systems in a synchronous structure.
In addition, it is possible to build a high level of independent services that are not overly tied to a particular library or system and can respond to various changes.

A future research challenge is to distribute the project as containers to leverage the Docker and Kubernetes.
