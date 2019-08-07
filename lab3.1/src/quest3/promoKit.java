package quest3;

public class promoKit {

	String id;
	video vid;
	garment gar;
	book boo;
	promoKit(String Id, video Vid, garment Gar, book Boo){
		id=Id;
		vid=Vid;
		gar=Gar;
		boo=Boo;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
}
