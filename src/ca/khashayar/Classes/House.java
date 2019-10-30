package ca.khashayar.Classes;



public class House {
    public House ( int windows , int doors){
        this(windows , doors, 4, true, 3,"burnaby",1000.0d, 400_000.0d,true);

    }
    public House(){
        this(0,0,0,false,0,"unknown",0.0d,0.0d,false);
    }
    public House(int windows, int doors, int bathroom, boolean townhouse, int bedroom, String location, double rentPrice, double sellPrice, boolean garage) {
        this.windows = windows;
        this.doors = doors;
        this.bathroom = bathroom;
        this.townhouse = townhouse;
        this.bedroom = bedroom;
        this.location = location;
        this.rentPrice = rentPrice;
        this.sellPrice = sellPrice;
        this.garage = garage;
    }


    private int windows;
    private int doors;
    private int bathroom;
    private boolean townhouse;
    private int bedroom;
    private String location;
    private double rentPrice;
    private double sellPrice;
    private boolean garage;

    public int getWindows() {
        return windows;
    }

    public int getDoors() {
        return doors;
    }

    public int getBathroom() {
        return bathroom;
    }

    public boolean isTownhouse() {
        return townhouse;
    }

    public int getBedroom() {
        return bedroom;
    }

    public String getLocation() {
        return location;
    }

    public double getRentPrice() {
        return rentPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public boolean isGarage() {
        return garage;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setBathroom(int bathroom) {
        this.bathroom = bathroom;
    }

    public void setTownhouse(boolean townhouse) {
        this.townhouse = townhouse;
    }

    public void setBedroom(int bedroom) {
        this.bedroom = bedroom;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setRentPrice(double rentPrice) {
        this.rentPrice = rentPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public void setGarage(boolean garage) {
        this.garage = garage;
    }

    @Override
    public String toString() {
        return "House{" +
                "windows=" + windows +
                ", doors=" + doors +
                ", bathroom=" + bathroom +
                ", townhouse=" + townhouse +
                ", bedroom=" + bedroom +
                ", location='" + location + '\'' +
                ", rentPrice=" + rentPrice +
                ", sellPrice=" + sellPrice +
                ", garage=" + garage +
                '}';
    }
}
