import java.util.Date;

public class Item {
	public String name;
	public Date date;
	public int sn;
	public int price;
	
	public Item(String name, Date date, int sn, int price) {
		super();
		this.name = name;
		this.date = date;
		this.sn = sn;
		this.price = price;
	}
	
	@Override
	public String toString() {
		// to string to show result
		return name;
	}
	
}
