

public class Pepper extends ToppingDecorator {

	public Pepper(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getDescription() {
		return pizza.getDescription() + ", Pepper";
	}

	@Override
	public double getCost() {
		return pizza.getCost() + 200.2;
	}
}
