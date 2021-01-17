

public class MazdaFactory extends AbstractFactory {

    @Override
    Part getPart(String partType) {
       if(partType== "breaks"){
        return new MazdaBreaks();
       }
       if(partType == "engine"){
        return new MazdaEngine();

       }
       return null;
    }
  
    
}
