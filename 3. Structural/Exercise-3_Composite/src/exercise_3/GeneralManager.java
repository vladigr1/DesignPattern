package exercise_3;

import exercise_1.Component;

public class GeneralManager implements  Component {

	private String  Name;
	private String Job ="Genaral Manger";
	private Manager manager;
	private Developer developer;
	
	
	public GeneralManager(String name, Manager manager, Developer developer) {
		Name = name;
		this.manager = manager;
		this.developer = developer;
	}


	@Override
	public void showDetails() {
	 System.out.println("\nName: " + Name + " job: " + Job  );
	 
	 System.out.println("\nManger under " + Job +Name+":");
	 manager.showDetails();
	 
	 System.out.println("\nDeveloper under " + Job +Name+":");
	 developer.showDetails();
	}

	

}
