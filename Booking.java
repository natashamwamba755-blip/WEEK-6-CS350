public class Booking {
    String bookingId;
    String customerName;
    String destination;

    public void displayBooking() {
        System.out.println("Booking ID: " + bookingId);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Destination: " + destination);
        System.out.println();
    }

    public void updateDestination(String newDestination) {
        destination = newDestination;
    }
}
