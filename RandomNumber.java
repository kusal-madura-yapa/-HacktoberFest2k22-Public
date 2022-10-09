import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

    public static void main(String[] args) {
        int max;
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        max = sc.nextInt();

        for (int i = 1; i  50; i++) {
            System.out.println(random.nextInt(max));
        }
    }
}