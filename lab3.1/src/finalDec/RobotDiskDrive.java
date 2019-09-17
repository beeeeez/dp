package finalDec;

public class RobotDiskDrive extends ComponentDec{
	Robot rob;
	
	public RobotDiskDrive(Robot rob) {
		this.rob=rob;
	}
	public String getDesc() {
		return rob.getDesc()+"\n With Disk Drive";
	}
}
