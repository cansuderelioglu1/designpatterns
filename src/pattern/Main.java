package pattern;

public class Main {
    public static void main(String[] args) {
        // Singleton örneğini al ve mesajı göster
        Singleton singletonInstance = Singleton.getInstance();
        singletonInstance.showMessage();

        // Builder kullanarak Product örneği oluştur
        Product product = new Product.Builder()
                .setName("Laptop")
                .setCategory("Electronics")
                .setPrice(1500.00)
                .build();

        // Ürün bilgilerini göster
        System.out.println("Product Name: " + product.getName());
        System.out.println("Product Category: " + product.getCategory());
        System.out.println("Product Price: " + product.getPrice());
    }
}
