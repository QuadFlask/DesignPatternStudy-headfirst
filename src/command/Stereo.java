package command;

public class Stereo {
	private int volume;

	public void on() {
		System.out.println("Stereo is On");
	}

	public void off() {
		System.out.println("Stereo is Off");
	}

	public void setDVD() {
		System.out.println("Stereo Set DVD");
	}

	public void setRadio() {
		System.out.println("Stereo Set Radio");
	}

	public void setCD() {
		System.out.println("Stereo Set CD");
	}

	public void setVolume(int volume) {
		this.volume = volume;
		System.out.println("Stereo Set Volume : " + this.volume);
	}
}
