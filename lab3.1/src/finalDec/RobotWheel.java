package finalDec;

public class RobotWheel extends ComponentDec{
	Robot rob;
	
	public RobotWheel(Robot rob) {
		this.rob=rob;
	}
	public String getDesc() {
		return rob.getDesc()+"\n With Wheel";
	}
}
