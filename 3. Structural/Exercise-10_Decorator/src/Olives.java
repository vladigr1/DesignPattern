

public class Olives extends ToppingDecorator {

	public Olives(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getDescription() {
		return pizza.getDescription() + ", Olives";
	}

	@Override
	public double getCost() {
		return pizza.getCost() + 2.49;
	}
}

