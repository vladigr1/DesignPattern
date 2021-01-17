package Example;
public interface Visitor {
    
    public String visit(Shirt shirt);
    public String visit(Pants pants);
    public String visit(Shoes shoes);
}