package Tarea02.Programa6;

public class CD extends Product {

    private double time;

    public CD(String title, double price, double time) {
        super(title, price);
        this.time = time;
    }

    public String getInfo() {
        String info = super.getInfo() + "\nTiempo(s): %s";

        return String.format(info, this.time);
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

}
