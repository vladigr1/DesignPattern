public class App {
    public static void main(String[] args) throws Exception {
        //Part 1 Main
		//First shape
		Triangle t= new Triangle();
		//The Servant class = service
		MoveServant service= new MoveServant();	
		//Print the zero position of the triangle
		service.PrintPosition(t);
		//Change position for Triangle from the service
		service.moveBy(t, 5, 5);	
		//Print the new position of the triangle
		service.PrintPosition(t);		
		//second shape...
    }
}
