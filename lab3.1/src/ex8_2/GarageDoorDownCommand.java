package ex8_2;

public class GarageDoorDownCommand implements Command {

	GarageDoor gd;

	public GarageDoorDownCommand(GarageDoor gd) {
		this.gd = gd;
	}

	public void execute() {
		gd.down();
	}

	public void undo() {
		gd.up();
	}
}
