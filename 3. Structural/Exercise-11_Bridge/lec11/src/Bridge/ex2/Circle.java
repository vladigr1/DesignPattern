package Bridge.ex2;

public class Circle extends Shape {

    public Circle(Color color) {
        this.color = color;
    }

    @Override
    public String getShape() {

        return getColor() + "Circle";
    }

}
