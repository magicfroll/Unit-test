package src.test.hw;

import org.junit.jupiter.api.Test;
import tdd.User;
import tdd.UserRepository;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserRepositoryTest {

    @Test
    void logoutTest() {
        User user1 = new User("Mike", "mike123", false);
        user1.authenticate("Mike", "mike123");
        User user2 = new User("Alex", "alex123", false);
        user2.authenticate("Alex", "alex123");
        User user3 = new User("admin", "admin123", true);
        user3.authenticate("admin", "admin123");
        UserRepository userRepository = new UserRepository();
        userRepository.addUser(user1);
        userRepository.addUser(user2);
        userRepository.addUser(user3);
        userRepository.logoutAllNotAdminUsers();
        assertFalse(user1.isAuthenticate());
        assertFalse(user2.isAuthenticate());
        assertTrue(user3.isAuthenticate());
    }
}
