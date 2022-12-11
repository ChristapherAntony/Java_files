import java.util.Scanner;

public class Calculator {
	public static void main(String ar[]) {
		
		
		System.out.println("\t SIMPLE CALCULATOR");
		System.out.println("\t*******************\n");
		System.out.println("Enter 2 numbers");
		
		Scanner scan=new Scanner(System.in);
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		
		System.out.println("Enter operator(+-*/)");
		
		
		char op=scan.next().charAt(0);
		
		int result;
		
		Operators ob1=new Operators();
		
		

		switch(op) {
		
		case '+':
			result=ob1.SumandDisplay(num1, num2);
			System.out.println(result);
			System.out.println(result*2);
			break;
		case '-':
			ob1.SubandDisplay(num1, num2);
			break;	
		case '*':
			ob1.ProductandDisplay(num1, num2);
			break;
		case '/':
			ob1.DivideandDisplay(num1, num2);
			break;
		default:
			System.out.println("invalid operstor");
			
		}

		

		


	}
}


