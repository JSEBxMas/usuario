FROM eclipse-temurin:21-jre-alpine

# Opcional: mostrar versión
RUN java -version

# Opcional: argumentos de Java
ENV JAVA_OPTS="-Xms128m -Xmx256m"

# Copiamos el jar
ARG JAR_FILE
COPY ${JAR_FILE} /app.jar

# Puerto según application.properties
EXPOSE 75

ENTRYPOINT ["sh", "-c", "exec java $JAVA_OPTS -jar /app.jar"]
