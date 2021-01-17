

public class MphToKmAdapter {
    Movable car;

	public MphToKmAdapter(Movable car) {
        this.car = car;
    }
    
    public double getSpeed(){
        return 1.609344 * car.getSpeed();
    }


}
