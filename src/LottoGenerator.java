import java.util.Random;
import java.util.Set;
import java.util.HashSet;

public class LottoGenerator {
    public static int[] generateNumber() {
        Random rand = new Random();
        Set<Integer> uniqueNumbers = new HashSet<>();
        while(uniqueNumbers.size()<6){
            uniqueNumbers.add(rand.nextInt(6)+1);
        }

        return uniqueNumbers.stream().mapToInt(i->i).toArray();
        
    }
    public static void main(String[] args) throws Exception {

    }
}
