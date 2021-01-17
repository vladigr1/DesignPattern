

public abstract class ToppingDecorator implements Pizza {
	Pizza pizza;

	// not mandatory, anyway have to implement from pizza
	public abstract String getDescription();
	public abstract double getCost();
}

