package exercise_3;

import exercise_1.Component;

public class Manager implements  Component  {

	private String  Name;
	private String Job ="Manager";
	private  Developer developer1;
	private  Developer developer2;
	


	public Manager(String name, Developer developer1, Developer developer2) {
		Name = name;
		this.developer1 = developer1;
		this.developer2 = developer2;
	}



	@Override
	public void showDetails() {
		 System.out.println("\nName: " + Name + " job: " + Job  );
		 
		 System.out.println("\nDevelper1 under: " + Job +Name+":");
		 developer1.showDetails();
		 
		 System.out.println("\nDevelper2 under: " + Job +Name +":");
		 developer2.showDetails();
		
	}

}
