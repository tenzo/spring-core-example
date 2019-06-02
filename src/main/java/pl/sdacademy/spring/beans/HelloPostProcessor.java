package pl.sdacademy.spring.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.lang.Nullable;

public class HelloPostProcessor implements BeanPostProcessor {

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("Postprocessing bean before init: " + beanName);
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("Postprocessing bean after init: " + beanName);
        if (bean instanceof HelloWorldService) {
            ((HelloWorldService) bean).setName("hehehe");
//            HelloWorldService service = (HelloWorldService) bean;
//            service.setName("hehe");
        }
        return bean;
    }

}
