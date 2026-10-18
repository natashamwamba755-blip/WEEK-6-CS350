public class Main {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.name = "Natasha";
        student1.studentNumber = "2026001";
        student1.programme = "Computer Science";

        Student student2 = new Student();
        student2.name = "Mary";
        student2.studentNumber = "2026002";
        student2.programme = "Information Technology";

        System.out.println("STUDENT 1 DETAILS");
        student1.displayDetails();

        System.out.println("STUDENT 2 DETAILS");
        student2.displayDetails();

        student1.name = "Grace";

        System.out.println("AFTER CHANGING STUDENT 1 NAME");
        System.out.println("Student 1 name: " + student1.name);
        System.out.println("Student 2 name: " + student2.name);

        // EXERCISE 2: CAR

        Car car1 = new Car();
        car1.brand = "Toyota";
        car1.model = "Corolla";
        car1.speed = 40;

        Car car2 = new Car();
        car2.brand = "Honda";
        car2.model = "Civic";
        car2.speed = 60;

        car1.accelerate();
        car1.accelerate();

        car2.accelerate();
        car2.accelerate();
        car2.accelerate();

        System.out.println("CAR DETAILS");
        car1.displayInfo();
        car2.displayInfo();

        //EXERCISE 3:PROCUCT
    Product product1 = new Product();
product1.name = "Laptop";
product1.price = 8000.00;
product1.quantity = 5;

Product product2 = new Product();
product2.name = "Mouse";
product2.price = 150.00;
product2.quantity = 10;

Product product3 = new Product();
product3.name = "Keyboard";
product3.price = 350.00;
product3.quantity = 4;

System.out.println("PRODUCT DETAILS");
product1.displayProduct();
product2.displayProduct();
product3.displayProduct();

//EXERCISE 4:BOOKING
Booking booking1 = new Booking();
booking1.bookingId = "B001";
booking1.customerName = "Natasha";
booking1.destination = "Lusaka";

Booking booking2 = new Booking();
booking2.bookingId = "B002";
booking2.customerName = "Mary";
booking2.destination = "Kitwe";

System.out.println("BOOKING DETAILS");
booking1.displayBooking();
booking2.displayBooking();

booking1.updateDestination("Ndola");

System.out.println("AFTER UPDATING BOOKING 1");
booking1.displayBooking();
booking2.displayBooking();

    }
}