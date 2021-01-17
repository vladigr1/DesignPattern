package calc;

public class Multiplication implements Expression{
	private Expression left;
	private Expression rignt;
	
	public Multiplication(Expression left, Expression rignt) {
		super();
		this.left = left;
		this.rignt = rignt;
	}
	
	@Override
	public int interpret() {
		return left.interpret() * rignt.interpret();
	}

}
