package hexa;

public class BinaryDecimal implements Expression {

	
	private String bin;
	private int radix = 2;
	;
	public BinaryDecimal(String bin) {
		super();
		this.bin = bin;
	}
	
	public int getNumber() {
		return Integer.parseInt(bin , radix);
	}
	
	@Override
	public int interpret() {
		return getNumber();
	}




}
