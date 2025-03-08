#This is a Dockerfile for a microservice application
# Base image of RHEL7 & Open JDK 
FROM eclipse-temurin:17-jre-alpine

# Setting up JAVA Home with Open JDK JRE Path
ENV JAVA_HOME /usr/lib/jvm/jre-openjdk

# Directory for application
RUN mkdir -p /app

# Make port 8761 available to the world outside this container
EXPOSE 8761
# Copy the current directory contents into the container at /app
COPY target/eurekaserver.jar /app/

# Copy the script from the source at /app
COPY run-java.sh /app/

# Setting up permissions for the script to run
RUN chmod 755 /app/run-java.sh

# Finally, run the script and set the permission for the app folder
CMD [ "/app/run-java.sh" ]
RUN chgrp -R 0 /app && \
  chmod -R g=u /app