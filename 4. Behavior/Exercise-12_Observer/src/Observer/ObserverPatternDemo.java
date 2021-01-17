package Observer;
public class ObserverPatternDemo {
   public static void main(String[] args) {
	  JobPlace jobPlaceA = new JobPlace();
	  JobPlace jobPlaceB = new JobPlace();
	  JobPlace jobPlaceC = new JobPlace();

      new Person1(jobPlaceA);
      new Person2(jobPlaceA);
      new Person3(jobPlaceA);
      new Person1(jobPlaceB);
      new Person2(jobPlaceB);
      new Person2(jobPlaceC);
      new Person3(jobPlaceC);

      
      System.out.println(" JobA Offer number 10 posted");	
      jobPlaceA.setJobOfferNumber(10);
      System.out.println();

           
      System.out.println(" JobA Offer number 20 posted");	
      jobPlaceB.setJobOfferNumber(20);
      System.out.println();


           
      System.out.println(" JobA Offer number 30 posted");	
      jobPlaceC.setJobOfferNumber(30);
      System.out.println();




     
   }
}



