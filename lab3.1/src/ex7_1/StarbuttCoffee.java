package ex7_1;

import java.text.NumberFormat;

public class StarbuttCoffee {

	public static void main(String[] args) {
		Beverage bev = new Espresso();
	    NumberFormat nf = NumberFormat.getCurrencyInstance();
	   bev=new Small(bev);
	    bev=new Mocha(bev);
		bev=new Mocha(bev);
		bev=new Mocha(bev);
		System.out.println(bev.getDesc() + " " +nf.format(bev.cost()));
		

		Beverage bev2=new DarkRoast();
		bev2=new Large(bev2);
		bev2=new Mocha(bev2);
		bev2=new Mocha(bev2);
		bev2=new Mocha(bev2);
		
		System.out.println(bev2.getDesc() + " " +nf.format(bev2.cost()));
		

		Beverage bev3 = new HouseBlend();
		bev3=new Small(bev3);
		bev3=new Mocha(bev3);
		bev3=new Mocha(bev3);
		bev3=new Mocha(bev3);
		System.out.println(bev3.getDesc() + " " +nf.format(bev3.cost()));
		
		
	
		
	}
}
