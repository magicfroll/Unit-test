package test;

import number.MaxNumberModule;
import number.RandomNumberModule;
import org.junit.jupiter.api.Test;
import user.UserRepository;
import user.UserService;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


class MainTest {
    //5.1.
    @Test
    void randomModuleTest(){
        RandomNumberModule generator = new RandomNumberModule();
        int[] randomNumbers = generator.genetrateNumbers(10);
        assertEquals(10, randomNumbers.length);
    }


    @Test
    void maxNumberTest(){
        MaxNumberModule finder = new MaxNumberModule();
        int[] numbers = {3, 50, 7, 10};
        assertEquals(50, finder.findMax(numbers));
    }


    @Test
    void integrationTest(){
        RandomNumberModule generator = new RandomNumberModule();
        MaxNumberModule finder = new MaxNumberModule();
        int[] randomNumbers = generator.genetrateNumbers(10);
        int max = finder.findMax(randomNumbers);
        Arrays.sort(randomNumbers);
        int referenseMax = randomNumbers[randomNumbers.length - 1];
        assertEquals(referenseMax, max);
    }

    //5.2.
    @Test
    void userServiceIntegrationTest(){
        UserRepository userRepository = new UserRepository();
        UserService userService = new UserService(userRepository);
        assertEquals("User 1", userService.getUserName(1));
    }

    //5.3.

}