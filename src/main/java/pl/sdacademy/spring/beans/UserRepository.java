package pl.sdacademy.spring.beans;

public class UserRepository {

    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public String toString() {
        return "UserRepository{" +
                "userDao=" + userDao +
                '}';
    }
}
