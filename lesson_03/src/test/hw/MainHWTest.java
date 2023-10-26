package src.test.hw;

import coverage.SomeService;
import hw.MainHW;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainHWTest {
    private MainHW mainHW;
    @BeforeEach
    void setup() {
        mainHW =  new MainHW();
    }

    @ParameterizedTest()
    @ValueSource(ints = {1, 3, 5, 7})
    void oddTest(int num){
        assertFalse(mainHW.evenOddNumber(num));
    }

    @ParameterizedTest()
    @ValueSource(ints = {2, 4, 6, 8})
    void evenTest(int num){
        assertTrue(mainHW.evenOddNumber(num));
    }

    @ParameterizedTest()
    @ValueSource(ints = {26, 50, 64, 99})
    void numIn(int num){
        assertTrue(mainHW.isNumberInInterval(num));
    }

    @ParameterizedTest()
    @ValueSource(ints = {25, 11, 105, 100})
    void numNotIn(int num){
        assertFalse(mainHW.isNumberInInterval(num));
    }

}
