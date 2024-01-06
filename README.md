# hibernate-example
exploring hibernate

**Spring Rest + Jpa + Hibernate**

Environment
==========================================
Tomcat 9

Java 8

com.fasterxml.jackson.core:jackson-databind:2.12.5

javax.servlet:javax.servlet-api:4.0.1:provided

org.springframework:spring-webmvc:5.2.2.RELEASE

context-path: http://localhost:port/basic-webapp/*

maven-archetype: maven-archetype-webapp - 1.0

plugins:
<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-war-plugin</artifactId>
				<version>3.3.1</version>
				<configuration>
					<failOnMissingWebXml>false</failOnMissingWebXml>
				</configuration>
			</plugin>
			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-compiler-plugin</artifactId>
				<version>3.8.1</version>
			</plugin>
