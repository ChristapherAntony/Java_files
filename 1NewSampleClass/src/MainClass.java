
public class MainClass {
	public static void main(String ar[]) {
		
		SmartPhone phone1=new SmartPhone();
		SmartPhone phone2=new SmartPhone();
		SmartPhone phone3=new SmartPhone();

		phone1.brand="Apple";
		phone1.model="i phone 11 pro max";
		phone1.prise=60000;
		
		phone2.brand="Sony";
		phone2.model="Experia 11";
		phone2.prise=4000;
		
		
		
		
		
		
		phone1.display();
		phone1.calling();
		phone2.calling();

	}
}
