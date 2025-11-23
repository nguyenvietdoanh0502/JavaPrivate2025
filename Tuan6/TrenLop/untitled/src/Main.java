import constant.Constant;
import model.Animal;
import model.Bird;
import model.Cat;
import model.Dog;
import service.IAnimalService;
import service.impl.IAnimalServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Animal> animals = new ArrayList<>();
        Animal cat = new Cat("Tam the",10);
        Animal dog = new Dog("Cau vang",12);
        Animal bird = new Bird("Alivia",1000);
        animals.add(cat);
        animals.add(dog);
        animals.add(bird);
        IAnimalService animalService = new IAnimalServiceImpl() ;

        System.out.println(Constant.MenuMessage.MENU);
        System.out.println(Constant.MenuMessage.CHOICE);
        int n = sc.nextInt();
        switch (n){
            case 1:
                List<Animal> animalsSwimmable = animalService.animalsSwimmable(animals);
                if(animalsSwimmable.isEmpty()){
                    System.out.println(Constant.SuccessMessage.NO_ANIMAL_SWIMMABLE);
                }
                else{
                    for(Animal x: animalsSwimmable){
                        System.out.println(x);
                    }
                }
                break;
            case 2:
                List<Animal> animalsFlyable = animalService.animalsFlyable(animals);
                if(animalsFlyable.isEmpty()){
                    System.out.println(Constant.SuccessMessage.NO_ANIMAL_FLYABLE);
                }
                else{
                    for(Animal x : animalsFlyable){
                        System.out.println(x);
                    }
                }
                break;
            case 3:
                if(animalService.deleteAnimalSwimmable(animals)){
                    System.out.println(Constant.SuccessMessage.DELETE_SWIMMABLE_SUCCESSFUL);
                }
                else{
                    System.out.println(Constant.ErrorMessage.CAN_NOT_DELETE);
                }
                break;
            case 4:
                if(animalService.deleteAnimalSwimmableAndFlyable(animals)){
                    System.out.println(Constant.SuccessMessage.DELETE_SWIMMABLE_AND_FLYABLE_SUCCESSFUL);
                }
                else{
                    System.out.println(Constant.ErrorMessage.CAN_NOT_DELETE);
                }
                break;
            default:
                System.out.println(Constant.ErrorMessage.CHOICE_INVALID);
        }
    }
}