package service.impl;

import model.Animal;
import service.IAnimalService;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IAnimalServiceImpl implements IAnimalService {
    @Override
    public List<Animal> animalsSwimmable(List<Animal> animals) {
        List<Animal> res = new ArrayList<>();
        for(Animal x : animals){
            if(x.swim()){
                res.add(x);
            }
        }
        return res;
    }

    @Override
    public List<Animal> animalsFlyable(List<Animal> animals) {
        List<Animal> res = new ArrayList<>();
        for(Animal x: animals){
            if(x.fly()){
                res.add(x);
            }
        }
        return res;
    }

    @Override
    public boolean deleteAnimalSwimmable(List<Animal> animals) {
        Iterator<Animal> iterator = animals.iterator();
        int check = 0;
        while(iterator.hasNext()){
            Animal animal = iterator.next();
            if(animal.swim()){
                check+=1;
                iterator.remove();
            }
        }
        if(check==0){
            return false;
        }
        return true;
    }

    @Override
    public boolean deleteAnimalSwimmableAndFlyable(List<Animal> animals) {
        Iterator<Animal> iterator = animals.iterator();
        int check = 0;
        while(iterator.hasNext()){
            Animal animal = iterator.next();
            if(animal.fly() && animal.swim()){
                check+=1;
                iterator.remove();
            }
        }
        if(check==0){
            return false;
        }
        return true;
    }
}
