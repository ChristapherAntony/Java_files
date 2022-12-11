import java.util.Scanner;

public class PrintStarPattern {
	
	public static void main(String ar[]) {
		System.out.println("Enter a limit");
		Scanner s=new Scanner(System.in);
		int limit=s.nextInt();
		
		for(int i=1;i<=limit;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");

			}		System.out.println();
		}
		
		
		
	}

}
