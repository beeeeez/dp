package carThing;

public class car {
	
	String name;
	
	doors carDoors;
	wheels carWheels;
	
	public String getName() {
		return name;
	}
	
	public String dumpStuff() {
		StringBuffer stuff = new StringBuffer();
		stuff.append(" doors : " +this.carDoors.getPart());
		stuff.append(" wheels : " +this.carWheels.getPart());
		return stuff.toString();
	}
	

}
