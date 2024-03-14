package test;

class Person{
	private String string;
	private int num;
	public Person(String string, int i) {
		 this.string = string;
		 this.num = i;
	}
	public String getName() {
		return string;
	}
	public void setName(String string) {
		this.string = string;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;	
	}
	
}

public class Test04 {
	public static void main(String[] args) {
		Person[] pArr = new Person[3];
		pArr[0] = new Person("rlaro", 43);
		pArr[1] = new Person("sdsas", 43);
		pArr[2] = new Person("sdacv", 43);
		for(int i =0; i<pArr.length;i++) {
			System.out.println(pArr[i].getName());
		}
	}
}
