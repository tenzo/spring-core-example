package pl.sdacademy.spring.service;


import pl.sdacademy.spring.model.UserModel;

import java.util.List;

public interface UserService {
    void save(UserModel user);

    List<UserModel> list();
}
