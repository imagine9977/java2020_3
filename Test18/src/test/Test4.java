package test;

import java.util.ArrayList;
import java.util.List;

public class Test4 {
	public static void main(String[] args) {
		String names = "김기태 이순신 강감찬 고주몽 부여온조";
		List<IPInfo> ipList = new ArrayList<>();
		ipList.add(new IPInfo("192.168.0.191","이성하"));
		ipList.add(new IPInfo("192.168.1.122","강감찬"));
		
		String str = "이성";
		boolean hasUser = false;
		for(IPInfo i: ipList) {
			if(i.getUser().equals(str)) {
				hasUser = true;
				break;
			}
		}
		if(hasUser) {
			System.out.println(str + "이 존재합니다.");
		}else {
			System.out.println(str + "이 존재 안합니다.");
		}
	}
}
