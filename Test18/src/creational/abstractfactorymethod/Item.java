package creational.abstractfactorymethod;

public abstract class Item {
	protected String caption;

	public Item(String caption) {
		super();
		this.caption = caption;
	}
	public abstract String makeHTML(); //추상 메소드
}
