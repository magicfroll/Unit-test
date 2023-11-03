package number;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class RandomNumberModule {
    public int[] genetrateNumbers (int count){
        int[] numbers = new int[count];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt();
        }
        return numbers;
    }
}
