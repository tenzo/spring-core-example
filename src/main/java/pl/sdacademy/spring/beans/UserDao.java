package pl.sdacademy.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Service;

@Service("userDao")
public class UserDao {

    @Autowired
    private UserDbConnector userDbConnector;

    private String dbAddress;

    public UserDao(String dbAddress) {
        this.dbAddress = dbAddress;
    }

    public String getDbAddress() {
        return dbAddress;
    }

    @Override
    public String toString() {
        return "UserDao{" +
                "userDbConnector=" + userDbConnector +
                ", dbAddress='" + dbAddress + '\'' +
                '}';
    }
}
