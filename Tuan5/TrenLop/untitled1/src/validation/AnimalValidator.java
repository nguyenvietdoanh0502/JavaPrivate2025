package validation;

import model.Animal;

public class AnimalValidator {
    public boolean isValid(Animal animal){
        if(animal.getName().isEmpty()){
            System.out.println("Name invalid");
            return false;
        }
        if(animal.getAge()<=0){
            System.out.println("Age invalid");
            return false;
        }
        return true;
    }
}
