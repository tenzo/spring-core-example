package pl.sdacademy.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.sdacademy.spring.beans.HelloWorldService;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        HelloWorldService service1 = context
                .getBean("helloWorldService", HelloWorldService.class);
        String message = service1.sayHello();
        System.out.println(message);

        service1.setName("Spring");
        message = service1.sayHello();
        System.out.println(message);

        HelloWorldService service2 =  context
                .getBean("helloWorldService", HelloWorldService.class);
        message = service2.sayHello();
        System.out.println(message);
    }

}
