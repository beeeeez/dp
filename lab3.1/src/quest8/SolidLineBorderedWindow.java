package quest8;


public class SolidLineBorderedWindow extends ScrollingWindowDec {
	Window win;
	
	public SolidLineBorderedWindow(Window win) {
		this.win=win;
	}
	public String getDesc() {
		return win.getDesc() + " - Solid Line Bordered";
	}
	

}
