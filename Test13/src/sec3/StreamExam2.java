package sec3;

import java.util.ArrayList;

import java.util.List;
import java.util.stream.Stream;

public class StreamExam2 {
	public static void main(String[] args) {
		List<String> lst = new ArrayList<>();
		lst.add("이수");
		lst.add("이던");
		lst.add("이가");
		lst.add("이마");
		lst.add("이보");
		
		Stream<String> stream = lst.stream();
		System.out.println("정렬전");
		stream.forEach(s->System.out.println(s));
		System.out.println("정렬후");
		lst.stream().sorted().forEach(s->System.out.println(s));
	}
}
