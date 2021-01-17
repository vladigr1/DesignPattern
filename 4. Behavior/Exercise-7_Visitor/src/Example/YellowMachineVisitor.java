package Example;
public class YellowMachineVisitor implements Visitor {
    @Override
    public String visit(Shirt shirt) {
        System.out.println("shirt with the color yellow of the brand: ");
        return shirt.getBrand();
    }

    @Override
    public String visit(Pants pants) {
        System.out.println("pants with the color yellow of the brand: ");
        return pants.getBrand();
    }

    @Override
    public String visit(Shoes shoes) {
        System.out.println("shoes with the color yellow of the brand: ");
        return shoes.getBrand();
    }
 
}
