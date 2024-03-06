package sec2;

public class RemoteExam1 {
	public static void main(String[] args) {
		RemoteControl r1;
		r1 = new RemoteControl() {
			int volume; 
			
			@Override
			public void turnOn() {
				// TODO Auto-generated method stub
				System.out.println("전원 ON");
			}
			
			public void turnOff() {
				// TODO Auto-generated method stub
				System.out.println("전원 OFF");
			}
			
			@Override
			public void setVolume(int volume) {
				// TODO Auto-generated method stub
				if (volume > MAX) {
					this.volume = RemoteControl.MAX;
				} else if (volume < MIN) {
					this.volume = RemoteControl.MIN;
				} else {
					this.volume = volume;
				}
			}

			
		};
	}
}
