import java.util.Scanner;

public class StudentCount {
    public static void main(String[] args) {
        int[] marks = new int[10];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i <10 ; i++) {
            System.out.print("Enter marks : ");
            marks[i] = sc.nextInt();
        }

        int count = 0;
        for (int i = 0; i < marks.length; i++) {
            if(marks[i]< 40){
                count++;
            }
        }
        System.out.println(count+" students got less than 40.");
    }
}