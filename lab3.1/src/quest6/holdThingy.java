package quest6;

public class holdThingy implements peep, thingy{
	private String ding,dong;
	private int num1=3,num2=4;
	private sub newData;
	private static boolean newStuff;
	public holdThingy( sub newData) {
		this.newData=newData;
		this.newData.addPeep(this);
	}
	public void change(String ding, String dong, String doodle) {
		this.ding=ding;
		this.dong=dong;
		rollCall();		
	}
	public void rollCall() {
		System.out.println("We hold "+num1+ " "+ding+"s and "+num2+" "+dong+"s!");
	}
	
	public void notifySubs(sub jimmy) {
		newStuff=true;		
		//this is kinda hacky because we can't change the driver, but I feel as if these objects would call to check update down the line  
		getStuff((newData)jimmy);
		rollCall();
	}
	public void getStuff(newData jimmy) {
		if(newStuff==true) {
			this.ding=jimmy.getDing();
			this.dong=jimmy.getDong();
		}
	}
	
	
}	
	
	
