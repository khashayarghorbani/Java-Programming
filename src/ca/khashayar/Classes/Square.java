package ca.khashayar.Classes;

public class Square extends Shape {

    private double lenght;
public Square(){
    super("square shape");
}
    public Square(String name, double length) {
        super(name);
        this.lenght = length;
    }

    public Square(double lenght) {
        this.lenght = lenght;
    }

    @Override
    public double area() {
        return lenght*lenght;
    }

    @Override
    public double perimeter() {
        return 4*lenght;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }
}
