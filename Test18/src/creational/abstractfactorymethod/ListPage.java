package creational.abstractfactorymethod;

public class ListPage extends Page {

	public ListPage(String title, String author) {
		super(title, author);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String makeHTML() {
		StringBuffer bf = new StringBuffer();
		bf.append("<html><head><title>"+title+"</title></head>\n");
		bf.append("<body>\n");
		bf.append("</body>\n");
		bf.append("<h1>"+title+"</h1>");
		bf.append("<u1>\n");
		for(Object o: content) {
			Item item = (Item) o;
			bf.append("<li>"+item.makeHTML()+"</li>");
		}
		bf.append("</hmtl>\n");
		return bf.toString();
	}
	
}
