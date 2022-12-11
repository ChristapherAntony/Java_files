
public abstract class Google {
	
	abstract void search();
	
	void message() {
		System.out.println("Thanks for visiting Google...");
	}

}

class SearchAll extends Google {
	 
	
	void search() {
		System.out.println("All search results.");
	}	
	
}

class SearchImage extends Google {
	 
	
	void search() {
		System.out.println("Image search results.");
	}	
	
}

class SearchVideo extends Google {
	 
	
	void search() {
		System.out.println("Video search results.");  
	}	
	
}