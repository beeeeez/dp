package ex8_1;

public class RemoteControllerTest {
	
	public static void main(String[] args) {
		
		SimpleRemoteControl remote = new SimpleRemoteControl();
		
		Light light = new Light();
		LightonCommand lightOn = new LightonCommand(light);
		remote.setCommand(lightOn);
		remote.buttonWasPressed();
		
		GarageDoor gd = new GarageDoor();
		GarageDoorOpenCommand gdopen = new GarageDoorOpenCommand(gd);
		remote.setCommand(gdopen);
		remote.buttonWasPressed();
		
	}

}
