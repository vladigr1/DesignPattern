package DAO;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

public class DeveloperDaoImplMap implements DeveloperDao {

    private HashMap<Integer, Developer> developers;

    public DeveloperDaoImplMap() {
        developers = new HashMap<Integer, Developer>();
    }

    @Override
    public Collection<Developer> getAllDevelopers() {
		return developers.values();
	}

	@Override
	public Developer getDeveloper(int DeveloperId) {
		return developers.get(DeveloperId);
	}

	@Override
	public void updateDeveloper(Developer developer) {
		developers.replace(developer.getDeveloperId(), developer);
	}

	@Override
	public void deleteDeveloper(Developer developer) {
		developers.remove(developer.getDeveloperId(),developer);
	}

	@Override
	public void addDeveloper(Developer developer) {
		developers.put(developer.getDeveloperId(),developer);
		
	}
    
}
