package Observer;
public class Person2 extends ObserverClass{

   public Person2(JobPlace jobPlace){
      this.jobPlace = jobPlace;
      this.jobPlace.attach(this);
   }

   @Override
   public void update() {
     System.out.println( "Person2 recieved job offer number: " + jobPlace.getJobOfferNumber()); 
   }
}



