package test;

import java.util.Arrays;
import java.util.Scanner;

public class Test6 {
	public static void test1(){
		Scanner sc = new Scanner(System.in);
		String[] personArr= new String[5];
		for(int i=1;i<=personArr.length;i++) { //array ���� length()�� �������� ����, length�� ���� <=> String������ length()��� ���� 
			
			System.out.print(i+"��° �ֹι�ȣ �Է�.");
			String personId = sc.nextLine();
			if(personId.length()==14) {
				char gender = personId.charAt(7);
				if(gender == '1'||gender == '2'||gender == '3'||gender == '4') {
					personArr[i-1] = personId.substring(0,8)+"******"; //end���� 8�� ���Ծȵȴ�
				}else{
					System.out.println("�߸��� �ֹι�ȣ �����Դϴ�. �ٽ� �ѹ� �Է����ּ���.");
					i--;
				}
			}else {
				System.out.println("�߸��� �ֹι�ȣ �����Դϴ�. �ٽ� �ѹ� �Է����ּ���.");
				i--;
			}
		
		}
		System.out.println("---- �ֹε�Ϲ�ȣ ��� �Ϸ�  ----");
		System.out.println(Arrays.toString(personArr));
	}
	
	public static void main(String[] args) {
		test1();
	}
}
	