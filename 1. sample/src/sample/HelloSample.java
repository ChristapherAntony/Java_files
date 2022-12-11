package sample;

import java.util.Scanner;

public class HelloSample {
	
	
public static void main(String ar[]) {
	
	Scanner s=new Scanner(System.in);
	
	System.out.println("enter two number");
	
	
	float a=s.nextInt();
	float b=s.nextInt(); 
	float c=a+b;
	
	System.out.println("sum of two numbers are "+c);
	
	String resultString=Float.toString(c);
	
	System.out.println("sum of two numbers are in String "+resultString);
	
}
	
	

}
