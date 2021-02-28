package Prototype;
public abstract class Animal implements Cloneable{
	protected String gender;//FEMALE / MALE
	protected int kg;
	static int totalkg=0;
	
	public Animal(String gender, int kg) {//constructor
		this.gender=gender;
		this.kg=kg;
		totalkg+=kg;
	}
	
	/*protected Animal(Animal other) {//copy constructor
		this(other.gender);
	}*/
	
	public int getKg() {
		return kg;
	}

	public void setKg(int kg) {
		this.kg = kg;
	}

	public int totalKG()
	{
		return totalkg;
	}
	
	@Override
	public String toString() {
		return ": gender="+gender+", kg="+kg;
	}
	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException
	{ 
		Animal cloned =(Animal)super.clone();
		cloned.setKg(this.getKg());
		cloned.setGender(this.getGender());
		cloned.totalkg= this.totalKG();
		return cloned;
	}
}
