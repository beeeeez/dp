package quest8;


public class DashedLineBorderedWindow extends ScrollingWindowDec {
	Window win;
	
	public DashedLineBorderedWindow(Window win) {
		this.win=win;
	}
	public String getDesc() {
		return win.getDesc() + " - Dashed Line Bordered";
	}
	

}
