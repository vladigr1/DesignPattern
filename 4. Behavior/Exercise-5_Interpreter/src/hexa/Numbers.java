package hexa;

public class Numbers implements Expression{
	
	private int number;
	
	public Numbers(int number) {
		super();
	this.number = number;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	@Override
	public int interpret() {
		return getNumber();
	}


}
