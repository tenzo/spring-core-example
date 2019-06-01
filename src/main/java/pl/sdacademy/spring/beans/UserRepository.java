package pl.sdacademy.spring.beans;

public class UserRepository {

    private String dbAddress;
    private String timeZone;

    public String getDbAddress() {
        return dbAddress;
    }

    public void setDbAddress(String dbAddress) {
        this.dbAddress = dbAddress;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }


    @Override
    public String toString() {
        return "UserRepository{" +
                "dbAddress='" + dbAddress + '\'' +
                ", timeZone='" + timeZone + '\'' +
                '}';
    }
}
