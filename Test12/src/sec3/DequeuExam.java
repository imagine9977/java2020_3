package sec3;

import java.util.Deque;
import java.util.LinkedList;

//stack 과 queue 혼합한 형식
public class DequeuExam {
	public static void main(String[] args) {
		Deque<String> d = new LinkedList<>();
		d.addFirst("자바");
		d.addFirst("파이썬");
		d.addFirst("씨피피"); // 씨피피, 파이썬, 자바
		d.addLast("러스트");
		System.out.println(d);
		System.out.println(d.peek());
		System.out.println(d.peekFirst());
		System.out.println(d.peekLast());
		System.out.println(d.pollFirst());
		System.out.println(d.pollLast());
		System.out.println(d);
	}
}
