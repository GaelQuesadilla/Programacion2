package Tarea02.Programa6;

public class Product {

    protected String title;
    protected double price;

    public Product(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public String getInfo() {
        String info = "Precio: $ %s\nTítulo: %s";
        return String.format(info, this.price, this.title);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
