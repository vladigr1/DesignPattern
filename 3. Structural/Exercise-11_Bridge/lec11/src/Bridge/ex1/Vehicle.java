package Bridge.ex1;

public abstract class Vehicle {
    Workshop workShop1;
    Workshop workShop2;

    protected Vehicle(Workshop wl, Workshop w2) {
        this.workShop1 = wl;
        this.workShop2 = w2;
    }

    abstract public void manufacture();
}