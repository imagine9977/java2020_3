package sec3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SetExam {
	public static void main(String[] args) {
		Set<String> set1 = new HashSet<String>();
		Set<Integer> set2 = new HashSet<>();
		set1.add("a");
		set1.add("b");
		set1.add("c");
		set1.add("d");
		set1.add("a");
		set1.add("b");
		set1.add("f");
		set1.add("g");
		System.out.println(set1.size()); //중복 허용 안됨
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		if(set1.contains(input)) {
			System.out.println("has");
		}else {
			set1.add(input);
			System.out.println("added "+input);
		}
		set1.remove("b");
		Set<Integer> set3=new TreeSet<Integer>(Arrays.asList(9,3,4,5,6,8,7,6));
		System.out.println(set3);
		
		
	}
}
