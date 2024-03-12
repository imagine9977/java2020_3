package behavioral.templatemethod;

public class TemplateMethodPattern {
	public static void main(String[] args) {
		HouseTemplate home1 = new WoodenHouse();
		home1.buildHouse();
	}
}
