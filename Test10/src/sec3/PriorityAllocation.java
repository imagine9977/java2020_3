package sec3;

public class PriorityAllocation implements Scheduler {
	

	@Override
	public void getNextCall() {
		// TODO Auto-generated method stub
		System.out.println("고객등급이 높은 순서대로 전화를 가져옵니다.");
	}

	@Override
	public void sendCallToAgent() {
		// TODO Auto-generated method stub
		System.out.println("업무값이 제일 높은 상담원에게 우선적으로 배분합니다.");
	
	}
}
