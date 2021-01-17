package hexa;

public class Hexadecimal implements Expression{
	
	private String hex;
	private int radix = 16;
	;
	public Hexadecimal(String hex) {
		super();
		this.hex = hex;
	}
	
	public int getNumber() {
		return Integer.parseInt(hex , radix);
	}
	
	@Override
	public int interpret() {
		return getNumber();
	}


}
