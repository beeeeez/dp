package quest7;

public class driver {

	public static void main(String[] args) {
		BusinessNewsPublisher bn = new BusinessNewsPublisher();
		bn.setNews("jimmy");
		SMSSubscriber sms = new SMSSubscriber(bn);
		EmailSubscriber email = new EmailSubscriber(bn);
		
		bn.setNews("jammy");
		sms.checkforUpdate();
		email.checkforUpdate();
	}
}
