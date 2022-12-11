import java.util.Scanner;

public class Functions {
	
	public static void main(String ag[]) {
		System.out.println("ENter two numbers");
		Scanner scan=new Scanner(System.in);
		
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		
		
		int result=sum(num1,num2);
		
		System.out.println("result is "+result);
		
		
		
		
		
		
		
	}
	
static int sum(int a,int b) {
	
	int s=a+b;
	
	return s;
	
}


}