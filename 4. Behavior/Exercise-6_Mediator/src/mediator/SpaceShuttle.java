package mediator;
public class SpaceShuttle extends ConcretePlane{
	// better implementation because ConcretePlane does everything you need

	public SpaceShuttle(Mediator m, String name) {
        super(m, name);
    }

    @Override
	public void receive(String message) {
		super.receive(message.toLowerCase());
	}

}