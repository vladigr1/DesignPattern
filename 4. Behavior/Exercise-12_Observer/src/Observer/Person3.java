package Observer;

public class Person3 extends ObserverClass{

   public Person3(JobPlace jobPlace){
      this.jobPlace = jobPlace;
      this.jobPlace.attach(this);
   }

   @Override
   public void update() {
      System.out.println( "Person3 recieved job offer number: " + jobPlace.getJobOfferNumber());
   }
}



