package sec2;

import java.io.Console;

public class ConsoleExam {
	public static void main(String[] args) {
		Console con = System.console();

		System.out.println("Name: ");
		String name = con.readLine();
		System.out.println("Score: ");
		int point = Integer.parseInt(con.readLine());
		System.out.println("weight: ");
		Double weight = Double.parseDouble(con.readLine());
		Person p = new Person(name, point, weight);
		System.out.println("Password: ");
		char[] pwc = con.readPassword();
		String pw = new String(pwc);
		System.out.println(p.getName() + p.getPoint() + p.getWeight());
		System.out.println(p.toString());
	}
}
