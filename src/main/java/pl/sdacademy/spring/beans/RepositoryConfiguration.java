package pl.sdacademy.spring.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class RepositoryConfiguration {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    @Scope("prototype")

    public UserDbConnector userDbConnector() {
        return new UserDbConnector();
    }

    @Bean(name="localDao")
    public UserDao localUserDao() {
        return new UserDao("localhost");
    }

    @Bean(name="preprodDao")
    public UserDao preprodUserDao() {
        return new UserDao("db.preprod.company.com");
    }

    @Bean
    public UserRepository userRepository(@Qualifier("preprodDao") UserDao userDao) {
        return new UserRepository(userDao);
    }

}
