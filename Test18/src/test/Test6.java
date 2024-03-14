package test;

import java.util.Arrays;
import java.util.Scanner;

public class Test6 {
	public static void test1(){
		Scanner sc = new Scanner(System.in);
		String[] personArr= new String[5];
		for(int i=1;i<=personArr.length;i++) { //array 에서 length()는 존재하지 않음, length만 가능 <=> String에서는 length()사용 가능 
			
			System.out.print(i+"번째 주민번호 입력.");
			String personId = sc.nextLine();
			if(personId.length()==14) {
				char gender = personId.charAt(7);
				if(gender == '1'||gender == '2'||gender == '3'||gender == '4') {
					personArr[i-1] = personId.substring(0,8)+"******"; //end값이 8은 포함안된다
				}else{
					System.out.println("잘못된 주민번호 형식입니다. 다시 한번 입력해주세요.");
					i--;
				}
			}else {
				System.out.println("잘못된 주민번호 형식입니다. 다시 한번 입력해주세요.");
				i--;
			}
		
		}
		System.out.println("---- 주민등록번호 등록 완료  ----");
		System.out.println(Arrays.toString(personArr));
	}
	
	public static void main(String[] args) {
		test1();
	}
}
	