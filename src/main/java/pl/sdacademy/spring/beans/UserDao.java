package pl.sdacademy.spring.beans;

public class UserDao {

    private String dbAddress;

    public String getDbAddress() {
        return dbAddress;
    }

    public void setDbAddress(String dbAddress) {
        this.dbAddress = dbAddress;
    }

    @Override
    public String toString() {
        return "UserDao{" +
                "dbAddress='" + dbAddress + '\'' +
                '}';
    }
}
