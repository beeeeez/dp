package quest6;

public class singThingy implements peep, thingy{
	private String ding,doodle;
	private int num1=1,num2=6;
	private sub newData;
	private static boolean newStuff;
	public singThingy( sub newData) {
		this.newData=newData;
		this.newData.addPeep(this);
	}
	public void change(String ding, String dong, String doodle) {
		this.ding=ding;
		this.doodle=doodle;
		rollCall();		
	}
	public void rollCall() {
		System.out.println("We sing "+num1+ " "+ding+"s and "+num2+" "+doodle+"s!");
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
			this.doodle=jimmy.getDoodle();
		}
	}
	
	
}	
	
	
