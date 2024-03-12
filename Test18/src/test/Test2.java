package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> nameList = new ArrayList<String>();
		while(true) {
			System.out.println("추가할 이름을 입력하세요: ");
			String name = sc.next();
			if(name == "clear") { //String 비교들은 전부 equals()를 써라
				System.out.println("이름 목록을 초기화 합니다.");
				nameList.clear();
				continue; //continue가 마지막에 와야 함
				
			}
			if(name == "exit") {
				System.out.println("<<입력 종료");
				break; //탈출 해야함
			}
			if(nameList.contains(name)){
				System.out.println("이미 존재하는 이름입니다.");
			}else {
				nameList.add(name);//이름 추가 해야함 
				System.out.println("추가 완료");
			}
		}
		
		for(String name:nameList) {
			System.out.println(name);
		}
		
	
	}
}
