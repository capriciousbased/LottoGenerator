import java.util.Random;

public class Lotto {

  public static void main(String[] args) {
    Random num = new Random();
    int[] numbers = new int[6];

    for (int i = 0; i < 6; i++) {
      numbers[i] = num.nextInt(49) + 1;
      for (int Y = 0; Y < i; Y++) {
        if (numbers[i] == numbers[Y]) {
          i--;
        }
      }
    }
    for (int i = 0; i < numbers.length; i++) {
        int number = numbers[i];
        System.out.print(number + " ");
    }
  }
}
