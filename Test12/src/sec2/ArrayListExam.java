package sec2;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExam {
	public static void main(String[] args) {
		List<Member> memList = new ArrayList<Member>();
		for(int i =1;i<10;i++) {
			Member mem = new Member(i, "kim"+i,"abcd"+i,"김"+i,0); 
			memList.add(mem);
		}
		for(Member m : memList) {
			System.out.println(m.toString());
		}
	}
}
