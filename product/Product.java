public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        setName(name);
        setPrice(price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        this.price = price;
    }

    public void applyDiscount(double percentage) {
        if (percentage <= 0 || percentage > 100) {
            throw new IllegalArgumentException("Discount must be between 0 and 100");
        }
        double discountAmount = price * (percentage / 100);
        price -= discountAmount;
    }
}
