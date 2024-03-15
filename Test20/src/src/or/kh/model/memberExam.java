package src.or.kh.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import section.Member;

public class memberExam {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		memberExam app = new memberExam();
		app.mainCall();
	}

	public void mainCall() {
		boolean program = true;
		List<Member> list = new ArrayList<>();
		while (program) {
			System.out.println("1. 멤버 추가\n2. 멤버 정보\n3. 멤버 삭제\n4.프로그램 종료");
			System.out.print("번호 선택: ");
			int num = 1;
			try {
				num = sc.nextInt();

			} catch (Exception e) {
				System.out.println("제대로 된 값을 입력해주세요.");
				e.printStackTrace();
			} finally {

				switch (num) {
				case 1:
					System.out.print("추가할  아이디 입력: ");
					String id = sc.next();
					System.out.print("비밀번호 입력: ");
					String pw = sc.next();
					System.out.print("이름 입력: ");
					String name = sc.next();
					System.out.print("연도 입력: ");
					int year = sc.nextInt();
					System.out.print("전화번호 입력: ");
					String tel = sc.next();

					try {
						list.add(new Member(list.size(), id, pw, name, year, tel));
					} catch (Exception e) {
						e.printStackTrace();
					}
					System.out.println("새로운 회원 등록");
					break;
				case 2:
					for (int i = 0; i < list.size(); i++) {
						System.out.println(list.get(i).toString());
					}
					break;
				case 3:
					String findFood;
					System.out.print("이름을 입력하세요: ");
					findFood = sc.next();
					for (int i = 0; i < list.size(); i++) {
						if (list.get(i).getName().equals(findFood)) {
							System.out.println("멤버 " + list.get(i).toString() + "가 삭제되었습니다.");
							list.remove(i);
							break;
						}
					}
					break;
				case 4:
					program = false;
					break;

				}
			}
		}
	}
}
