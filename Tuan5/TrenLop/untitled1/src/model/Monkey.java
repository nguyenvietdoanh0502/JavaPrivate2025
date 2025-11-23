package model;

public class Monkey extends Animal {
    private String favoriteFruit;

    public Monkey(String name, int age, String favoriteFruit) {
        super(name, age);
        this.favoriteFruit = favoriteFruit;
    }

    public String getFavoriteFruit() {
        return favoriteFruit;
    }

    public void setFavoriteFruit(String favoriteFruit) {
        this.favoriteFruit = favoriteFruit;
    }

    @Override
    public void makeSound() {
        System.out.println("Chít chít!!!");
    }
}
