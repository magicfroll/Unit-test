package tdd;

public class User {

    String name;
    String password;

    boolean isAdmin;

    boolean isAuthenticate = false;

    public User(String name, String password, boolean isAdmin) {
        this.name = name;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    //3.6.
    public boolean authenticate(String name, String password) {
        isAuthenticate = name == this.name && password == this.password;
        return isAuthenticate;
    }

    public boolean isAuthenticate() {
        return isAuthenticate;
    }
}