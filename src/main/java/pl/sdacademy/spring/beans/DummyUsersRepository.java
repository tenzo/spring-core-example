package pl.sdacademy.spring.beans;

import org.springframework.stereotype.Service;

public class DummyUsersRepository {

    private DummyDaoService daoService;

    public String getUser(long id) {
        System.out.println("DummyUsersRepositor - conecting to " + daoService.getDbAddress() + " and calling for user with ID " + id);
        daoService.connectToDb();
        return "Andrzej"; //dummy object
    }

    public DummyUsersRepository(DummyDaoService daoService) {
        this.daoService = daoService;
    }


    public void setDaoService(DummyDaoService daoService) {
        this.daoService = daoService;
    }
}
