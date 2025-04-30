package Tarea15.Programa43;

public class Product {

    public Product(String name, int id, int amount) {
        this.name = name;
        this.id = id;
        this.amount = amount;
    }

    private String name;
    private int id, amount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "[name=" + name + ", id=" + id + ", amount=" + amount + "]";
    }

}
