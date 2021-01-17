import java.util.Random;

public class Main {
	public static void main(String[] args) {
		Random rand = new Random();
		String[] subjects = 
			{"cow", "chicken", "boy", "girl", "baker", "man"};
		String[] verbs = 
			{"walk", "attck", "play", "answer", "cook", "park"};
		String[] objects = 
			{"on the grass", "the puppy", "with the ball", "the question", "the meat", "the car"};
		
		
		PresentSentenceBuilder curPresentBuilder = new PresentSentenceBuilder(
	subjects[rand.nextInt(subjects.length)],
	verbs[rand.nextInt(verbs.length)],
	objects[rand.nextInt(objects.length)]
						);
		PastSentenceBuilder curPastBuilder = new PastSentenceBuilder(
	subjects[rand.nextInt(subjects.length)],
	verbs[rand.nextInt(verbs.length)],
	objects[rand.nextInt(objects.length)]
						);
		
		
		(new SimpleSentaceDirector(curPresentBuilder)).Counsruct();
		System.out.println(curPresentBuilder.getResult());
		(new SimpleSentaceDirector(curPastBuilder)).Counsruct();
		System.out.println(curPastBuilder.getResult());
		
		curPresentBuilder.reset();
		curPastBuilder.reset();
		(new WhenSentaceDirector(curPresentBuilder)).Counsruct();
		System.out.println(curPresentBuilder.getResult());
		(new WhenSentaceDirector(curPastBuilder)).Counsruct();
		System.out.println(curPastBuilder.getResult());
		
	
	}
}
