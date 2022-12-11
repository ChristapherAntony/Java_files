

public interface  WhatsAppCalls {
	
	
	abstract void call();
	abstract void mute();
	abstract void disconnect();


}


class AudioCall implements WhatsAppCalls{
		 
	public void call() {
		System.out.println("Whats App Audio Call");
	}
	public void mute() {
		System.out.println("Whats App Audio Call Muted");
	
	}
	public void disconnect() {
		System.out.println("Whats App Audio Call Disconnected");
	}
	

}


class VideCall implements WhatsAppCalls{
	 
	public void call() {
		System.out.println("Whats App Video Call");
	}
	public void mute() {
		System.out.println("Whats App Video Call Muted");
	
	}
	public void disconnect() {
		System.out.println("Whats App Video Call Disconnected");
	}
	

}