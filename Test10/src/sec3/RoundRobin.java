package sec3;

public class RoundRobin implements Scheduler {
	//SRT(short remaining time 선점형)
	//A 3시간
	//B 2
	//C 4 
	//D 3
	//E 2
	//1시간씩 배분하면
	// A(2)-> B(1)->C(3)->D(2)->E(1)->A(1)->B(0)->C(2)->D(1)->E(0)->A(0)->C(1)->D(0)->C(0)
	
	@Override
	public void getNextCall() {
		System.out.println("상담 전화를 순서대로 대기열에서 가져옵니다.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("다음 순서 상담원에게 배분합니다.");
	}
}
