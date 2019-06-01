package pl.sdacademy.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.sdacademy.spring.beans.RepositoryConfiguration;
import pl.sdacademy.spring.beans.UserRepository;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(RepositoryConfiguration.class);

        UserRepository userRepository = context
                .getBean(UserRepository.class);
        System.out.println(userRepository);

        ((AnnotationConfigApplicationContext) context).registerShutdownHook();
    }

}
