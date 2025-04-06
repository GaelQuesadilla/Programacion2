package Tarea12.Programa33;

public class Article {
    private double price;
    private int code, quantity;
    private String name;

    public Article(double price, int code, int quantity, String name) {
        this.price = price;
        this.code = code;
        this.quantity = quantity;
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("{Code: %s, Name: %s, Quantity: %d, Price: $%.2f}", code, name, quantity, price);
    }
}
