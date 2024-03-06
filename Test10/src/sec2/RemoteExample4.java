package sec2;

public class RemoteExample4 {
	public static void main(String[] args) {
		Audio a1 = new Audio();
		a1.turnOn();
		a1.changeBattery();
		a1.setVolume(30);
		a1.setMute(true);
		a1.setMute(false);
		a1.turnOff();
	}
}
