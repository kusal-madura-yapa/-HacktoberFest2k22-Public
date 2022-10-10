import java.util.Scanner;
public class GreatestNum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int x = sc.nextInt();
        System.out.println("Enter secomd number: ");
        int y = sc.nextInt();
        System.out.println("Enter third number: ");
        int z = sc.nextInt();
        if (x>y && x>z)
           System.out.println(x+" is the greatest number");
        else if(y>x && y>z)
            System.out.println(y+" is the greatest number");
        else
            System.out.println(z+" is the greatest number");
        }
}