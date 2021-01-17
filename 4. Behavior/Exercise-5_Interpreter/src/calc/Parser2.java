package calc;

import java.util.Stack;
public class Parser2 {

	public static void main(String[] args) {
		String tokenString = "1 2 3 4 5 * * - +"; // 1 + 2 - 3 * 4 * 5 = -57
		Stack<Expression> stack = new Stack<Expression>();
		String[] tokenList = tokenString.split(" ");
		for (String s : tokenList){
			if (isOperator(s)) {
				Expression rightExpression = stack.pop();
				Expression leftExpression = stack.pop();
				Expression operator = getOperatorInstance(s, leftExpression, rightExpression);
				int result = operator.interpret();
				stack.push(new Numbers(result));
			} else {
				Expression i = new Numbers(Integer.parseInt(s));
				stack.push(i);
			}
		}
		System.out.println("Result: " + stack.pop().interpret());

	}
	
	
	public static boolean isOperator(String s) {
		if (s.equals("+") || s.equals("-") || s.equals("*"))
			return true;
		else
			return false;
	}
	public static Expression getOperatorInstance(String s, Expression left, Expression right) {
		if (s.equals("+")) {
			return new Addition(left, right);
		} else if (s.equals("-")) {
			return new Subtraction(left, right);
		} else if (s.equals("*")) {
			return new Multiplication(left, right);
		}
		return null;
	}

}
