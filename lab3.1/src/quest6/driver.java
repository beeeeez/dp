package quest6;

public class driver {

	public static void main(String[] args) {
		newData newD= new newData();
		
		holdThingy hT = new holdThingy(newD);
		singThingy sT = new singThingy(newD);
		muddleThingy mT = new muddleThingy(newD);
		
		newD.setData("ding", "dong", "doodle");
		newD.setData("bing", "bong", "boodle");
		newD.setData("wing", "wong", "woodle");
		
		
	}
}