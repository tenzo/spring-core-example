package pl.sdacademy.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.sdacademy.spring.beans.HelloWorldService;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        HelloWorldService service = (HelloWorldService) context
                .getBean("helloWorldService");
        String message = service.sayHello();
        System.out.println(message);

        service.setName("Spring");
        message = service.sayHello();
        System.out.println(message);
    }

}
