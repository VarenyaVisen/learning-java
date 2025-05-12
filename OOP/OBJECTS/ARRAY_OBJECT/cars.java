package OBJECTS.ARRAY_OBJECT;

public class cars {
    String model;
    String color;

    cars(String model,String color){
        this.model = model;
        this.color = color;
    }

    void drive(){
        System.out.println("You drive the "+this.color+" "+this.model);
    }

}
