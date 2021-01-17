package exercise_1;
import java.util.ArrayList;

public class Folder implements Component {
	private ArrayList<Component> _components = new ArrayList<Component>();
	

	public void add(Component component){
		this._components.add(component);
		}
	
	
	public void remove(Component component){
		this._components.remove(component);
	}

	@Override
	public void showDetails() {
		for (Component component : _components) {
			component.showDetails();
		}

	}

}
