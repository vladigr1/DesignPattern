package Observer;
public class Person1 extends ObserverClass{

   public Person1(JobPlace jobPlace){
      this.jobPlace = jobPlace;
      this.jobPlace.attach(this);
   }

   @Override
   public void update() {
      System.out.println( "Person1 recieved job offer number: " + jobPlace.getJobOfferNumber()); 
   }
}



