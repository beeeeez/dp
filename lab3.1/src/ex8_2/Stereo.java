package ex8_2;

public class Stereo {

	int volume;
	String room;
	public Stereo(String room) {
		this.room = room;
	}
	public void on() {
		System.out.println(room + " stereo is on");
	}
	public void off() {
		System.out.println(room + " stereo is off");
	}
	public void setCD() {
		System.out.println(room + " stereo is set for CD");
	}
	public void setDVD() {
		System.out.println(room + " stereo is set for DVD");
	}
	public void setRadio() {
		System.out.println(room + " stereo is s");
	}
	public void setVolume(int volume) {
		this.volume=volume;
		System.out.println(room + " stereo is at volume "+volume);
	}

}
