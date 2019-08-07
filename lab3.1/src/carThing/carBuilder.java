package carThing;

abstract class carBuilder {
	
	car newCar;
	
	public car getCar() {
		return newCar;
	}
	
	public void buildCar() {
		newCar= new car();
	}
	
	public abstract void setName();
	
	public void buildWheels() {
		newCar.carWheels= new wheels();
	}
	public void buildDoors() {
		newCar.carDoors= new doors();
	}
	
}
