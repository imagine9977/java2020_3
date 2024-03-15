package src.or.kh.model;

import java.util.ArrayList;
import java.util.List;

import section.Account;

//외부 jar 파일은 빌드에서 클래스쪽에 import하면 된다


public class AccountExam {
	public static void main(String[] args) {
		List<Account> accList = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			Account acc = new Account(i, i+"아무개","토스뱅크"+i,0);
			accList.add(acc);
		}
		
	}
}
