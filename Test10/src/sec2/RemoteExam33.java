package sec2;

public class RemoteExam33 {
	public static void main(String[] args) {
		Television tel = new Television();
		tel.turnOn();
		tel.setVolume(20);
		tel.setMute(true);
		tel.setMute(false);
		tel.light();
		tel.dark();
		tel.zoomin();
		tel.zoomout();
		tel.turnOff();
	}
}
