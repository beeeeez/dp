package ex8_2;

import java.util.ArrayList;

public class driver {
	
	public static void main(String[] args) {
	
	RemoteControl rc = new RemoteControl();
	
	Light livingRoomLight = new Light("Living Room");
	Light kitchenLight = new Light("Kitchen");
	
	CeilingFan ceilingFan = new CeilingFan("Living Room");
	GarageDoor garageDoor = new GarageDoor();
	Stereo stereo = new Stereo("Living Room");
	
	LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
	LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
	LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
	LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
	
	CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
	CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
	
	
	GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);
	GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);
	
	StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
	StereoOffCommand stereoOff = new StereoOffCommand(stereo);
	
	rc.setCommand(0, livingRoomLightOn, livingRoomLightOff);
	rc.setCommand(1, kitchenLightOn, kitchenLightOff);
	rc.setCommand(2, ceilingFanOn, ceilingFanOff);
	rc.setCommand(3, stereoOnWithCD, stereoOff);
	rc.setCommand(4, garageDoorOpen, garageDoorDown);
	
	
	System.out.println(rc);
	
	
	rc.offButtonWasPushed(0);
	rc.onButtonWasPushed(0);
	rc.offButtonWasPushed(1);
	rc.onButtonWasPushed(1);
	rc.offButtonWasPushed(2);
	rc.onButtonWasPushed(2);
	rc.offButtonWasPushed(3);
	rc.onButtonWasPushed(3);
	rc.offButtonWasPushed(4);
	rc.onButtonWasPushed(4);
	rc.undoButtonWasPushed(4);
	
	ArrayList<Command> jimbo = new ArrayList<Command>();
	jimbo.add(garageDoorOpen);
	jimbo.add(ceilingFanOn);
	jimbo.add(stereoOnWithCD);
	MacroOnCommand MacroOn = new MacroOnCommand(jimbo);
	jimbo.clear();
	jimbo.add(ceilingFanOff);
	jimbo.add(garageDoorDown);
	jimbo.add(stereoOff);
	MacroOnCommand MacroOff = new MacroOnCommand(jimbo);
	
	rc.setCommand(0, MacroOn, MacroOff);
	
	rc.onButtonWasPushed(0);
	rc.offButtonWasPushed(0);
	rc.onButtonWasPushed(0);
	rc.undoButtonWasPushed(0);
	}

}
