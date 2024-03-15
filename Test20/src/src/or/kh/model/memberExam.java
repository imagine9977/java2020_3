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
			System.out.println("1. ��� �߰�\n2. ��� ����\n3. ��� ����\n4.���α׷� ����");
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
					System.out.print("�߰���  ���̵� �Է�: ");
					String id = sc.next();
					System.out.print("��й�ȣ �Է�: ");
					String pw = sc.next();
					System.out.print("�̸� �Է�: ");
					String name = sc.next();
					System.out.print("���� �Է�: ");
					int year = sc.nextInt();
					System.out.print("��ȭ��ȣ �Է�: ");
					String tel = sc.next();

					try {
						list.add(new Member(list.size(), id, pw, name, year, tel));
					} catch (Exception e) {
						e.printStackTrace();
					}
					System.out.println("���ο� ȸ�� ���");
					break;
				case 2:
					for (int i = 0; i < list.size(); i++) {
						System.out.println(list.get(i).toString());
					}
					break;
				case 3:
					String findFood;
					System.out.print("�̸��� �Է��ϼ���: ");
					findFood = sc.next();
					for (int i = 0; i < list.size(); i++) {
						if (list.get(i).getName().equals(findFood)) {
							System.out.println("��� " + list.get(i).toString() + "�� �����Ǿ����ϴ�.");
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
