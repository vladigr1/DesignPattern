package DAO;
import java.util.ArrayList;
import java.util.List;

class DeveloperDaoImpl implements DeveloperDao  
{ 
    List<Developer> Developers; 
  
    public DeveloperDaoImpl() 
    { 
    	Developers = new ArrayList<Developer>();
    } 
    
    @Override
    public void deleteDeveloper(Developer developer)  
    { 
       Developers.remove(developer);
    } 
    
    @Override
    public List<Developer> getAllDevelopers()  
    { 
        return Developers; 
    } 
  
    @Override
    public Developer getDeveloper(int DeveloperId)  
    { 
    	return Developers.get(DeveloperId);
    } 
  
    @Override
    public void updateDeveloper(Developer developer)  
    { 
        int index = Developers.indexOf(developer);
        Developers.set(index, developer);
    
    }

	@Override
	public void addDeveloper(Developer developer) 
	{
		Developers.add(developer);
	} 
    
    
} 