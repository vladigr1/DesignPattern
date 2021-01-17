
public class FordFactory extends AbstractFactory {
	@Override
	public Part getPart(String partType)
	{
		if(partType.equalsIgnoreCase("ENGINE"))
			return new FordEngine();
		if(partType.equalsIgnoreCase("BREAKS"))
			return new FordBreaks();
		return null;
	}
}



