package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 12~15: List�� �������̽����� null�� ������ �ȵȴ�. 
		// ���� class ���� arrayList�� �����ؾ��Ѵ�. NullPointerException�� �߻��Ѵ�
		List<IPInfo> ipInfoList = new ArrayList<>(); 
		ipInfoList.add(new IPInfo("123.123.123.123", "�����"));
		ipInfoList.add(new IPInfo("123.132.123.123", "������")); //constructor�� String ip���� �޴� constructor�� ����
		ipInfoList.add(new IPInfo("111.123.123.123", "�����"));
		// 14��: IPInfo Ŭ�������� �ŰԺ��� �ϳ��� ���޹޴� �����ڴ� �����Ƿ� ��ü ������ �Ұ����ϴ�
		System.out.println("IP �Է�:");
		String ip = sc.next();
		for(int i =0;i<ipInfoList.size();i++) {
			if(ipInfoList.get(i).getIp().equals(ip)) { 
				//IPInfo ��ü�� String�� ip�� ���� �� �� ���� ���� IPInfo�� getIP getter�� ����
				//String���� ip���� ���ؾ� �Ѵ�
				System.out.println(ipInfoList.get(i)); //���� ��¥�� toString���� �ڵ����� ���� �����̴� ���� ����
				break;
			} else if(i==ipInfoList.size()-1) { //���࿡ �ش� LIST�� ���� ��� IP�� ���ٴ� �޽����� ��� 
				System.out.println(" �ش� IP ����" );
			}
		}
	}
}
