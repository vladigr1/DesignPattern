package Prototype;

public class Giraffe extends Animal{
	private int neckLen;
	
	public Giraffe(String gender, int kg,int neckLen) {
		super(gender,kg);
		this.neckLen=neckLen;
	}
	
	/*public Giraffe(Peacock other) {
		super(other);
		this.wingslen=other.wingslen;
	}*/
	
	@Override
	public String toString() {
		return super.toString()+", neckLen= "+this.neckLen;
	}
}