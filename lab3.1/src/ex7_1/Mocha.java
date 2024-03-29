package ex7_1;

public class Mocha extends CondDec {

	Beverage bev;

	public Mocha(Beverage jimmy) {
		this.bev = jimmy;
	}

	public String getDesc() {
		return bev.getDesc() + ", Mocha";
	}

	public double cost() {
		//System.out.println(this.bev.getSize());
		switch (this.bev.getSize()) {
		case "Sm":
			return .15 + bev.cost();
		case "Md":
			return .20 + bev.cost();
		case "Lg":
			return .25 + bev.cost();
		default:			
			return bev.cost();
		}

	}



}
