package sec3;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExam {
	public static void main(String[] args) {
		Queue<String> q = new LinkedList<>();
		q.offer("아이브");
		q.offer("르세라핌");
		q.offer("케플러");
		q.offer("뉴진스");
		q.offer("여자아이들");
		q.offer("에스파");
		System.out.println(q);
		System.out.println(q.peek()); //첫번쩨 아이템 확인
		System.out.println(q.peek());
		System.out.println(q.poll()); //첫번째 아이템 제거
		System.out.println(q.poll());
	}
}
