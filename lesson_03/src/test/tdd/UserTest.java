package src.test.tdd;

import org.junit.jupiter.api.Test;
import tdd.User;
import tdd.UserRepository;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserTest {

    @Test
    void isAuth() {
        User user =new User("admin", "admin", false);
        user.authenticate("admin", "admin");
        UserRepository repository = new UserRepository();
        repository.addUser(user);
        assertThat(repository.data).contains(user);
    }

    @Test
    void isNotAuth() {
        User user =new User("admin", "admin", false);
        user.authenticate("admina", "admin");
        UserRepository repository = new UserRepository();
        repository.addUser(user);
        assertThat(repository.data).doesNotContain(user);
    }
}
