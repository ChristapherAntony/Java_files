import java.util.Scanner;

public class DateandDay {
	public static void main(String ar[]) {
		System.out.println("Enter a day (1 to 7)");
		Scanner scan=new Scanner(System.in);
		int day=scan.nextInt();
		
		switch (day) {
		case 1:
			System.out.println("Monday)");
			break;
		case 2:
			System.out.println("Tuesday)");		
			break;
		case 3:
			System.out.println("Wednesday)");
			break;
		case 4:
			System.out.println("Thursdsay)");	
			break;
		case 5:
			System.out.println("Friday)");	
			break;
		case 6:
			System.out.println("Saturday)");
			break;
		case 7:
			System.out.println("Sunday)");
			break;
		
			
			
			
			
			
		}
		
	}
}
