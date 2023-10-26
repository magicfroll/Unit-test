package src.test.tdd;


import org.junit.jupiter.api.Test;
import tdd.User;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestDrivenDevelopment {

    //3.5. Red-Green-Refactor
    @Test
    void authTestTrue(){
        User user = new User("admin", "admin", true);
        assertTrue(user.authenticate("admin", "admin"));
    }

    @Test
    void authTestFalse(){
        User user = new User("admin", "admin", true);
        assertFalse(user.authenticate("admin1", "admin1"));
    }


}