
public class B extends A{
	
	B(){
		System.out.println("its B non-arg constructor");
		
	}
	B(int a){
		super(10); 
		System.out.println("its  B argumented constructor");
		
		
	}
	
	int a;
	
	void Display() {
		System.out.println("B");
		
		a=10;
		super.a=11;
		int c=a+super.a;
		System.out.println(c);
	}

	void displayBase(){
		super.Dispaly();	

		
	}
	
	
	public static void main(String[] args) {
		
		B obj=new B(10);
		
		//obj.Display();
		
		System.out.println();
		
		//obj.displayBase();
		
		
		
		
		
	}
}
