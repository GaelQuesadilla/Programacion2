package Tarea02.Programa6;

public class Main {
    public static void main(String[] args) {
        Terminal terminal = new Terminal();
        Product product = new Product(null, 0);

        terminal.Print("Programa que registra un producto, ya sea un libro o un CD");
        terminal.Print("Equipo 7. Elaborado por:");
        terminal.Print("Frida Alejandra Mendoza Martinez");
        terminal.Print("Héctor Desiderio Erasto");
        terminal.Print("Gael González Méndez");

        terminal.Print("Selecciona 1 para libro\nSelecciona 2 para CD");
        int option = terminal.getInt("");

        String title = terminal.getString("Ingresa el título del producto");
        double price = terminal.getDouble("Ingresa el precio del producto");

        if (option == 1) {
            int pages = terminal.getInt("Ingresa el número de páginas");
            product = new Book(title, price, pages);
        } else if (option == 2) {
            int time = terminal.getInt("Ingresa la duración del CD (en segundos)");
            product = new CD(title, price, time);
        }

        terminal.Print(product.getInfo());

    }
}
