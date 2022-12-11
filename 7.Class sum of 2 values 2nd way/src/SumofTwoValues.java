import java.util.Scanner;

public class SumofTwoValues {
	
	public static void main(String ar[]) {

		
		
		System.out.println("Enter two numbers");
		Scanner sc=new Scanner(System.in);
		
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		
		SumCalculator obj1=new SumCalculator();
		
		obj1.Sum(num1, num2);
		obj1.displaySum();
		
		System.out.println("Enter 2 nd round two numbers");
		int num3=sc.nextInt();
		int num4=sc.nextInt();
		
		SumCalculator obj2=new SumCalculator();
		obj2.SumandDisplay(num3, num4);
		
	
		
		
		
		
		
		
	}
		
		
	}

