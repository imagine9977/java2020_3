package Page130;

public class Person {
	private int age;
	private String name;
	private String gender;
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	private boolean isMarried= false;
	private int children = 0;
	public Person(int age, String name, boolean isMarried, int children) {
		super();
		this.age = age;
		this.name = name;
		this.isMarried = isMarried;
		this.children = children;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isMarried() {
		return isMarried;
	}
	public void setMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}
	public int getChildren() {
		return children;
	}
	public void setChildren(int children) {
		this.children = children;
	}
	
}
