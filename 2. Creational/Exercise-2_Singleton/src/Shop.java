import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Scanner;

public class Shop {

	public static Scanner scanner;
	


	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		noThreadRun();
		ThreadRun();
	}


	private static void noThreadRun() {
		new User().run();
		ItemList_Singleton.getItemList().printList();
		
	}
	private static void ThreadRun() {
		Thread thread1 = new Thread(new User());
		Thread thread2 = new Thread(new User());
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
			ItemList_Singleton.getItemList().printList();
		} catch (InterruptedException e) {
			// in case of error
			e.printStackTrace();
		}
		
	}

}
