package pl.sdacademy.spring.beans;

public class UserController {

    private DummyUsersRepository usersRepository;
    private String username;

    public UserController(DummyUsersRepository usersRepository, String username) {
        this.usersRepository = usersRepository;
        this.username = username;
    }

    public UserController(DummyUsersRepository repository) {
        this.usersRepository = repository;
        this.username = "pikachu90";
    }

    public void getUser() {
        System.out.println("UserController - getting user entity for " + username);
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
