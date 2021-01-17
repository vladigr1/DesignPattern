package Bridge.ex1;

public class Bike extends Vehicle{
    public Bike(Workshop wl, Workshop w2) {
        super(wl, w2);
    }

    @Override
    public void manufacture() {
        System.out.print("Bike is ");
        workShop1.work();
        workShop2.work();
    }
}