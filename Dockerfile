              FROM openjdk:8-jdk-alpine

              COPY ./BOOT-INF/lib app/lib
              COPY ./META-INF app/META-INF
              COPY ./BOOT-INF/classes app
              COPY ./target/classes app
              ENTRYPOINT ["java","-cp","app:app/lib/*","hello.HelloWorld"]