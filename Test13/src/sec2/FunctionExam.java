package sec2;
class Met1{
	void method1() {
		int x =100;
		int y= 200;
		System.out.println(x+y);
	}
}	
	
class Met2{
	void method2() {
		
	}
}		
	
	
class Met3{
	void method3() {
		
	}
}		
	
	
class Met4{
	void method4() {
		
	}
}
class func{
	Met1 met1= new Met1();
	met1.method1();
	
	Met2 met2= new Met2();
	met2.method2();
	
	Met3 met3= new Met3();
	met3.method3();
	
	Met4 met4= new Met4();
	met4.method4();
	
	
	public static void fnc1() {
		int x =100;
		int y= 200;
		System.out.println(x+y);
	}
	
	public static void fnc2(int x,int y) {
		
		System.out.println(x+y);
	}
	
	public static int fnc3() {
		int x =100;
		int y= 200;
		return x+y;
	}
}
public class FunctionExam {
public static void main(String[] args) {
	Met1 met1= new Met1();
	
}

}
