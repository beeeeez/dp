package quest7;

import java.util.ArrayList;

import quest6.peep;

public class BusinessNewsPublisher implements NewsPublisher {
	private ArrayList Subscribers;
	private String news;
	
	public BusinessNewsPublisher() {
		Subscribers=new ArrayList();
	}
	public void addListener(Subscriber x) {
		Subscribers.add(x);
	}
	public void deleteListener(Subscriber x) {
		int i = Subscribers.indexOf(x);
		if(i>=0) {
			Subscribers.remove(i);
		}		
	}
	public void setNews(String news) {
		this.news=news;		
		for(int i=0;i<Subscribers.size();i++) {
			Subscriber sub = (Subscriber)Subscribers.get(i);
			sub.notifySub(this);			
		}
	}	
	public String getNews() {
		return news;
	}
	
}
