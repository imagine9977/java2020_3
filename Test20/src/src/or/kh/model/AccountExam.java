package src.or.kh.model;

import java.util.ArrayList;
import java.util.List;

import section.Account;

//�ܺ� jar ������ ���忡�� Ŭ�����ʿ� import�ϸ� �ȴ�


public class AccountExam {
	public static void main(String[] args) {
		List<Account> accList = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			Account acc = new Account(i, i+"�ƹ���","�佺��ũ"+i,0);
			accList.add(acc);
		}
		
	}
}
