package sec1;
interface Matrial{
	void doPrinting();
}
class Powder implements Matrial{
	@Override
	public void doPrinting() {
		// TODO Auto-generated method stub
		System.out.println("플라스틱을 출력");
	}

}

class Plastic implements Matrial{

	@Override
	public void doPrinting() {
		// TODO Auto-generated method stub
		System.out.println("플라스틱을 출력");
	}

	@Override
	public String toString() {
		return "Plastic []";
	}
	
	
}

//T extends Matrial 제너릭의 한정자
class GenericPrint<T extends Matrial>{ //Matrial 인터페이스의 자식(후손) 클래스만 허용
	T matrial;
	public GenericPrint() {}
	public GenericPrint(T matrial) {
		super();
		this.matrial = matrial;
	}
	public T getMatrial() {
		return matrial;
	}
	public void setMatrial(T matrial) {
		this.matrial = matrial;
	}
}
public class GenericExam3 {
	public static void main(String[] args) {
		GenericPrint<Plastic> gh1= new GenericPrint<>();
		GenericPrint<Powder> gh2= new GenericPrint<>();
		//GenericPrint<String> gh3= new GenericPrint<>();
	}
}
