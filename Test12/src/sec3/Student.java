package sec3;

public class Student {
	private String code;
	private String name;
	public Student() {
		
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student(String code, String name) {
		super();
		this.code = code;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [code=" + code + ", name=" + name + "]";
	}
	
	
}
