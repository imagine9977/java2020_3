package sec3;

import java.util.HashSet;


public class Q5 {
	public static void main(String[] args) {
		HashSet<Student> set1 = new HashSet<Student>();
		set1.add(new Student("100","aa"));
		set1.add(new Student("200","bb"));
		set1.add(new Student("300","cc"));
		set1.add(new Student("400","dd"));
		set1.add(new Student("100","ab"));
		
		System.out.println(set1);
	}
}

