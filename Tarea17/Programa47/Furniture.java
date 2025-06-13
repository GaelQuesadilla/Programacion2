package Tarea17.Programa47;

public class Furniture {
    public String name;
    public double price;
    public int ID;

    public Furniture(String name, double price, int iD) {
        this.name = name;
        this.price = price;
        ID = iD;
    }

    @Override
    public String toString() {
        return "Furniture [name=" + name + ", price=" + price + ", ID=" + ID + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Furniture other = (Furniture) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
            return false;
        if (ID != other.ID)
            return false;
        return true;
    }

}
