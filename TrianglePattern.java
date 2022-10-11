import java.util.Scanner;

public class TrianglePattern {
    public static void main(String args[]) {

        System.out.println("Which kind of triangle you want : ");
        System.out.println("Press n for a normal triangle");
        System.out.println("Press u for a upside-down triangle");
        Scanner sc = new Scanner(System.in);
        char choice = sc.next().charAt(0);

        switch (choice) {
            case 'n':

                System.out.print("Enter the number of rows to be printed : ");
                int rows = sc.nextInt();
                int k = 0;

                for (int i = 1; i <= rows; ++i, k = 0) {
                    for (int space = 1; space <= rows - i; ++space) {
                        System.out.print("  ");
                    }

                    while (k != 2 * i - 1) {
                        System.out.print("* ");
                        ++k;
                    }

                    System.out.println();
                }

                break;

            case 'u':

                System.out.print("Enter the number of rows to be printed : ");
                int rows2 = sc.nextInt();
                int i, j;

                for (i = rows2; i >= 1; i--) {

                    for (j = i; j < rows2; j++) {
                        System.out.print("  ");
                    }

                    for (j = 1; j <= (2 * i - 1); j++) {
                        System.out.print("* ");
                    }

                    System.out.println(" ");
                }

                break;

            default:
                System.out.println("Invalid Input");

        }
    }
}
