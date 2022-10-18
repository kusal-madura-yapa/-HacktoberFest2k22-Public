import java.util.Scanner;
public class Activity6{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the length :");
		float l=sc.nextFloat();
		System.out.print("Enter the width  :");
		float w=sc.nextFloat();
		System.out.print("Enter the height :");
		float h=sc.nextFloat();

		float vol=l*w*h;

		System.out.println("Volume = "+vol);
	}
}


