package quest7;

public class SMSSubscriber implements Subscriber {
	private String news;
	BusinessNewsPublisher publish;
	public void change() {
		news=publish.getNews();
	}
	public void notifySub(NewsPublisher sub) {
		publish=(BusinessNewsPublisher)sub;
	}
}
