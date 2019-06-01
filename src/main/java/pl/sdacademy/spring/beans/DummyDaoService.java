package pl.sdacademy.spring.beans;

import org.springframework.stereotype.Service;

public class DummyDaoService {

    private String dbAddress;

    public void connectToDb() {
        System.out.println("Connecting to a database on address: " + dbAddress);
    }

    public String getDbAddress() {
        return dbAddress;
    }

    public void setDbAddress(String dbAddress) {
        this.dbAddress = dbAddress;
    }


}
