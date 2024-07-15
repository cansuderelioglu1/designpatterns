package pattern;

public class Product {
    // Ürün özellikleri (fields)
    private String name;
    private String category;
    private double price;

    // Özel yapılandırıcı (private constructor)
    private Product(Builder builder) {
        this.name = builder.name;
        this.category = builder.category;
        this.price = builder.price;
    }

    // Getter metodları
    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    // Builder sınıfı
    public static class Builder {
        private String name;
        private String category;
        private double price;

        // Setter metodları
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setCategory(String category) {
            this.category = category;
            return this;
        }

        public Builder setPrice(double price) {
            this.price = price;
            return this;
        }

        // build() metodu, yeni bir Product nesnesi döner
        public Product build() {
            return new Product(this);
        }
    }
}
