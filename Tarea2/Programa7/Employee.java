package Tarea2.Programa7;

public class Employee {
    protected String RFC, name;
    protected double baseSalary;

    public Employee(String rFC, String name, double baseSalary) {
        RFC = rFC;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public double calculateBaseSalary() {
        return this.baseSalary * 15;
    }

    public String getInfo() {
        String info = "Nombre: %s\nRFC: %s\nSalario base: $%s\n";
        return String.format(info, this.name, this.RFC, this.baseSalary);
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String rFC) {
        RFC = rFC;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

}
