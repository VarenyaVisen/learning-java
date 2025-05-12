package GETTER_SETTER;

public class Car {
    // Protect data from unauthorized access
    // These are private so we can't access them outside the class 
    // We use getter setter for that
    private String model;
    private String color;
    private int price;

    Car(String model, String color, int price){
        this.model = model;

        // we will use setter for these two variables because it can be changed (color and proce of the car)
        this.color = color;
        this.price = price;
    }
    // these are getter method used to read data must be same datatype
    String getModel(){
        return this.model;
    }
    String getColor(){
        return this.color;
    }

    // with getter methods we can add additional logic
    String getPrice(){
        return "$"+this.price;
    }

    // These are setter method used to change/modify the data (it can be void)

    void setModel(String model){
        this.model = model;
    }

    void setColor(String color){
        this.color = color;
    }

    // Adding some aditional logic to setter method
    void setPrice(int price){
        if (price < 0) {
            System.out.println("Price can't be less than zero");
        }
        else{
            this.price = price;
        }
    }
}
