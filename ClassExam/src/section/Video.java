package section;

public class Video {
	private int vno;	//?™?˜?ƒë²ˆí˜¸
	private String name;	//?™?˜?ƒ ?´ë¦?
	private String url;		//?™?˜?ƒ ê²½ë¡œ
	private int volume;		//?™?˜?ƒ ?š©?Ÿ‰
	private int hori;	//ê°?ë¡? ?¬ê¸?
	private int verti;	//?„¸ë¡? ?¬ê¸?
	public Video() {}
	public Video(int vno, String name, String url, int volume, int hori, int verti) {
		this.vno = vno;
		this.name = name;
		this.url = url;
		this.volume = volume;
		this.hori = hori;
		this.verti = verti;
	}
	public int getVno() {
		return vno;
	}
	public void setVno(int vno) {
		this.vno = vno;
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
		return "Video [vno=" + vno + ", name=" + name + ", url=" + url + ", volume=" + volume + ", hori=" + hori
				+ ", verti=" + verti + "]";
	}
}
