package quest7;

public class SMSSubscriber implements Subscriber {
	private String news;
	private static boolean update;
	BusinessNewsPublisher publish;
	public SMSSubscriber(BusinessNewsPublisher x) {
		update=false;
		publish=x;
		news=x.getNews();
	}
	public void change() {
		news=publish.getNews();
		update=false;
	}
	public void notifySub(NewsPublisher sub) {
		publish=(BusinessNewsPublisher)sub;
		update=true;
	}
	public void sayNews() {
		System.out.println(news);
	}
	public void checkforUpdate() {
		if (update==true){
			change();
			sayNews();
		}
	}
}
