package hexa;

public class Parser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Expression operator = getOperatorInstance("0x11");
		System.out.println("Result: " + operator.interpret());
		Expression operator1 = getOperatorInstance("11B");
		System.out.println("Result: " + operator1.interpret());
		Expression operator2 = getOperatorInstance("11");
		System.out.println("Result: " + operator2.interpret());
	}
	
	
	public static Expression getOperatorInstance(String s) {
		if (s.contains("0x")) {
			Expression ex =new Hexadecimal(s.replace("0x", ""));
			return ex;
		} else if (s.contains("B")) {
			return new BinaryDecimal(s.replace("B",""));
		} 
		else {
			Expression ex = new Numbers(Integer.parseInt(s));
			return ex;
		}
	}

}
