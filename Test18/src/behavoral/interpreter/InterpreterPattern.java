package behavoral.interpreter;

public class InterpreterPattern {
	public static void main(String[] args) {
		Expression isMale = getMaleExpression();
		Expression isMarried = getMarriedExpression();
		System.out.println("lee married? "+isMarried.interpreter("lee married"));
	}
	public static Expression getMaleExpression() {
		Expression kim = new TerminalExpression("kim");
		Expression lee = new TerminalExpression("lee");
		return new OrExpression(kim,lee);
	}

	public static Expression getMarriedExpression() {
		Expression park = new TerminalExpression("park");
		Expression married = new TerminalExpression("married");
		return new AndExpression(park, married);
	}
}
