package Prototype;

public class Horse extends Animal{
	private int tailLen;
	
	public Horse(String gender, int kg, int tailLen) {
		super(gender,kg);
		this.tailLen=tailLen;
	}
	
	/*public Horse(Horse other) {//copy constructor
		super(other);
		this.tailLen=other.tailLen;
	}*/
	
	@Override
	public String toString() {
		return super.toString()+" , tailLen= "+this.tailLen;
	}

}
