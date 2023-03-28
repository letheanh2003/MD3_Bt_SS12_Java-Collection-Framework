package BT1_ProductManager;

public class Product {
    private int id;
    private String namePr;
    private double price;
    private int quantity;

    public Product() {
    }

    public Product(int id, String namPr, double price, int quantity) {
        this.id = id;
        this.namePr = namPr;
        this.price = price;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamePr() {
        return namePr;
    }

    public void setNamPr(String namPr) {
        this.namePr = namPr;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", namPr='" + namePr + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
