package Example;


public class Shoes implements Visible {
    

    private String _brand;


    public Shoes(String _brand) {
		this._brand = _brand;
	}
    public String getBrand(){
        return this._brand;
    }

    public void setBrand(String brand){
        this._brand=brand;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visit(this);
        
    }
}
