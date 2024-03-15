package section;

public class Sound {
	private int sno;	//?Ç¨?ö¥?ìú Î≤àÌò∏
	private String name;	//?Ç¨?ö¥?ìú ?ù¥Î¶?
	private String type;	//?Ç¨?ö¥?ìú Ï¢ÖÎ•ò
	private String url;		//?Ç¨?ö¥?ìú Í≤ΩÎ°ú
	private int volume;		//?Ç¨?ö¥?ìú ?ö©?üâ
	public Sound() { }
	public Sound(int sno, String name, String type, String url, int volume) {
		this.sno = sno;
		this.name = name;
		this.type = type;
		this.url = url;
		this.volume = volume;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	@Override
	public String toString() {
		return "Sound [sno=" + sno + ", name=" + name + ", type=" + type + ", url=" + url + ", volume=" + volume + "]";
	}
	
}
