import java.util.Scanner;

public class Simplecalculator {
	
	public static void main(String ar[]) {
		
		System.out.println("Simple calculaor");
		System.out.println();
		System.out.println("Enter 2 numbers");
		
		Scanner scan=new Scanner(System.in);
		
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		
		System.out.println("Enter oparator (+ - * /)");
		char opr=scan.next().charAt(0);
		
		if(opr=='+') {
			int result=num1+num2;
			System.out.println(num1+"+"+num2+"="+result);
			
		}else if(opr=='-') {
			int result=num1-num2;
			System.out.println(num1+"+"+num2+"="+result);
		}
		
		
		
		
		
		
	}}


