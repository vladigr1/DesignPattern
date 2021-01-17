package exercise_3;

public class mainMain {
	public static void main(String[] args) {
		
		Manager manger = new Manager("vlad",new Developer("Ofeck"),new Developer("Yonathan"));	
		GeneralManager genManger = new GeneralManager("Eldad",manger,new Developer("slave"));


		genManger.showDetails();
		}
}
