package Tarea02.Programa6;

public class Book extends Product {
    private int pages;

    public Book(String title, double price, int pages) {
        super(title, price);
        this.pages = pages;
    }

    public String getInfo() {
        String info = super.getInfo() + "\nPáginas: %s";

        return String.format(info, this.pages);
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

}
