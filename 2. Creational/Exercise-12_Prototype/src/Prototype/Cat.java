package Prototype;

public class Cat extends Animal{
	
	private int whiskersLen;
	
	public Cat(String gender, int kg,int whiskerslen) {
		super(gender,kg);
		this.whiskersLen=whiskerslen;
	}
	
	
	@Override
	public String toString() {
		return super.toString()+", whikersLen= "+this.whiskersLen;
	}
}
