FROM eclipse-temurin:17-jdk-jammy
WORKDIR /app

# Copy project
COPY . /app

# Make mvnw executable if present, try wrapper first, fallback to system mvn
RUN chmod +x mvnw || true
RUN ./mvnw -B -DskipTests package || mvn -B -DskipTests package

EXPOSE 8080

CMD ["sh", "-c", "java -jar target/*.jar"]
