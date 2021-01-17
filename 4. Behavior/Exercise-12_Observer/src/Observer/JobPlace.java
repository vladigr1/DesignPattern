package Observer;
import java.util.ArrayList;
import java.util.List;

public class JobPlace {
	
   private List<ObserverClass> observers = new ArrayList<ObserverClass>();
   private int jobOfferNumber;

   public int getJobOfferNumber() {
      return jobOfferNumber;
   }

   public void setJobOfferNumber(int state) {
      this.jobOfferNumber = state;
      notifyAllObservers();
   }

   public void attach(ObserverClass observer){
      observers.add(observer);		
   }

   public void notifyAllObservers(){
      for (ObserverClass observer : observers) {
         observer.update();
      }
   } 	
}


