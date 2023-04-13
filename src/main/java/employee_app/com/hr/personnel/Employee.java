package employee_app.com.hr.personnel;

import java.time.LocalDate;
import java.time.Period;

public class Employee {

    private String name;
    private LocalDate hireDate;

    public Employee(String name, LocalDate hireDate) {
        this.name = name;
        this.hireDate = hireDate;
    }

    public Employee() {

    }

    public String getEmployeeInfo() {
        return name + hireDate;
    }


    public String work() {
        return name + "worked.";
    }


    public int computeNumberOfYearsWorkedSinceHired() {
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between (hireDate, currentDate);
        return period.getYears();
        //period class java time package


    }
    public static class SalariedEmployee extends Employee {
        private double monthlySalary;

        public SalariedEmployee(String name, LocalDate hireDate) {
            super(name, hireDate);
        }

        public SalariedEmployee(String tiffany, int i, int i1, int i2) {
            super(); // intellj debugged code

        }


    }

    // HourlyEmployee subclass
    public class HourlyEmployee extends Employee {
        private int hoursWorkedPerMonth;
        private double hourlyRate;

        public HourlyEmployee(String name, LocalDate hireDate) {
            super(name, hireDate);
        }

    }





}
