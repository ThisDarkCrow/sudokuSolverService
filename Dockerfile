FROM openjdk:21

COPY target/solver-0.0.1-SNAPSHOT.jar sudokuSolverService.jar

EXPOSE 8080

ENTRYPOINT [ "java", "-jar", "/sudokuSolverService.jar" ]