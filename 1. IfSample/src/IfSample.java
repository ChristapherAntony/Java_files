import java.util.Scanner;

public class IfSample {
	static void printName(String name) { 
		
		System.out.println("Hello java " + name);
	} 
	
	static int FindSum(int num1,int num2) {
		return (num1+num2);  
	}
	
	
	
	public static void main(String ar[]) {
		
		String name1="manu";
		
		System.out.println("one");
		System.out.println("two");
		System.out.println("three");
		printName("christapher");
		printName(name1);
		
		
		int x=FindSum(25,35);
		System.out.println(x);
		
	}
	
	
	
	
	
}
