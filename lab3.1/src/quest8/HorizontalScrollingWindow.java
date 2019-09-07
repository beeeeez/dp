package quest8;

public class HorizontalScrollingWindow extends ScrollingWindowDec {
	Window win;
	
	public HorizontalScrollingWindow(Window win) {
		this.win=win;
	}
	public String getDesc() {
		return win.getDesc() + " - Horizontal Scrolling";
	}
	

}
