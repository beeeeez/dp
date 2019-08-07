package chocoBoil;

public class chocoBoiler {
	private boolean empty;
	private boolean boiled;
	private static chocoBoiler uniqueDude;
	private chocoBoiler() {
		empty=true;
		boiled=false;
	}
	public static chocoBoiler getBoiler() {
		if (uniqueDude == null) {
			uniqueDude = new chocoBoiler();
		}
		return uniqueDude;
	}
	
	public boolean isEmpty() {return empty;}
	public boolean isBoiled() {return boiled;}

	public void fill() {
		if(isEmpty()) {
			empty=false;
			boiled=false;
		}
	}
		public void drop(){
			if(!isEmpty() && isBoiled()) {
				empty=true;
			}
		}
	
		public void boil() {
				if(!isEmpty() && !isBoiled()) {
					boiled=true;
				}
	}
	
}
