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
			System.out.println("1. ���� �߰�\n2. ���� ����\n3. ���� ����\n4.���α׷� ����");
			System.out.print("��ȣ ����: ");
			int num = 1;
			try {
				num = sc.nextInt();

			} catch (Exception e) {
				System.out.println("����� �� ���� �Է����ּ���.");
				e.printStackTrace();
			} finally {

				switch (num) {
				case 1:
					System.out.print("�߰��� ���� �Է�: ");
					String food = sc.next();
					System.out.print("Į�θ� �Է�: ");
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
							System.out.println("Food " + list.get(i).toString() + "�� �����Ǿ����ϴ�.");
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
