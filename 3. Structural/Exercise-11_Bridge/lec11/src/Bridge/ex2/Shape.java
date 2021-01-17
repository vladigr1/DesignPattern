package Bridge.ex2;

public  abstract class Shape {
   Color color; 

   public String getColor(){
       return color.getColor();
   }

   public abstract String getShape();

}
