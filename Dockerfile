FROM oraclelinux:7

MAINTAINER ilyasstrh

RUN yum -y update \
	&& yum install -y java-1.8.0-openjdk

RUN yum install -y wget \
	&& wget http://repos.fedorapeople.org/repos/dchen/apache-maven/epel-apache-maven.repo -O /etc/yum.repos.d/epel-apache-maven.repo \
	&& yum install -y apache-maven

ENV JAVA_HOME /usr/lib/jvm/java

COPY . /var/www/java-docker

WORKDIR /var/www/java-docker

RUN mvn package

CMD ["java","-cp","target/java-app-docker-1.0-SNAPSHOT.jar","App"]

