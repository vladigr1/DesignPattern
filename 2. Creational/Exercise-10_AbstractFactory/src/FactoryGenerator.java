
public class FactoryGenerator {
	public static AbstractFactory getFactory(String factoryName) {
		if(factoryName.equalsIgnoreCase("FORD"))
			return new FordFactory();
		if(factoryName.equalsIgnoreCase("HONDA"))
			return new HondaFactory();

		if(factoryName.equalsIgnoreCase("mazda"))
			return new MazdaFactory();
		return null;
	}
}
