import java.util.ArrayList;

public class ItemList_Singleton {
	private final static ItemList_Singleton instance = new ItemList_Singleton();
	private ArrayList<Item> list;
	private ItemList_Singleton() {
		list = new ArrayList<Item>();
	}
	
	public static  ItemList_Singleton getItemList() {
		// # Not relevant in file load it will instanctiet 
		// if (instance == null) {
		//  instance = new ItemList_Singleton();
		// }
		return instance;
	}
	
	public void insertItem(Item item) {
		list.add(item);
	}
	
	public void printList() {
		System.out.println(list);
	}
}
