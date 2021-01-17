

public class Mozzarella extends ToppingDecorator {

	public Mozzarella(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getDescription() {
		return pizza.getDescription() + ", Mozzarella";
	}

	@Override
	public double getCost() {
		return pizza.getCost() + 3;
	}
}

