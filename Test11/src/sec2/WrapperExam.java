package sec2;

public class WrapperExam {
	public static void main(String[] args) {
		int a =10;
		Integer b=a; //참조형 타입 선언: wrapping, boxing
		int c =b; //기본형에 참조형 대입:unwrap, unboxing
		//Boxingg: 기본형의 멤버를 가질 수 없으므로 해당 타입의 메소드나 
		//필드가 없기 떄문에 참조형으로 변경하여야 여러 필요한 정보를 확인하고, 
		//그 타입의 메소드를 사용할 수 있어야 하므로 해당 타입의 관려메소드를 사용하기 위해서는
		//기본형을 참조형으로 바꾸어야 한다. 그러므로 기본 타입에 관련된 boxing 을 실시하여 참조형으로 변경할 수 있는 클래스를 wrapper 클래스라고 한다
		System.out.println("a="+b); 
		//boolean <=> Boolean
		//byte <=>Byte
		//int<=>Integer
		//float <=> Float
		//double <=> Double
		//char <=>Character
		String d= "10";
		String e = "3.14";
		System.out.println(Byte.valueOf(d));
		System.out.println(Integer.valueOf(d));
		System.out.println(Float.valueOf(e));
		
	}
}
