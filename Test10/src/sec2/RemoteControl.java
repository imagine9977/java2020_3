package sec2;

public interface RemoteControl {
	int MAX = 10;
	int MIN = 0;

	void turnOff();

	public void turnOn();
	
	public void setVolume(int volume);
	
	//디폴트 메소드 
	//같은 패키지 내에 있는 클래스에서 default
	default void setMute(boolean mute) {
		if (mute) System.out.println("무음 처리");
		else System.out.println("무음 해제");
	}
	
	//오버라이딩 안해도 된다
	static void changeBattery() {
		System.out.println("건전지 교체");
	}
}
