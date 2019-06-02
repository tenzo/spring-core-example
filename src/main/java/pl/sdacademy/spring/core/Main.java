package pl.sdacademy.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.sdacademy.spring.beans.HelloWorldService;
import pl.sdacademy.spring.beans.HelloWorldService2;
import pl.sdacademy.spring.beans.HelloWorldService3;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        HelloWorldService service = context
                .getBean("helloWorldService", HelloWorldService.class);
        String message = service.sayHello();
        System.out.println(message);


//        HelloWorldService2 service2 = context
//                .getBean("helloWorldService2", HelloWorldService2.class);
//        message = service2.sayHello();
//        System.out.println(message);
//
//        HelloWorldService3 service3 = context
//                .getBean("helloWorldService3", HelloWorldService3.class);
//        message = service3.sayHello();
//        System.out.println(message);



        ((ClassPathXmlApplicationContext) context).registerShutdownHook();
    }

}
