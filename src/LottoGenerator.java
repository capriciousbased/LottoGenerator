import java.util.Random;
import java.util.Set;
import java.util.HashSet;

public class LottoGenerator {

    public static void main(String[] args) {
        
        int[] lottoNumbers = LottoGenerator.generateNumbers();
        System.out.println("Six out of fortynine: ");
        for (int i = 0; i < lottoNumbers.length; i++) {
            System.out.print(lottoNumbers[i] + " ");
        }

    }
    public static int[] generateNumbers() {
        Random rand = new Random();
        Set<Integer> uniqueNumbers = new HashSet<>();
        while(uniqueNumbers.size()<6){
            uniqueNumbers.add(rand.nextInt(49)+1);
        }

        return uniqueNumbers.stream().mapToInt(i->i).toArray();
        
    }

}