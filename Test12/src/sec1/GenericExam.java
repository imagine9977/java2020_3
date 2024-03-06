package sec1;

public class GenericExam {
	public static void main(String[] args) {
		Generic1<String> str = new Generic1<>();
		str.setField1("Monka");
		Generic1<Student> st = new Generic1<>();
		Student a = new Student("장원영",21);
		
		Generic1<Teacher> t = new Generic1<>();
		
		st.setField1(a);
		System.out.println(st.getField1());
	}
}
