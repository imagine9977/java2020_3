package sec2;

public class ClassExam {
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Person p1 = new Person("Park",40);
		System.out.println(p1.getClass().getName());
		Class<Person> p2 = Person.class;
		System.out.println(p2.getName());
		
		Class p3 = Class.forName("sec2.Person"); //드라이버 및 서벌 할때 자주 쓰일 예정
		System.out.println(p3.getName());
		
		Person p4 = (Person) p3.newInstance(); //앞으로 안씀 
		//Class p = Class.forName("sec4.MyDog");
		//MyDog dog = (MyDog) p.newInstance(); //386pg 
		p4.setName("김기태");
		p4.setAge(43);
		System.out.println("인스턴스 정보: "+p4);
	}
}
