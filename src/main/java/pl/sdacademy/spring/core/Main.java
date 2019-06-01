package pl.sdacademy.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.sdacademy.spring.beans.DummyUsersRepository;
import pl.sdacademy.spring.beans.UserController;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        UserController controller =  context
                .getBean("userController", UserController.class);
        controller.getUser();

    }

}
