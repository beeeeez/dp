package ex7_1;

public class Large extends SizeDec{
	Beverage bev;
	public Large(Beverage bev) {
		this.bev=bev;
		this.bev.setSize("Lg");
	}
	public String getSize(){
		return bev.getSize();
	}
	public double cost() {
		return bev.cost();
	}
	public String getDesc() {
		return bev.getDesc() + ", Large";
	}


}
