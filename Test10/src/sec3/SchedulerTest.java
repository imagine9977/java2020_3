package sec3;

import java.io.IOException;

public class SchedulerTest {
	public static void main(String[] args) throws IOException {
		System.out.println("전화 상담 방식[A-Z] 선택:");
		int ch = System.in.read();
		Scheduler scheduler = null;
		if(ch=='R'||ch=='r') {
			scheduler =new RoundRobin();
		}else if(ch=='L'||ch=='l') {
			scheduler =new LeastJob();
		} else if(ch=='P'||ch=='p') {
			scheduler =new PriorityAllocation();
		}
		else {
			System.out.println("지원되지 않는 기능입니다.");
			return;
		}
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
	}
}
