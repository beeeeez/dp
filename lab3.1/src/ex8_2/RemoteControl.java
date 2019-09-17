package ex8_2;

public class RemoteControl {

	Command[] onComs;
	Command[] offComs;
	Command undo;

	public RemoteControl() {
		onComs = new Command[7];
		offComs = new Command[7];
		
	

	Command noCom = new NoCommand();
		undo=noCom;
	for(
	int i = 0;i<7;i++)
	{
		onComs[i] = noCom;
		offComs[i] = noCom;
	}
	}

	public void setCommand(int slot, Command onCom, Command offCom) {
		onComs[slot]=onCom;
		offComs[slot]=offCom;
	}
	
	public void onButtonWasPushed(int slot) {
		onComs[slot].execute();
		undo=onComs[slot];
	}
	public void offButtonWasPushed(int slot) {
		offComs[slot].execute();
		undo=offComs[slot];
	}
	public void undoButtonWasPushed(int slot) {
		undo.undo();
	}
	
	public String toString() {
		
		StringBuffer str = new StringBuffer();
		
		str.append("\n** Remote Control **\n");
		
		for (int i =0 ; i < onComs.length;i++) {
			str.append("[slot " + i + "]"
				+ onComs[i].getClass().getName()
				+ "          "
				+ offComs[i].getClass().getName()
				+ "\n");	
			
		}
		
		return str.toString();
	}

}