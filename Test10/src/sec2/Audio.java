package sec2;

public class Audio implements RemoteControl{
	private int volume;

	
	
	public void turnOn() {
		System.out.println("전원 ON");
	}
	
	

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("전원 OFF");
	}
	public  void setVolume(int volume) {
		if (volume > MAX) {
			this.volume = RemoteControl.MAX;
		} else if (volume < MIN) {
			this.volume = RemoteControl.MIN;
		} else {
			this.volume = volume;
		}
	}

	public void changeBattery() {
		// TODO Auto-generated method stub
		System.out.println("건전지 교체");
	}

	
}
