package structural.bridge;

public class Pentagon extends Shape{

	public Pentagon(Color color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void applyColor() {
		// TODO Auto-generated method stub
		System.out.println("Pentagon has color");
		color.applyColor();
		
	}

}
