package pl.sdacademy.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userRepository")
public class UserRepository {

    private UserDao userDao;

    @Autowired
    public UserRepository(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    @Override
    public String toString() {
        return "UserRepository{" +
                "userDao=" + userDao +
                '}';
    }
}
