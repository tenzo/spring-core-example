package pl.sdacademy.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.sdacademy.spring.beans.CollectionsBean;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        CollectionsBean collectionsBean = context
                .getBean("collectionBean", CollectionsBean.class);
        System.out.println(collectionsBean);
    }

}
