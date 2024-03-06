package sec3;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class StreamExam {
	public static void main(String[] args) {
		int[] arr= {95,100,85,90};
		Arrays.stream(arr).forEach(n->System.out.println(n)); 
		int sum = Arrays.stream(arr).sum();
		System.out.println("Total sum: "+sum);
		OptionalDouble avg = Arrays.stream(arr).average();
		System.out.println("Total average: "+avg);
		OptionalInt max = Arrays.stream(arr).max();
		System.out.println("Total max: "+max);
		OptionalInt min = Arrays.stream(arr).min();
		System.out.println("Total min: "+min);
		int cnt = (int) Arrays.stream(arr).count();
		System.out.println("Total count: "+cnt);
	}
}
