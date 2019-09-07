package quest8;

public class driver {

	
	public static void main(String[] args) {
		
		Window win = new SimpleWindow();
		win = new HorizontalScrollingWindow(win);
		win = new BeveledBorderedWindow(win);
		System.out.println(win.getDesc());
		
		Window win2 = new SimpleWindow();
		win2= new HorizontalScrollingWindow(win2);
		win2 = new VerticalScrollingWindow(win2);
		win2 = new DashedLineBorderedWindow(win2);
		System.out.println(win2.getDesc());
	}
}
