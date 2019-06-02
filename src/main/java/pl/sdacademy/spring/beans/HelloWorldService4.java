package pl.sdacademy.spring.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class HelloWorldService4 implements BeanNameAware, ApplicationContextAware {

    private String name;

    private ApplicationContext applicationContext;

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

    public void setBeanName(String name) {
        System.out.println("My name is " + name);
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
