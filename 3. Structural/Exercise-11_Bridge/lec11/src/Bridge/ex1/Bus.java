package Bridge.ex1;

public class Bus extends Vehicle {
    public Bus(Workshop wl, Workshop w2) {
        super(wl, w2);
    }

    @Override
    public void manufacture() {
        System.out.print("Bus is ");
        workShop1.work();
        workShop2.work();
    }
}