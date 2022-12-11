
public class Main {
	
	public static void main(String[] args) {
		
	
	
	AudioCall a=new AudioCall();
	VideCall v=new VideCall();
	
	a.call();
	a.disconnect();
	a.mute();
	
	v.call();
	v.disconnect();
	v.mute();
	
	
	
	}


}
