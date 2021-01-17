package DAO;
class Developer 
{ 
    private String name; 
    private int DeveloperId; 
  
    Developer(String name, int DeveloperId) 
    { 
        this.name = name; 
        this.DeveloperId = DeveloperId; 
    } 
  
    public String getName()  
    { 
    	return name; 
    } 
  
    public void setName(String name)  
    { 
        this.name = name; 
    } 
  
    public int getDeveloperId()  
    { 
    	return DeveloperId; 
    } 
  
    public void setDeveloperId(int DeveloperId)  
    { 
    	this.DeveloperId = DeveloperId; 
    }

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Developer other = (Developer) obj;
		if (DeveloperId != other.DeveloperId)
			return false;
		return true;
	}  
    
} 