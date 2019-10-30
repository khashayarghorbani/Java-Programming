package ca.khashayar.Classes;

public class Cat implements Pet , Animal {
   private Toy toy;
    public Cat(){
    toy = new Toy("fish toy" , "black");
    }
    public Cat(Toy toy){
        this.toy = toy;
    }



    public Toy getToy() {
        return toy;
    }

    public void setToy(Toy toy) {
        this.toy = toy;
    }

    @Override
    public void makeSound() {
        System.out.println("meow");
    }

    @Override
    public void eat() {
        System.out.println("yummy");

    }

    @Override
    public void move() {
        System.out.println("I dont move");

    }

    @Override
    public void wash() {
        System.out.println(" I lick myself");

    }

    @Override
    public void feed() {
        System.out.println("I am feeding me cat");

    }

    @Override
    public void cuddle() {
        System.out.println("I like the way you cuddle");
    }
}
