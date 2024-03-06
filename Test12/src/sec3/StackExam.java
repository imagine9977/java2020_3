package sec3;

import java.util.Stack;

public class StackExam {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.push("a");
		stack.push("p");
		stack.push("p");
		stack.push("l");
		stack.push("e");
		System.out.println(stack);
		System.out.println(stack.peek());
	}
}
