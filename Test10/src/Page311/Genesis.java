package Page311;

public class Genesis extends Car{
	String name = "Genesis";
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		start();
		drive();
		stop();
		turnoff();
		washCar();
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println(name+" 시동을 켭니다.");
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println(name+" 달립니다");
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println(name+" 멈춥니다");
	}

	@Override
	public void turnoff() {
		// TODO Auto-generated method stub
		System.out.println(name+" 시동을 끕니다");
	}
	@Override
	public void washCar() {
		// TODO Auto-generated method stub
		System.out.println("세차를 합니다");
	}
}
