package sec3;

import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String>{
	@Override
	public String apply(String s1, String s2) {
		if(s1.getBytes().length >=s2.getBytes().length) return s1;
		return s2;
	}
}
public class StreamExam3 {
	public static void main(String[] args) {
		String[] arr = {"동해물과백두산이","마르고닳도록","하느님이보우하사","우리나라만세"};
		System.out.println(Arrays.stream(arr).reduce("",( s1,s2)->{
			if(s1.getBytes().length >=s2.getBytes().length) return s1;
			return s2;
		} ));
		String res = Arrays.stream(arr).reduce(new CompareString()).get();
		System.out.println(res);
	}
}
