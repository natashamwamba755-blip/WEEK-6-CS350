public class Product {
    String name;
    double price;
    int quantity;

    public void displayProduct() {
        System.out.println("Product: " + name);
        System.out.println("Price: K" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Stock Value: K" + totalValue());
        System.out.println();
    }

    public double totalValue() {
        return price * quantity;
    }
}
