package service;

import model.Animal;
import validation.AnimalValidator;

import java.util.ArrayList;

public class ZooService {
    private ArrayList<Animal> animals = new ArrayList<>();
    private AnimalValidator animalValidator = new AnimalValidator();
    public void addAnimal(Animal animal){
        if(animalValidator.isValid(animal)){
            animals.add(animal);
            System.out.println("Add successful");
            return;
        }
        return;
    }
    public showAllAnimals(){

    }
}
