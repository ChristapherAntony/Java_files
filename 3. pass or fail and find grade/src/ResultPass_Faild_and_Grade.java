import java.util.Scanner;

public class ResultPass_Faild_and_Grade {
	public static void main(String ar[]) {
		System.out.println("Please your mark out of 100 ");
		Scanner scan=new Scanner(System.in);
		float mark=scan.nextFloat();
		
		if (mark>=50) {
			System.out.println("Passed");
		}else {System.out.println("Faild");
		}
		
		//next line is to find grade
		char grade = 0;
		if(mark>=80) {
			grade='A';
		}else if(mark>=50) {
			grade='B';
		}else if(mark<50) {
			grade='e';
		}
		
		System.out.println("Your grade is "+grade);
		
		
	}

}
