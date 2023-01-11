import java.util.Random;
import java.util.Set;
import java.util.HashSet;

public class LottoGenerator {

    // generate Random six Numbers

    public static int[] generateNumbers() {
        Random rand = new Random();
        Set<Integer> uniqueNumbers = new HashSet<>();
        while(uniqueNumbers.size()<6){
            uniqueNumbers.add(rand.nextInt(49)+1);
        }

        return uniqueNumbers.stream().mapToInt(i->i).toArray();
        
    }

    // generate Random Two Numbers

    public static int[] generateSupperNumbers() {
        Random rand = new Random();
        Set<Integer> uniqueNumbers = new HashSet<>();
        while(uniqueNumbers.size()<2){
            uniqueNumbers.add(rand.nextInt(9)+1);
        }

        return uniqueNumbers.stream().mapToInt(i->i).toArray();
        
    }
    public static void main(String[] args) {

        int[] lottoNumbers = LottoGenerator.generateNumbers();
        int[] supperNumbers = LottoGenerator.generateSupperNumbers();
      
    // Print six lotto Number : 

        System.out.println("Six out of fortynine: ");
        for (int i = 0; i < lottoNumbers.length; i++) {
            System.out.print(lottoNumbers[i] + " ");
        }

    // Print Two lotto Supper Number :
     
        System.out.println("Super Number: Two out of Ten: ");
        for (int j = 0; j < supperNumbers.length; j++) {
            System.out.print(supperNumbers[j] + " ");
        }
    }
}