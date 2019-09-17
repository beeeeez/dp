package finalDec;

public class driver {

	public static void main(String[] args) {
		Robot robo = new HumanoidRobot();
		robo = new RobotController(robo);		
		robo = new RobotMonitor(robo);
		robo = new RobotKeyboard(robo);		
	
		
		Robot robo2 = new HumanoidRobot();
		robo2 = new RobotWheel(robo2);		
		robo2 = new RobotDiskDrive(robo2);
		System.out.println("Robot 1 : " + robo.getDesc() + " \n\n\n\n Robot 2 :"+robo2.getDesc());


	}
	
	
}
