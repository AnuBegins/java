import java.util.*;

class VehicleTest {
    public static void main(String[] args) {
        Vehicle bike = new Vehicle();
        Vehicle car = new Vehicle();
        Vehicle car2 = new Vehicle("red", 4);

        bike.setNumberOfWheels(2);
        bike.setColor("red");
        int bikeWheels = bike.getNumberOfWheels();
        String bikeColor = bike.getColor();

        car.setNumberOfWheels(4);
        car.setColor("green");
        int carWheels = car.getNumberOfWheels();
        String carColor = car.getColor();

        System.out.println("Bike object - Wheels: " + bikeWheels + ", Color: " + bikeColor);
        System.out.println("Car object - Wheels: " + carWheels + ", Color: " + carColor);
        System.out.println("Car2 object - Wheels: " + car2.getNumberOfWheels() + ", Color: " + car2.getColor());

    }
}
