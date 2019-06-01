package pl.sdacademy.spring.beans;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class UserDbConnector {

    public void connect() {
        System.out.println("Connecting to DB");
    }

    @Override
    public String toString() {
        return "UserDbConnector{}";
    }

    public void init() {
        System.out.println("Initializing connection");
    }

    public void destroy() {
        System.out.println("Closing connection");
    }

}
