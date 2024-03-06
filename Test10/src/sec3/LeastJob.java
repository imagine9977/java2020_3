package sec3;
//LeastJob는 요구량이 제일 적은 것부터 진행 ->SJF(short job first) 비선점
//선점형(preemption): 처리하는 프로세스를 다른 프로세스에게 CPU를 양도될 수 있는 스케즐링
//비선점형(non-preemption): 처리하는 프로세스를 끝내야 다른 프로세스에게 CPU를 주는 스케즐링
//A 3시간
//B 2
//C 4 
//D 3
//E 2
//B->E->A->D->C순으로 해결 
public class LeastJob implements Scheduler {
	@Override
	public void getNextCall() {
		System.out.println("상담전화를 순서대로 대기열에서 가져옵니다.");
	}

	@Override
	public void sendCallToAgent() {
		// TODO Auto-generated method stub
		System.out.println("현재 상담 업무가 업거나 대기가 가장 적은 상담원에게 할당합니다");
	}
}
