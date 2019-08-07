package quest3;

public abstract class promoKitBuilder {
	promoKit promo;
	video vid;
	garment gar;
	book boo;
	
	public void buildVideoPart() {
		vid = new video();
	}
	public void buildGarmentPart() {
		gar = new garment();
	}
	public void buildBookPart() {
		boo = new book();
	}
	public promoKit getPromoKit() {return promo;}
	
}
