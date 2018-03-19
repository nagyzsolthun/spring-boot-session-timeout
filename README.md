# spring-boot-session-timeout

## local execution
```shell
gradle run build
java -jar build/libs/spring-boot-session-timeout.jar
localhost:8080/hello
```


## expected behavior
session expiration in 10 seconds (server.session.timeout=10)

## actual behavior
session expiration in 30 mins (default session timeout)

```
127.0.0.1:6379> keys *
1) "spring:session:sessions:expires:02c423d9-e96a-4af9-8e7a-f3d35e111e47"
2) "spring:session:sessions:02c423d9-e96a-4af9-8e7a-f3d35e111e47"
3) "spring:session:expirations:1521500160000"
127.0.0.1:6379>
```
