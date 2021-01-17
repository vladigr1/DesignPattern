

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BugattiVeyron bugatti = new BugattiVeyron();
		System.out.println("Bugatti Speed: " + bugatti.getSpeed() + " MP/H");
		
		MphToKmAdapter adapter = new MphToKmAdapter(bugatti);
		System.out.println("Bugatti Adapted Speed: " + adapter.getSpeed() + " KM/H");
	}

}
