package section;
//?™ë¬?
public class Animal {
	private String name;	//?´ë¦?
	private String type;	//ì¢…ë¥˜
	private double lifeSpan;	//?ˆ˜ëª?
	private int age;	//?‚˜?´
	private boolean spine;	//ì²™ì¶”?œ ë¬?
	public Animal() { }
	public Animal(String name, String type, double lifeSpan, int age, boolean spine) {
		super();
		this.name = name;
		this.type = type;
		this.lifeSpan = lifeSpan;
		this.age = age;
		this.spine = spine;
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
	public double getLifeSpan() {
		return lifeSpan;
	}
	public void setLifeSpan(double lifeSpan) {
		this.lifeSpan = lifeSpan;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isSpine() {
		return spine;
	}
	public void setSpine(boolean spine) {
		this.spine = spine;
	}
	@Override
	public String toString() {
		return "Animal [name=" + name + ", type=" + type + ", lifeSpan=" + lifeSpan + ", age=" + age + ", spine="
				+ spine + "]";
	}
}
