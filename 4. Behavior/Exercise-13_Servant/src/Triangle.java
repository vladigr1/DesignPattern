//One of geometric classes
public class Triangle implements Movable {
	// Position of the geometric object on some canvas
	private Position p;
	
	//Init zero position
	public Triangle() {
		this.p= new Position(0,0);
	}

	// Method, which sets position of geometric object
	public void setPosition(Position p) {
		this.p = p;

	}

	// Method, which returns position of geometric object
	public Position getPosition() {
		return this.p;
	}
	
	
}


