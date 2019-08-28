package ex7_1;

public class Soy extends CondDec {

	Beverage bev;


	public Soy(Beverage bev) {
		this.bev = bev;

	}

	public String getDesc() {
		return bev.getDesc() + ", Soy";
	}

	public double cost() {
		switch (bev.getSize()) {
		case "Sm":
			return .10 + bev.cost();
		case "Md":
			return .15 + bev.cost();
		case "Lg":
			return .20 + bev.cost();
		default:
			return bev.cost();
		}
	}


}