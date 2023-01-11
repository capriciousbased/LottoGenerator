import java.util.Random;

import java.util.Set;
import java.util.HashSet;
public class Lotto {

    public static void main(String[] args) {
        Random num = new Random();
        Set<Integer> numbers = new HashSet<>();
        while (numbers.size() < 6) {
            int number = num.nextInt(49) + 1;
            numbers.add(number);
        }
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
    
}
