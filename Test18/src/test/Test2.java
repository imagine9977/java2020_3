package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> nameList = new ArrayList<String>();
		while(true) {
			System.out.println("�߰��� �̸��� �Է��ϼ���: ");
			String name = sc.next();
			if(name == "clear") { //String �񱳵��� ���� equals()�� ���
				System.out.println("�̸� ����� �ʱ�ȭ �մϴ�.");
				nameList.clear();
				continue; //continue�� �������� �;� ��
				
			}
			if(name == "exit") {
				System.out.println("<<�Է� ����");
				break; //Ż�� �ؾ���
			}
			if(nameList.contains(name)){
				System.out.println("�̹� �����ϴ� �̸��Դϴ�.");
			}else {
				nameList.add(name);//�̸� �߰� �ؾ��� 
				System.out.println("�߰� �Ϸ�");
			}
		}
		
		for(String name:nameList) {
			System.out.println(name);
		}
		
	
	}
}
