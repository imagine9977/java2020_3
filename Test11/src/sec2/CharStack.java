package sec2;

public class CharStack {
	private StringBuffer stack;
	public CharStack() {
		stack = new StringBuffer();
	};
	public CharStack(int capacity) {
		stack = new StringBuffer(capacity);
	}
	public void push(char c) {
		stack = stack.append(c);
	}
	public int pop() {
		char c = stack.charAt(stack.length()-1);
		stack = stack.deleteCharAt(c);
		return c;
	}
	public char[] list() {
		char[] arr = stack.substring(0).toCharArray();
		return arr;
	}
}
