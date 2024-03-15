package section;

public class Image {
	private int ino;	//?��미�?코드
	private String name;	//?��미�? ?���?
	private String url;		//?��미�? 경로
	private int volume;		//?��미�? ?��?��
	private int hori;	//�?�? ?���?
	private int verti;	//?���? ?���?
	public Image() { }
	public Image(int ino, String name, String url, int volume, int hori, int verti) {
		this.ino = ino;
		this.name = name;
		this.url = url;
		this.volume = volume;
		this.hori = hori;
		this.verti = verti;
	}
	public int getIno() {
		return ino;
	}
	public void setIno(int ino) {
		this.ino = ino;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public int getHori() {
		return hori;
	}
	public void setHori(int hori) {
		this.hori = hori;
	}
	public int getVerti() {
		return verti;
	}
	public void setVerti(int verti) {
		this.verti = verti;
	}
	@Override
	public String toString() {
		return "Image [ino=" + ino + ", name=" + name + ", url=" + url + ", volume=" + volume + ", hori=" + hori
				+ ", verti=" + verti + "]";
	}
	
}
