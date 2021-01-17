package Bridge.ex2;

public class Client {
    public static void main(String[] args){
        Color red =new Red();
        Shape redSquare = new Square(red);
        
        System.out.println(redSquare.getShape());
    }

}
