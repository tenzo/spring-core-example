package pl.sdacademy.spring.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class HelloWorldService3 {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String sayHello() {
        return "Hello! " + name;
    }

    @PreDestroy
    public void destroy() throws Exception {
        System.out.println("Sorry " + name + ", destroing your bean ;(");
    }

    @PostConstruct
    public void init() throws Exception {
        System.out.println("Good news " + name + ", just created your bean!");
    }
}
