package test;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
	public static void main(String[] args) {
		List<Integer>	list =new ArrayList<>(); //List�� �������̽� ������ ��ü ������ �ȵǾ ArrayList Ŭ������ �����ؾ���
		list.add(4);
		list.add(-5);
		list.add(0);
		list.add(-3);
		list.add(2);
		list.add(1); // �Է°��� ������ �޾Ƽ� ���� ������ ���ڸ� ������ 
		
		for (int num : list) {
			char ch;
			if(num< 0) { //0�� ��쵵 �����ؼ� 
				ch= '-';
			}else if(num>0) {
				ch='+';
			}else {
				System.out.println("@@@@@@@@@@@@@@");
				continue;
			}
			
			for(int i =1; i<=Math.abs(i);i++) { //�����ϴ� ����� ���� ���� ������ -1�� ��ŭ �����ؼ� ����
				System.out.print(ch);
			}
			System.out.println();
		}
	}
}
