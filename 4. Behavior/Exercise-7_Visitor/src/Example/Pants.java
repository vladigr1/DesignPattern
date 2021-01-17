package Example;
class Pants implements Visible {

    private String _brand;

    public Pants(String brand){
        this._brand=brand;
    }

    public String getBrand(){
        return this._brand;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visit(this);
    }
    
}