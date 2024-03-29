package ex7_1;

public class Whip extends CondDec {

	Beverage bev;

	public Whip(Beverage bev) {
		this.bev = bev;
	}

	public String getDesc() {
		return bev.getDesc() + ", Whip";
	}

	public double cost() {
		switch (bev.getSize()) {
		case "Sm":
			return .05 + bev.cost();
		case "Md":
			return .10 + bev.cost();
		case "Lg":
			return .15 + bev.cost();
		default:
			return bev.cost();
		}

	}


}
