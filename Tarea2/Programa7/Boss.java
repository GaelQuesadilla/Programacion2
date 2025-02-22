package Tarea2.Programa7;

public class Boss extends Employee {
    private String department;
    private double compensationPercentage;

    public Boss(String rFC, String name, double baseSalary, String department, double compensationPercentage) {
        super(rFC, name, baseSalary);
        this.department = department;
        this.compensationPercentage = compensationPercentage;
    }

    public double calculateBaseSalary() {
        double compensation = this.baseSalary * (1 + this.compensationPercentage / 100);
        return super.calculateBaseSalary() + compensation;
    }

    public String getInfo() {
        String info = super.getInfo() + "Departamento: %s\nPorcentaje de compensación:%s";
        return String.format(info, this.department, this.compensationPercentage);

    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getCompensationPercentage() {
        return compensationPercentage;
    }

    public void setCompensationPercentage(double compensationPercentage) {
        this.compensationPercentage = compensationPercentage;
    }

}
