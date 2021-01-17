package Bridge.ex2;

public class Square extends Shape {

    public Square(Color color) {
      this.color = color;
    }

    @Override
    public String getShape() {

       return getColor() + " Square";
    }

}
