package ex8_1;

public class SimpleRemoteControl {
	Command slot;
	public void setCommand(Command command) {
		slot=command;
	}
	public void buttonWasPressed() {
		slot.execute();
	}

}
