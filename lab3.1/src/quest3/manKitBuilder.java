package quest3;

public class manKitBuilder extends promoKitBuilder{


	
	public void buildVideoPart() {
		vid = new video();
		vid.genre="Action";		
	}
	public void buildGarmentPart() {
		gar = new garment();
		gar.type="Sombrero";
		
	}
	public void buildBookPart() {
		boo = new book();
		boo.title="Man for Men";
	}
	public promoKit getPromoKit() {
		buildVideoPart();
		buildGarmentPart();
		buildBookPart();
		promo= new promoKit("man's kit", vid, gar, boo);
		return promo;
	}
	
}
