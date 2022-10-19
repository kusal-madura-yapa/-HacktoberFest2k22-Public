import java.util.Scanner;
public class Length_Conversion{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Length(m)  = ");
		float m=sc.nextFloat();
		
		float cm=m*100;

		System.out.println("Length(cm) = "+cm);
	}
}


