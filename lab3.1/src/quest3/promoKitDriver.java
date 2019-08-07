package quest3;

public class promoKitDriver {

	public static void main(String[] args) {
		
		promoKit manKit = createPromoKit(new manKitBuilder());
		promoKit womanKit = createPromoKit(new womanKitBuilder());
		
		System.out.println(manKit.getId());
		System.out.println(manKit.vid.genre);
		System.out.println(manKit.gar.type);
		System.out.println(manKit.boo.title);
		
		System.out.println(womanKit.getId());
		System.out.println(womanKit.vid.genre);
		System.out.println(womanKit.gar.type);
		System.out.println(womanKit.boo.title);
		
	}
	public static promoKit createPromoKit(promoKitBuilder buildy) {
		return buildy.getPromoKit();		
	}
	
}


