package finalDec;

public class RobotKeyboard extends ComponentDec{
	Robot rob;
	
	public RobotKeyboard(Robot rob) {
		this.rob=rob;
	}
	public String getDesc() {
		return rob.getDesc()+"\n With Keyboard";
	}
}
