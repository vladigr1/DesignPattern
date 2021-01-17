package mediator;

public class Helicopter extends Plane {



    private String name;
  
	public Helicopter(Mediator m, String name) {
		super(m);
		this.name = name;
	}

	public void receive(String message) {
		System.out.println(name+": "+ message.toUpperCase());
	}
}
