package test;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
	public static void main(String[] args) {
		List<Integer>	list =new ArrayList<>(); //List는 인터페이스 임으로 개체 선언이 안되어 NullPointerError가 일어나서 ArrayList 클래스로 선언해야함 
		list.add(4);
		list.add(-5);
		list.add(0);
		list.add(-3);
		list.add(2);
		list.add(1); // 리스트 선언시 요소의 데이터 타입이 Integer인데 더블 형식의 숫자를 입력 받으면 안된다. *타입 오류 발생*
		
		for (int num : list) {
			char ch;
			if(num< 0) { //0의 경우도 포함하면 음수가 아니되므로 0보다 작은 경우로 변경 *if문의 조건 오류로 인한 else 출력 오류*
				ch= '-';
			}else if(num>0) {
				ch='+';
			}else {
				System.out.println("@@@@@@@@@@@@@@");
				continue;
			}
			
			for(int i =1; i<=Math.abs(i);i++) { //생성하는 요소의 값이 실제 갯수의 -1개 만큼 생성한다. 따라서 절대값을 포함한 갯수로 변경
											    //for 문이 작을때까지만 실행하게 되어 해당 숫자의 횟수만큼 부호를 출력하는게 아니라 한번 씩 덜 출력해서 오류 발생
				System.out.print(ch);
			}
			System.out.println();
		}
	}
}
