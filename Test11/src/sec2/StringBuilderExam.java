package sec2;

public class StringBuilderExam {
	public static void main(String[] args) {
		String str = new String("Java Programmer");
		str += 11;
		str += "Junior Level";
		str += "Developer";
		System.out.println(str);
		
		StringBuilder sb = new StringBuilder(); 
		sb.append("Java");
		sb.append(11); //11을 넣음
		sb.append(" Programmer");
		System.out.println(sb);
		sb.insert(6," Web"); //6번째 자리에 대입 가능
		sb.insert(0, "KH ");
		System.out.println(sb);
	}
}
