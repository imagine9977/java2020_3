package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 12~15: List는 인터페이스여서 null값 선언이 안된다. 
		// 따라서 class 값인 arrayList로 선언해야한다. NullPointerException이 발생한다
		List<IPInfo> ipInfoList = new ArrayList<>(); 
		ipInfoList.add(new IPInfo("123.123.123.123", "김기태"));
		ipInfoList.add(new IPInfo("123.132.123.123", "구라인")); //constructor에 String ip값만 받는 constructor이 없음
		ipInfoList.add(new IPInfo("111.123.123.123", "고귀택"));
		// 14번: IPInfo 클래스에서 매게변수 하나를 전달받는 생성자는 없으므로 객체 생성이 불가능하다
		System.out.println("IP 입력:");
		String ip = sc.next();
		for(int i =0;i<ipInfoList.size();i++) {
			if(ipInfoList.get(i).getIp().equals(ip)) { 
				//IPInfo 객체와 String인 ip를 비교할 수 가 없다 따라서 IPInfo의 getIP getter를 통해
				//String값인 ip끼리 비교해야 한다
				System.out.println(ipInfoList.get(i)); //여긴 어짜피 toString으로 자동으로 나올 예정이니 오류 없음
				break;
			} else if(i==ipInfoList.size()-1) { //만약에 해당 LIST에 없을 경우 IP가 없다는 메시지를 출력 
				System.out.println(" 해당 IP 없음" );
			}
		}
	}
}
