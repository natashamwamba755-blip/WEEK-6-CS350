public class Car {
    String brand;
    String model;
    int speed;

    public void accelerate() {
        speed = speed + 10;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println();
    }
}
