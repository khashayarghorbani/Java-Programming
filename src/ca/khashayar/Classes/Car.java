package ca.khashayar.Classes;

public class Car {
    //default constructor
    public Car(){
        this("unknown" , "unknown" , "white" , false , 10.0d, 50.0d);

    }
    //overloaded constructor

    public Car(String make , String model){
        this(make , model, "yellow" , true , 25.0d , 10.0d);
    }

    public Car( String make, String model , String color , boolean automatic , double fuel , double accelerate ){
      this.make = make;
      this.model = model;
      this.color = color;
      this.automatic = automatic;
      this.fuel = fuel;
      if (accelerate >=0 && accelerate <=180) {
          this.accelerate = accelerate;
      }else { this.accelerate = 0;
      }
    }

    //access modifiers
    private String make;
    private String model;
    private String color;
    private boolean automatic;
    private double fuel;

    private double accelerate;





    //getter method
    public String getMake(){
        return make;
    }

    public String getColor(){
        return color;
    }
    public String getModel(){
        return model;
    }
    public boolean getAutomatic(){
        return automatic;
    }
    public double getFuel(){
        return fuel;
    }
    public double getAccelerate() { return accelerate; }
   //setter method

    public void setMake(String make){
        this.make = make.toUpperCase();
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setModel(String model){
        this.model = model.toLowerCase();
    }
    public void setAutomatic(boolean Automatic){
        this.automatic = Automatic;
    }
    public void setFuel(double fuel){
        this.fuel = fuel;
    }
    public void setAccelerate(double accelerate) {
        this.accelerate = accelerate;

    }


    public  void acceleration() {
        if (accelerate <= 170) {
            accelerate += 10;
        }
        System.out.println("your speed is : " + accelerate);

    }

    public String toString(){
        StringBuilder sb = new StringBuilder(" make : ");
        sb.append(this.getMake() );
        sb.append("\n Model : ");
        sb.append(this.getModel() );
        sb.append("\n Color : ");
        sb.append(this.getColor() );
        sb.append("\n Fuel : ");
        sb.append(this.getFuel() );
        sb.append("\n Automatic : ");
        sb.append(this.getAutomatic() );

        return sb.toString();
    }
}
