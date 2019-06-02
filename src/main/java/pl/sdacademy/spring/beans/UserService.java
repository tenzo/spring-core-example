package pl.sdacademy.spring.beans;

import javax.annotation.PostConstruct;

public class UserService {

    @PostConstruct
    public void init() {
        System.out.println("Initializing User Service");
    }

    public void destroy() {
        System.out.println("Destroying User Service");
    }

}
