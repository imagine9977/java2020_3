package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean program = true;
		List<Food> list = new ArrayList<>();
		while (program) {
			System.out.println("1. 음식 추가\n2. 음식 정보\n3. 음식 삭제\n4.프로그램 종료");
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
					System.out.print("추가할 음식 입력: ");
					String food = sc.next();
					System.out.print("칼로리 입력: ");
					int calorie = sc.nextInt();
					try {
						list.add(new Food(food, calorie));
					} catch (Exception e) {
						e.printStackTrace();
					}
					break;
				case 2:
					for (int i = 0; i < list.size(); i++) {
						System.out.println(list.get(i).toString());
					}
					break;
				case 3:
					String findFood;
					findFood = sc.next();
					for (int i = 0; i < list.size(); i++) {
						if (list.get(i).getName().equals(findFood)) {
							System.out.println("Food " + list.get(i).toString() + "가 삭제되었습니다.");
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
