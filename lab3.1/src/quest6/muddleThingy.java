package quest6;

public class muddleThingy implements peep, thingy{
	private String dong,doodle;
	private int num1=5,num2=5;
	private sub newData;
	private static boolean newStuff;
	public muddleThingy( sub newData) {
		this.newData=newData;
		this.newData.addPeep(this);
	}
	public void change(String ding, String dong, String doodle) {
		this.dong=dong;
		this.doodle=doodle;
		rollCall();		
	}
	public void rollCall() {
		System.out.println("We muddle "+num1+ " "+dong+"s and "+num2+" "+doodle+"s!");
	}
	
	public void notifySubs(sub jimmy) {
		newStuff=true;
		
		//this is kinda hacky because we can't change the driver, but I feel as if these objects would call to check update down the line 
		getStuff((newData)jimmy);
		rollCall();
	}
	public void getStuff(newData jimmy) {
		if(newStuff==true) {
			this.dong=jimmy.getDong();
			this.doodle=jimmy.getDoodle();
		}
	}
	
	
}	
	
	
