import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Scanner;

public class User implements Runnable{
	private Scanner scanner;
	@Override
	public void run() {
		Item item1 = new Item("item1", new Date(2020, 10, 25), 1, 1);
		Item item2 = new Item("item2", new Date(2020, 10, 25), 2, 2);

		File file = new File("input.txt");

		try {
			scanner = new Scanner(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		while(scanner.hasNextLine()) {
			switch (scanner.nextInt()) {
				case 1:
					ItemList_Singleton.getItemList().insertItem(item1);
					break;
				case 2:
					ItemList_Singleton.getItemList().insertItem(item2);
					break;
			}
		}
	}

}
