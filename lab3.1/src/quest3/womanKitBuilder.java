package quest3;

public class womanKitBuilder extends promoKitBuilder {


	
	public void buildVideoPart() {
		vid = new video();
		vid.genre="Romance";		
	}
	public void buildGarmentPart() {
		gar = new garment();
		gar.type="Dress";
		
	}
	public void buildBookPart() {
		boo = new book();
		boo.title="Girls for Gals";
	}
	public promoKit getPromoKit() {
		buildVideoPart();
		buildGarmentPart();
		buildBookPart();
		promo= new promoKit("woman's kit", vid, gar, boo);
		return promo;
	}
	
}
