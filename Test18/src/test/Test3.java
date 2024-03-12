package test;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
	public static void main(String[] args) {
		List<Integer>	list =new ArrayList<>(); //List는 인터페이스 임으로 개체 선언이 안되어서 ArrayList 클래스로 선언해야함
		list.add(4);
		list.add(-5);
		list.add(0);
		list.add(-3);
		list.add(2);
		list.add(1); // 입력값은 정수만 받아서 더블 형식의 숫자를 넣으면 
		
		for (int num : list) {
			char ch;
			if(num< 0) { //0의 경우도 포함해서 
				ch= '-';
			}else if(num>0) {
				ch='+';
			}else {
				System.out.println("@@@@@@@@@@@@@@");
				continue;
			}
			
			for(int i =1; i<=Math.abs(i);i++) { //생성하는 요소의 값이 실제 갯수의 -1개 만큼 생성해서 변경
				System.out.print(ch);
			}
			System.out.println();
		}
	}
}
