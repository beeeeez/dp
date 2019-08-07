/**
 * 
 */
package carThing;

/**
 * @author 001400553
 *
 */
public class director {
	
	
	public static void main(String[] args) {
	car dragon = buildCar(new stationWagonBuilder());
	System.out.println(dragon.getName());
	System.out.println(dragon.dumpStuff());
	}
	
	


public static car buildCar(carBuilder carBuild) {
	carBuild.buildCar();
	carBuild.setName();
	carBuild.buildDoors();
	carBuild.buildWheels();
	return carBuild.getCar();
	
}
}