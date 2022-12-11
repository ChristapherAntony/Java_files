
public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("Programe started");
		
		
		try {
			float result=100/0;
			
			System.out.println(result);
			
		}catch(Exception exp){
			System.out.println("Exception: A number cannot be divided by zero");
			
			
			
		}finally {
			System.out.println("Preograme Ended");
		}
	
	
	
	
	
	}
	
	

}
