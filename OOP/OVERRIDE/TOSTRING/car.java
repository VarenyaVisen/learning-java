package OVERRIDE.TOSTRING;

public class car {
    String model;
    String make;
    int year;
    String color;

    car(String model,String make,String color, int year){
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    @Override
    public String toString(){
        return this.color+" "+ this.year+" "+this.model+" "+this.make;
    }
}
