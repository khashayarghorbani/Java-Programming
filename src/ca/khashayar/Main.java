package ca.khashayar;

import ca.khashayar.Classes.*;

 import java.util.*;

public class Main {

    public static void main(String[] args) {
            Exceptions.exception();

//        Account acc = new Account("abas", 100 , 200);
//        System.out.println(acc.toString());
//        acc.transferMoney(Account.type.checking , Account.type.saving , 50);
//        System.out.println(acc.toString());

//        List<Toy> lotsOfToys = new ArrayList<>();
//        lotsOfToys.add(new Toy("ball" , "white"));
//        lotsOfToys.add(new Toy("stick" , "orange"));
//        lotsOfToys.add(new Toy("bone" , "grey"));
//        lotsOfToys.add(new Toy("teddy" , "brown"));
//        lotsOfToys.add(new Toy("GIJO" , "green"));
//        Dog fluffy = new Dog(lotsOfToys);
//        for( Toy i : fluffy.getToys()){
//            System.out.println(i.getName() + " - " + i.getColor());
//        }
//
//
//
//
//        Pet[] pets = new Pet[2];
//        pets[0] = new Cat();
//        pets[1] = new Dog();
//        ((Cat) pets[0]).move();
//        ((Dog) pets[1]).move();
//        for (Object i : pets) {
//            if (i instanceof Cat) {
//                ((Cat) i).move();
//            }
//            if (i instanceof Dog) {
//                ((Dog) i).move();
//            }
//
//        }


//    List<Integer> arrayList = new ArrayList<>(); //Flexible size
//    List<Integer> linkedlist = new LinkedList<>();//Flexible size
//        arrayList.add(101);
//        arrayList.add(102);
//        arrayList.add(100);
//        arrayList.add(104);
//        arrayList.add(105);
//        arrayList.set(2,103);
//        for ( Integer i : arrayList){
//            System.out.println(i);
//        }
//        System.out.println("get arrayList.get(0) : " + arrayList.get(0));
//        System.out.println(arrayList.contains(5));//false
//        System.out.println(arrayList.contains(105));//true
//
//
//
//        //linked list
//
//
//        linkedlist.add(101);
//        linkedlist.add(102);
//        linkedlist.add(100);
//        linkedlist.add(104);
//        linkedlist.add(105);
//        linkedlist.set(2,103);
//        for ( Integer i : linkedlist){
//            System.out.println(i);
//        }
//        System.out.println("________________");
//        System.out.println("this is linked list");
//        System.out.println("get linkedList.get(0) : " + linkedlist.get(0));
//        System.out.println(linkedlist.contains(5));//false
//        System.out.println(linkedlist.contains(105));//true
//
//
//        List<Shape> shapeList = new LinkedList<>();
//        shapeList.add(new Box());
//        shapeList.add(new Square());
//        shapeList.add(new Rectangle());
//        shapeList.add(new Circle());
//        for (Shape s : shapeList){
//            System.out.println(s.getName());
//        }


//        Rectangle rec = new Rectangle(50d , 100d);
//
//        rec.setName("this is my rectangle");
//        System.out.println(rec.getName());
//        Box aBox = new Box("metal" , 9d);
//        System.out.println("this is my Box : " + aBox.area() );
//        Shape onj1 = new Circle(2.5);
//        Shape onj2 = new Rectangle(5.4 , 9.3);
//        Shape onj3 = new Square(4.5);
//        Shape[] shapeArr = new Shape[]{
//                new Circle(2.5),
//                new Rectangle(5.4 , 9.3),
//                new Square(4.5)
//        };
//
//        ((Circle)shapeArr[0]).setRadius(5.5);
//        int i = 10;
//        while (i == 10) {
//            Scanner sn = new Scanner(System.in);
//            System.out.println("Provide a index 0 , 1 or 2 : ");
//            int indexNum = sn.nextInt();
//            if (indexNum==10) break;
//            if (indexNum == 0) {
//                System.out.println("radius?");
//                double r = sn.nextDouble();
//                ((Circle) shapeArr[indexNum]).setRadius(r);
//                System.out.println("the area of Circle is : " + ((Circle) shapeArr[indexNum]).area());
//
//            } else if (indexNum == 1) {
//                System.out.println("height?");
//                double h = sn.nextDouble();
//                System.out.println("width?");
//                double w = sn.nextDouble();
//                ((Rectangle) shapeArr[1]).setHeight(h);
//                ((Rectangle) shapeArr[1]).setWidth(w);
//                System.out.println("the area of Rectangle is : " + ((Rectangle) shapeArr[indexNum]).area());
//            } else if (indexNum == 2) {
//                System.out.println("length?");
//                double l = sn.nextDouble();
//                ((Square) shapeArr[2]).setLenght(l);
//                System.out.println("the area of Square is : " + ((Square) shapeArr[indexNum]).area());
//            }
//
//        }

        // RegularExpressions.RE();


//        Car BMW = new Car( "BMW" , "X6" , "Blue" , true , 50.0d,2500.0d);
//        System.out.println(BMW.toString() );
//        for (int i = 0; i < 10 ; i += 1) {
//
//            BMW.acceleration();
//        }
//        System.out.println("________________");
//        Car car2 = new Car("honda","civic" , "red" , false , 40.0d, 0.0d);
//        System.out.println(car2.toString() );
//        System.out.println("________________");
//        Car car3 = new Car("pontiac","vibe","black", true , 55.0d,50.0d);
//        System.out.println(car3.toString() );
//        System.out.println("________________");
//        Car car4 = new Car(); //default
//        car4.setMake("hyundai");
//        car4.setModel("SaNtAfE");
//        System.out.println(car4.toString() );
//        System.out.println("________________");
//
//        Car car5 = new Car("lamborghini", "gallardo");
//        System.out.println(car5.toString());
//        System.out.println("________________");
//        House house1 = new House();
//        house1.setBathroom(2);
//        house1.setGarage(true);
//        System.out.println(house1.toString() );


    }
}



