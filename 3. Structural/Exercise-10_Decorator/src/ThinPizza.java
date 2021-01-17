

public class ThinPizza implements Pizza {

	@Override
	public String getDescription() {
		return "Thin crust pizza, with tomato sauce";
	}

	@Override
	public double getCost() {
		return 29.99+5;
	}
}

