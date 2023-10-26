package src.test.coverage;

import coverage.SomeService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class SomeServiceTest {
   // 3.1.
    private SomeService someService;
    @BeforeEach
    void setup() {
       someService =  new SomeService();
    }

    @ParameterizedTest()
    @ValueSource(ints = {5, 20, 55})
    void multipleThreeNotFiveReturnsBuzz(int n) {
        assertThat(someService.fizzBuzz(n)).isEqualTo("Buzz");
    }

    @ParameterizedTest()
    @ValueSource(ints = {3, 9, 21})
    void multipleFiveNotThreeReturnsFizz(int n) {
        assertThat(someService.fizzBuzz(n)).isEqualTo("Fizz");
    }

    @ParameterizedTest()
    @ValueSource(ints = {15, 30, 45})
    void multipleFifteenReturnsFizzBuzz(int n) {
        assertThat(someService.fizzBuzz(n)).isEqualTo("FizzBuzz");
    }

    @ParameterizedTest()
    @ValueSource(ints = {14, 31, 41})
    void multipleNotThreeFiveFifteenReturnsNumber(int n) {
        assertEquals("" + n, someService.fizzBuzz(n));
    }

    @Test
    void startSix() {
        assertTrue(someService.firstLast6(new int[] {6, 0, 7, 8}));
    }

    @Test
    void endSix() {
        assertTrue(someService.firstLast6(new int[] {7, 0, 7, 6}));
    }

    @Test
    void notSix() {
        assertFalse(someService.firstLast6(new int[] {5, 0, 7, 8}));
    }

}