package FinalTest.model;

public class SmartPhone {
    private int ID;
    private String name;
    private double price;
    private int quantity;
    private String brand;
    public SmartPhone(int ID, String name, double price, int quantity, String brand) {
        this.ID = ID;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.brand = brand;

    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", brand='" + brand + '\''
                ;
    }
}
