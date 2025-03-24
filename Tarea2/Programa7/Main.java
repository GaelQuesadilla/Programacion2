package Tarea2.Programa7;

public class Main {
    public static void main(String[] args) {
        Terminal terminal = new Terminal();
        Employee employee = new Employee(null, null, 0);

        terminal.Print("Programa que registra los datos de un empleado, dependiendo de si es un obrero o un jefe");
        terminal.Print("Equipo 7. Elaborado por:");
        terminal.Print("Frida Alejandra Mendoza Martinez");
        terminal.Print("Gael González Méndez");
        terminal.Print("Héctor Desiderio Erasto");

        int option = terminal.getInt("Escribe 1 para registrar a un obrero\nEscribe 2 para registrar a un jefe");

        String name = terminal.getString("Ingresa el nombre");
        String RFC = terminal.getString("Escribe el RFC");
        if (option == 1) {
            int hoursWorked = terminal.getInt("Ingresa el número de horas trabajadas");
            double hourlyRate = terminal.getDouble("Ingresa el salario por hora");

            employee = new Worker(RFC, name, hoursWorked, hourlyRate);
        } else if (option == 2) {

            double baseSalary = terminal.getDouble("Escribe el salario base");
            String department = terminal.getString("Ingresa el departamento");
            double compensationPercentage = terminal.getDouble("Ingresa el porcentaje de compensación");
            employee = new Boss(RFC, name, baseSalary, department, compensationPercentage);

        }
        terminal.Print(employee.getInfo());
        terminal.Print("Salario: $" + employee.calculateBaseSalary());
    }
}
