package test;

import java.util.ArrayList;
import java.util.List;

public class Test4 {
	public static void main(String[] args) {
		String names = "����� �̼��� ������ ���ָ� �ο�����";
		List<IPInfo> ipList = new ArrayList<>();
		ipList.add(new IPInfo("192.168.0.191","�̼���"));
		ipList.add(new IPInfo("192.168.1.122","������"));
		
		String str = "�̼�";
		boolean hasUser = false;
		for(IPInfo i: ipList) {
			if(i.getUser().equals(str)) {
				hasUser = true;
				break;
			}
		}
		if(hasUser) {
			System.out.println(str + "�� �����մϴ�.");
		}else {
			System.out.println(str + "�� ���� ���մϴ�.");
		}
	}
}
