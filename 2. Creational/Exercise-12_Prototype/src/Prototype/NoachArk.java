package Prototype;

import java.util.ArrayList;
import java.util.Random;

public class NoachArk {

    public static void main(String[] args) throws CloneNotSupportedException {
        String[] genders = {"male", "female"};
        Random r = new Random();
        ArrayList<Animal> male = new ArrayList<>();
        ArrayList<Animal> female = new ArrayList<>();
        ArrayList<Animal> arc = new ArrayList<>();

        male.add(new Horse(genders[0], r.nextInt(700)+300, 50 + r.nextInt(30)) );
        male.add(new Bird(genders[0], r.nextInt(5)+10, 10 + r.nextInt(10)) );
        male.add(new Cat(genders[0], r.nextInt(10)+20, 5 + r.nextInt(2)) );
        male.add(new Giraffe(genders[0], r.nextInt(800)+300, 50 + r.nextInt(30)) );

        // Exercise 1: add female
        for (Animal animal : male){
            Animal a = (Animal)animal.clone();
            a.setGender(genders[1]);
            female.add(a);
        }
        System.out.println(female);
        
        //Exercise 2: add offspring 
        arc.addAll(male);
        arc.addAll(female);

        int TotalWeight=0;
        for(Animal animal : arc )
        {
            TotalWeight+= animal.totalKG();
        }
        System.out.println(TotalWeight);

        boolean enoughSpace=true;
        while(enoughSpace)
        {
            for (Animal animal : male){
                Animal a = (Animal)animal.clone();
                a.setGender(genders[1]);
                a.setKg(a.getKg()/2);      
                if(TotalWeight+a.getKg() >=50000) {
                    enoughSpace = false;
                    break;
                } // dont add to arc if to heavy
                TotalWeight+=a.getKg();
                arc.add(a);          
            }
        }
        System.out.println(TotalWeight);

    }
    
}
