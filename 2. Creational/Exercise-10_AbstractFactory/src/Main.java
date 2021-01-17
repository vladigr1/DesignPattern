
public class Main {

	public static void main(String[] args) {
		  AbstractFactory fordFactory = FactoryGenerator.getFactory("FORD");
		  AbstractFactory hondaFactory = FactoryGenerator.getFactory("HONDA");
		  Part part1 = fordFactory.getPart("ENGINE");
		  part1.orderPart();
		  Part part2 = fordFactory.getPart("BREAKS");
		  part2.orderPart();
		  Part part3 = hondaFactory.getPart("ENGINE");
		  part3.orderPart();
		  Part part4 = hondaFactory.getPart("BREAKS");
		  part4.orderPart();

		  AbstractFactory mazdafact1 = FactoryGenerator.getFactory("mazda");
		  Part part5 = mazdafact1.getPart("breaks");
		  Part part6 = mazdafact1.getPart("engine");
		  part5.orderPart();
		  part6.orderPart();

	}

}
