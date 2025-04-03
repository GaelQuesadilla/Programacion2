package Tarea02.Programa7;

public class Worker extends Employee {

    private int hoursWorked;
    private double hourlyRate;

    public Worker(String rFC, String name, int hoursWorked, double hourlyRate) {
        super(rFC, name, 0d);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public double calculateBaseSalary() {
        this.baseSalary = hoursWorked * hourlyRate;
        return this.baseSalary;
    }

    public String getInfo() {
        String info = super.getInfo() + "Horas trabajadas: %s\nSalario por hora:%s\n";
        return String.format(info, this.hoursWorked, this.hourlyRate);
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

}
