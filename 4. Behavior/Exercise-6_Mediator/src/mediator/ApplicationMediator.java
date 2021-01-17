package mediator;
import java.util.ArrayList;

public class ApplicationMediator implements Mediator {
  private ArrayList<Plane> planes;
  public ApplicationMediator() {
    planes = new ArrayList<Plane>();
  }
  public void addPlane(Plane colleague) {
    planes.add(colleague);
  }
  public void send(String message, Plane originator) {
    for(Plane colleague: planes) {
      // task 2 return to response
      if(colleague == originator) {
    	  colleague.receive(message);
      }
    }
  }
}