package pl.sdacademy.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.sdacademy.spring.beans.UserRepository;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        UserRepository userRepository = context
                .getBean("userRepository", UserRepository.class);
        System.out.println(userRepository);
    }

}
