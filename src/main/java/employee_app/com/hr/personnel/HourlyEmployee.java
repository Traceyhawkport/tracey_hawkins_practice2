package employee_app.com.hr.personnel;


import java.time.LocalDate;

public class HourlyEmployee extends Employee {
    private int hoursWorkedPerMonth;
    private double hourlyRate;

    private LocalDate hireDate;


    public HourlyEmployee(String name, LocalDate hireDate, int hoursWorkedPerMonth, double hourlyRate) {
        super(name, hireDate);
        this.hourlyRate = hourlyRate;
        this.hoursWorkedPerMonth = hoursWorkedPerMonth;
    }


    @Override
    public double computeMonthlyCompensation() {
        return hourlyRate * hoursWorkedPerMonth;
    }


    @Override
    public double computeMonthlyTaxToPay() {
        return 0;
    }
}





