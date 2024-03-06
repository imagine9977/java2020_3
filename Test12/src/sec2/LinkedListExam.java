package sec2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class MyStack {
	private ArrayList<String> arrayStack = new ArrayList<String>();

	public void push(String data) {
		arrayStack.add(data);
	}
	public String pop() {
		int len = arrayStack.size();
		if(len ==0) {
			
		}
		return null;
	}
}

public class LinkedListExam {
	public static void main(String[] args) {
		List<Student> s1 = new LinkedList<>();

		// arrayList는 내용이없어도 해당번쨰의 인스턴스의 메모리ㅏ가 그대로 차지. vactor는 내용이 없으면 반대로 제거됨
	}
}
