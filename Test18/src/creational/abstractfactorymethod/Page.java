package creational.abstractfactorymethod;

import java.util.ArrayList;

public abstract class Page extends Item {
	protected String title;
	protected String author;
	protected ArrayList<E> content = new ArrayList();
	public Page(String title, String author) {
		
	}
	public void add(Item item) {
		content.add(item);
	}
	public void output() {
		String filename = title+".html";
		try {
			Writer writer = new FileWriter
		}
	}
	
}
