package pl.sdacademy.spring.beans;

public class UserController {

    private DummyUsersRepository usersRepository;
    private String username;

    public UserController(DummyUsersRepository usersRepository, String username) {
        this.usersRepository = usersRepository;
        this.username = username;
    }

    public void getUser() {
        System.out.println("UserController - getting user entity");
        String user = usersRepository.getUser(username.hashCode());
        System.out.println("UserController - returning user " + user);
    }

    public DummyUsersRepository getUsersRepository() {
        return usersRepository;
    }

    public String getUsername() {
        return username;
    }
}
