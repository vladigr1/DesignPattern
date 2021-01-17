package exercise_2;
import java.util.ArrayList;

public class Folder {
	private ArrayList<Object> _components = new ArrayList<Object>();
	

	public void add(Object component){
		//second way is to double the add for each component
		if (component instanceof File) {
			this._components.add(component);
		} else if (component instanceof Folder){
			this._components.add(component);
		}else {
			throw new RuntimeException("Illigal object");
		}
		}
	
	
	public void remove(Object component){
		if (component instanceof File) {
			this._components.remove(component);
		} else if (component instanceof Folder){
			this._components.remove(component);
		}else {
			throw new RuntimeException("Illigal object");
		}
	}

	public void showDetails() {
		// TODO Auto-generated method stub
		for (Object component : _components) {
			if (component instanceof File) {
				File new_name = (File) component;
				new_name.showDetails();
			}else if (component instanceof Folder) {
				Folder new_name = (Folder) component;
				new_name.showDetails();
			}else { //will never happens
				throw new RuntimeException("Illigal object");
			}
			
		}

	}

}
