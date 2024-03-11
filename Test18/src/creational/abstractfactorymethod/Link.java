package creational.abstractfactorymethod;

public abstract class Link extends Item {
	protected String url;
	//<a href="https://naver.com">³×ÀÌ¹ö<a>
	//
	//
	public Link(String caption, String url) {
		super(caption);
		this.url = url;
		// TODO Auto-generated constructor stub
	}
	
}
