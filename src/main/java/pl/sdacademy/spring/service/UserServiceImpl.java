package pl.sdacademy.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.sdacademy.spring.dao.UserDao;
import pl.sdacademy.spring.model.UserModel;

import java.util.List;


@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Transactional
    public void save(UserModel user) {
        userDao.save(user);
    }

    @Transactional(readOnly = true)
    public List<UserModel> list() {
        return userDao.list();
    }
}
