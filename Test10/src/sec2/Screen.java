package sec2;

public interface Screen extends RemoteControl {
	public static final int light = 0;


	public default void turnOn() {
		System.out.println("전원 ON");
	}
	
	

	@Override
	public default void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("전원 OFF");
	}

	@Override
	public default void setVolume(int volume) {
		// TODO Auto-generated method stub
		
	}
}
