import java.util.Scanner;

public class Calculator{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        add(x,y);
        sub(x,y);
        multiply(x,y);
        div(x,y);
        power(x,y);
        maxNumber(x,y);

    }

    public static void add(int x,int y){
        System.out.println(x+y);
    }

    public static void sub(int x,int y){
        System.out.println(x-y);
    }


    public static void multiply(int x,int y){
        System.out.println(x*y);
    }


    public static void div(int x,int y){
        System.out.println(x/y);
    }
    public static void power(int x,int y){
        System.out.println(Math.pow(x,y));
    }
    
    public static void maxNumber(int x,int y){
        System.out.println(Math.max(x,y));
    }

}