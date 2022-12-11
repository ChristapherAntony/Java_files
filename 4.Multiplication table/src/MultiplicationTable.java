import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String ar[]) {
		System.out.println("\t MULTIPLICATION TABLE");
		System.out.println("\t''''''''''''''''''''''\n");
		System.out.println("Enter table limit");
		Scanner scan=new Scanner(System.in);
		int limit=scan.nextInt();
		
		System.out.println("Enter multiplier");
		int multiplier=scan.nextInt();
		
		for(int i=1;i<=limit;i++) {
			System.out.println(i+"*"+multiplier+"="+(i*multiplier));

		}
		
		
		
		
		
		
		
		
	}
}
