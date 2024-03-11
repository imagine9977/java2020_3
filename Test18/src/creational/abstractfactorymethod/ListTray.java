package creational.abstractfactorymethod;

public class ListTray extends Tray {

	public ListTray(String caption) {
		super(caption);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String makeHTML() {
		// TODO Auto-generated method stub
		StringBuffer buffer = new StringBuffer();
		buffer.append("<li>"+caption);
		buffer.append("<lul>");
		buffer.append("</li>");
		for(Object o: tray) {
			Item item = (Item) o;
			buffer.append(item.makeHTML());
		}
		buffer.append("</u1>");
		buffer.append("</hmtl>\n");
		return null;
	}
	
}
