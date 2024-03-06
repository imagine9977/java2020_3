package sec2;

public class StringbufferExam2 {
	public static void main(String[] args) {
		String str = new String("Java Programmer");
		str += "Junior Level";
		str += "Developer";
		System.out.println(str);
		
		StringBuffer sb = new StringBuffer(); //cannot add Strings, only individual char
		byte[] b= str.getBytes();
		for(byte c : b) {
			char k=(char) c;
			sb.append(k);
		}
		System.out.println(sb);
		
		CharStack cs = new CharStack();
		cs.push('V');
		cs.push('I');
		cs.push('C');
		cs.push('T');
		cs.push('O');
		cs.push('R');
		cs.push('Y');
		
		System.out.println(cs.list().length);
		System.out.println(cs.toString().length());
	}
}
