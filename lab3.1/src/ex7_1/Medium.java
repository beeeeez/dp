package ex7_1;

public class Medium extends SizeDec{
	Beverage bev;
	public Medium(Beverage bev) {
		this.bev=bev;
		this.bev.setSize("Md");
	}
	public String getSize(){
		return bev.getSize();
	}

	public double cost() {
		return bev.cost();
	}
	public String getDesc() {
		return bev.getDesc() + ", Medium";
	}
}
