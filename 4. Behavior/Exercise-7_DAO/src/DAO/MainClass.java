package DAO;

public class MainClass {

    public static void main(String[] args)  
    {
        listMain();
        System.out.println("\nyonathan  the king project:\n");
        mapMain();

    }
     static public void listMain(){
         
        /* Initialize */
        DeveloperDaoImpl DaoL = new DeveloperDaoImpl();
        Developer Developer1 = new Developer("Moshe",0); 
        Developer Developer2 = new Developer("Avi",1); 
        DaoL.addDeveloper(Developer1); 
        DaoL.addDeveloper(Developer2);  
        
//print drop to method        
        for (Developer Developer : DaoL.getAllDevelopers())  
        { 
            System.out.println("DeveloperId : " + Developer.getDeveloperId()  
            + ", Name : " + Developer.getName()); 
        } 
        
        /* Update - change the name of the wanted developer */
        Developer1.setName("Itzik");
        DaoL.updateDeveloper(Developer1);
        
        /* Add */
        DaoL.addDeveloper(new Developer("Shmuel", 6));
        
        /* Remove */
        DaoL.deleteDeveloper(Developer2);
        
        System.out.println("\nDevelopers after DB changes:");
        for (Developer Developer : DaoL.getAllDevelopers())  
        { 
            System.out.println("DeveloperId : " + Developer.getDeveloperId()  
            + ", Name : " + Developer.getName()); 
        }    
    }
    public static void mapMain()
    {         
        /* Initialize */
        
        Developer Developer1 = new Developer("Moshe",0);
        Developer Developer2 = new Developer("Avi",1);
        DeveloperDaoImplMap Devs =new DeveloperDaoImplMap();
        Devs.addDeveloper(Developer1);
        Devs.addDeveloper(Developer2);
        
        for (Developer Developer : Devs.getAllDevelopers())  
        { 
            System.out.println("DeveloperId : " + Developer.getDeveloperId()  
            + ", Name : " + Developer.getName()); 
        } 
        
        /* Update - change the name of the wanted developer */
        Developer1.setName("Itzik");
        Devs.updateDeveloper(Developer1);
        /* Add */
        Devs.addDeveloper( new Developer("Shmuel", 6));
        /* Remove */
        Devs.deleteDeveloper(Developer2);
        
        System.out.println("\nDevelopers after DB changes:");
        for (Developer Developer : Devs.getAllDevelopers())  
        { 
            System.out.println("DeveloperId : " + Developer.getDeveloperId()  
            + ", Name : " + Developer.getName()); 
        }    

    } 






















 
}