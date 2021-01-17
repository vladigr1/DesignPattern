package hexa;

public class Addition implements Expression{
	
	private Expression left;
	private Expression rignt;
	
	public Addition(Expression left, Expression rignt) {
		super();
		this.left = left;
		this.rignt = rignt;
	}
	
	@Override
	public int interpret() {
		return left.interpret()+rignt.interpret();
	}


}
