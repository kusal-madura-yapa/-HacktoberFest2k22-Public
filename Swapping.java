import java.util.Scanner;
class Swapping {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value 1: ");
        int x = sc.nextInt();
        System.out.println("Enter value 2: ");
        int y = sc.nextInt();
        System.out.println("You entered "+ x +" as 1st number & "+ y +" as 2nd number");
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After swapping 1st number became "+ x +" & 2nd number became "+ y );


    }
}