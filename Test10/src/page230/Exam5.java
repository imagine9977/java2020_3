package page230;

import java.util.ArrayList;

public class Exam5 {
	public static void main(String[] args) {
		ArrayList<Dog> dog= new ArrayList<Dog>();
		Dog d0 =new Dog("눈탱이","치와와");
		Dog d1=new Dog("누렁이","진돗개");
		Dog d2=new Dog("누렁이2","진돗개");
		Dog d3=new Dog("누렁이3","진돗개");
		Dog d4=new Dog("누렁이4","진돗개");
		dog.add(d0);
		dog.add(d1);
		dog.add(d2);
		dog.add(d3);
		dog.add(d4);
		for(Dog d:dog) {
			
			System.out.println(d.show());
		}
	}
}
