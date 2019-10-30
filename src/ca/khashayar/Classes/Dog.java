package ca.khashayar.Classes;

import java.util.ArrayList;
import java.util.List;

public class Dog implements Animal , Pet {

    private List<Toy> toys;
    public Dog(){
        toys = new ArrayList<>();
        toys.add(new Toy ("ball" , "blue and yellow"));
    }
    public Dog(List<Toy> toys){
        this.toys = toys;
    }

    public List<Toy> getToys() {
        return toys;
    }

    public void setToys(List<Toy> toys) {
        this.toys = toys;
    }

    @Override
    public void makeSound() {
        System.out.println("Woof Woof");
    }

    @Override
    public void eat() {
        System.out.println("I am eating some bones");
    }

    @Override
    public void move() {
        System.out.println("I move like a dog, I usually run.");
    }

    @Override
    public void wash() {
        System.out.println("wash the dog every week");
    }

    @Override
    public void feed() {
        System.out.println("put some food to dogs cup.");
    }

    @Override
    public void cuddle() {
        System.out.println("I am cuddling a dog");

    }
}
