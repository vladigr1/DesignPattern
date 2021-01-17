
public class HondaFactory extends AbstractFactory {
	@Override
	public Part getPart(String partType)
	{
		if(partType.equalsIgnoreCase("ENGINE"))
			return new HondaEngine();
		if(partType.equalsIgnoreCase("BREAKS"))
			return new HondaBreaks();
		return null;
	}
}
