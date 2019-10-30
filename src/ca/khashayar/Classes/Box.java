package ca.khashayar.Classes;

public class Box extends Square {
    private String material;

    public Box(){
        this("cardboard" , 0);
    }
    public Box(String material , double lenght){
        super("box shape" , lenght);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double area(){
        return super.area() * 6;
    }
}
