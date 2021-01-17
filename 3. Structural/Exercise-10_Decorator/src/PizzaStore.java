

public class PizzaStore {
 
	public static void main(String args[]) {

		Pizza greekPizza = new Olives(new Mozzarella(new ThinPizza()));
		Pizza thickMozzarella = new Mozzarella(new ThickPizza());
		Pizza exPizza = new Mozzarella(new Pepper(new ThickPizza()));

		System.out.println("Our Menu:");
		System.out.println(greekPizza.getDescription() + "\n" +
				"Price: " + greekPizza.getCost() + " ILS");
		System.out.println(thickMozzarella.getDescription() + "\n" +
							"Price: " + thickMozzarella.getCost() + " ILS");
		System.out.println(exPizza.getDescription() + "\n" +
							"Price: " + exPizza.getCost() + " ILS");

	}
}

