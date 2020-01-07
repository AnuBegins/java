import java.util.*;

class Vehicle {
    private int numberOfWheels;
    private String color;

    // ex. new Vehicle()
    public Vehicle() {
    }
    // ex. new Vehicle("someColor")
    public Vehicle(String color) {
        // setting the color attribute to the value from the color parameter
        this.color = color;
    }

    // ex. new Vehicle("someColor", 4)
    public Vehicle(String color, int numWheels) {
        this.color = color;
        this.numberOfWheels = numWheels;
    }

    // setter
    public void setNumberOfWheels(int number) {
        numberOfWheels = number;
    }

    // getter
    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    // setter
    public void setColor(String color) {
        this.color = color;        // 'this' keyword specifies that we are talking about the instance variable and not the parameter variable.
    }
    // getter
    public String getColor() {
        return color;
    }

}
