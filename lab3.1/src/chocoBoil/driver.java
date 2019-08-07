package chocoBoil;

public class driver {

	public static void main(String[] args) {
		

	chocoBoiler cb = chocoBoiler.getBoiler();
	
	cb.fill();
	cb.drop();
	System.out.println(cb.toString());
	
	chocoBoiler cb2 = chocoBoiler.getBoiler();
	System.out.println(cb2.toString());
	
	chocoBoiler cb3 = chocoBoiler.getBoiler();
	System.out.println(cb3.toString());
	
}	
	}
