package mediator;
public class ConcretePlane extends Plane {
	private String name;
  
	public ConcretePlane(Mediator m, String name) {
		super(m);
		this.name = name;
	}

	public void receive(String message) {
		System.out.println(name + " Received: " + message);
	}
}