
public class Hello {
	public static void main(String ar[]) {
		
		Sample s1=new Sample();
		Sample s2=new Sample();
		
		s1.a=20;
		s1.b=30;
		s2.a=10;
		s2.b=40;
		s2.c=60;
		
		
		System.out.println("s1.a="+s1.a+ "\ns1.b-"+s1.b);
		System.out.println("s2.a="+s2.a+ "\ns2.b-"+s2.b);
		
		s1.display();
		s2.display();
		
		
	}
	
	

}
