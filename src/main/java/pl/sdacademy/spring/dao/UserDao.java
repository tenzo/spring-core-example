package pl.sdacademy.spring.dao;

import pl.sdacademy.spring.model.UserModel;

import java.util.List;

public interface UserDao {
        void save(UserModel user);
        List<UserModel> list();
}
