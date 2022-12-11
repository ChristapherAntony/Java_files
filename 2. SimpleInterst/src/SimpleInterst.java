import java.util.Scanner;

public class SimpleInterst {

	public static void main(String ar[]) {
		System.out.println("\t\t Simple Interest Calculator");
		System.out.println("\t\t'''''''''''''''''''''''''''\n");
		System.out.println("Please Enter Principal Amount,Rate of int.,Number of years");
		
		Scanner scan=new Scanner(System.in);
		int   p=scan.nextInt();   //principal amount
		float r=scan.nextFloat(); //rate of interest
		float n=scan.nextFloat(); //number of years
		
		float simpleinterest=(p*r*n)/100;
		
		System.out.println("Your interst is "+simpleinterest);
		
		
		System.out.println("Total amount payable is "+(simpleinterest+p));

	
	
	
	}
	
	
	
}
