package calc;

public class Parser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Expression operator = getOperatorInstance("5 + 3");

		
		System.out.println("Result: " + operator.interpret());
	}
	
	
	public static Expression getOperatorInstance(String s) {
		String[] arrOfStr = s.split(" ");
		int a=Integer.parseInt(arrOfStr[0]);
		int b=Integer.parseInt(arrOfStr[2]);
		Expression left = new Numbers(a);
		Expression right= new Numbers(b);
		if (s.contains("+")) {
			return new Addition(left, right);
		} else if (s.contains("-")) {
			return new Subtraction(left, right);
		} else if (s.contains("*")) {
			return new Multiplication(left, right);
		}
		return null;
	}

}
