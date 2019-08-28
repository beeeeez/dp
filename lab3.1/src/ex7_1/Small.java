package ex7_1;

public class Small extends SizeDec{
	Beverage bev;

	public Small(Beverage bev) {
		this.bev=bev;
		this.bev.setSize("Sm");
		
	}
	public String getSize(){
		return bev.getSize();
	}

	public double cost() {
		return bev.cost();
	}
	
	public String getDesc() {
		return bev.getDesc() + ", Small";
	}
}
