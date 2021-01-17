

public class ThickPizza implements Pizza {

	@Override
	public String getDescription() {
		return "Thick crust pizza, with tomato sauce";
	}

	@Override
	public double getCost() {
		return 34.99+5;
	}
}

