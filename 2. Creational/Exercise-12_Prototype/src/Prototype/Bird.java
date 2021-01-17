package Prototype;
public class Bird extends Animal{
	private int wingsLen;
	
	public Bird(String gender, int kg,int wingsLen) {
		super(gender,kg);
		this.wingsLen=wingsLen;
	}
	
	/*public Bird(Peacock other) {
		super(other);
		this.wingsLen=other.wingsLen;
	}*/
	
	@Override
	public String toString() {
		return super.toString()+", wingsLen= "+this.wingsLen;
	}
}
