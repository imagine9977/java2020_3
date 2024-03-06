package sec2;

public class Television implements Screen {
	int volume;
	int lightness;
	int zoom;

	@Override
	public void setMute(boolean mute) {
		// TODO Auto-generated method stub
		Screen.super.setMute(mute);
	}


	public int light() {
		if (this.lightness < 255 && this.lightness < 0) {
			this.lightness++;
		}
		System.out.println("밝게");
		return this.lightness;
	}

	public int dark() {
		if (this.lightness < 255 && this.lightness < 0) {
			this.lightness--;
		}
		System.out.println("어둡게");
		return this.lightness;
	}

	public int zoomin() {
		if (zoom>=-500&&zoom<=500) {
			zoom-=50;
		}
			return zoom;
	}
	public int zoomout() {
		if (zoom>=-500&&zoom<=500) {
			zoom+=50;
		}
			return zoom;
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("전원 ON");
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

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("전원 OFF");

	}

}
