package ex7_1;

public abstract class Beverage {
	String desc = "Unknown Beverage";
	static String size = "Unknown Size";
	public Beverage() {
	}

	public String getDesc() {
		return desc;
	}
	public abstract double cost();
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size=size;
	}
	
}
