package quest8;


public class BeveledBorderedWindow extends ScrollingWindowDec {
	Window win;
	
	public BeveledBorderedWindow(Window win) {
		this.win=win;
	}
	public String getDesc() {
		return win.getDesc() + " - Beveled Bordered";
	}
	

}
