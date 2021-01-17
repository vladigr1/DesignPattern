package DAO;

import java.util.Collection;
import java.util.List;

public interface DeveloperDao  
{ 
    public Collection<Developer> getAllDevelopers(); 
    public Developer getDeveloper(int DeveloperId); 
    public void updateDeveloper(Developer developer); 
    public void deleteDeveloper(Developer developer); 
    public void addDeveloper(Developer developer);
} 