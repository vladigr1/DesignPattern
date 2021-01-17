package exercise_3;

import exercise_1.Component;

public class Developer implements  Component  {
	private String  Name;
	private String Job ="Developer";
	public Developer(String name) {
		Name = name;
	}
	@Override
	public void showDetails() {
		// TODO Auto-generated method stub
		 System.out.println("\nName: " + Name + " job: " + Job  );

	}

}
