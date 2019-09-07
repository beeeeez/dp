package quest8;



public class VerticalScrollingWindow extends ScrollingWindowDec {
	Window win;
	
	public VerticalScrollingWindow(Window win) {
		this.win=win;
	}
	public String getDesc() {
		return win.getDesc() + " - Vertical Scrolling";
	}
	

}