public class ProductDemo {
    public static void main(String[] args) {
        Product product = new Product("Phone", 20000);
        System.out.println("Product: " + product.getName());
        System.out.println("Price: " + product.getPrice());

        product.applyDiscount(10);
        System.out.println("Price after discount: " + product.getPrice());
    }
}
