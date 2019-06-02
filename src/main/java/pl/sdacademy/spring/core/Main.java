package pl.sdacademy.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.sdacademy.spring.beans.HelloWorldService;
import pl.sdacademy.spring.beans.User;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        HelloWorldService service =  context
                .getBean("helloWorldService", HelloWorldService.class);
        String message = service.sayHello();
        System.out.println(message);

        service.setName("Spring");
        message = service.sayHello();
        System.out.println(message);

        HelloWorldService service2 =  context
                .getBean("helloWorldService", HelloWorldService.class);
        message = service2.sayHello();
        System.out.println(message);

        HelloWorldService myHelloService =  context
                .getBean("myHelloService", HelloWorldService.class);
        message = myHelloService.sayHello();
        System.out.println(message);

        User marcin = context.getBean(User.class);

        System.out.println(marcin);
    }

}
