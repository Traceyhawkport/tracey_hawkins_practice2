package employee_app.com.hr.personnel;

import java.time.LocalDate;

public class SalariedEmployee extends Employee{
    private double monthlySalary;

    public SalariedEmployee(String name, LocalDate hireDate, double monthlySalary){
        super.setHireDate(hireDate);

        super.setName(name);
        this.monthlySalary = monthlySalary; //with () is calling a method without () calling a variable
    }


    @Override
    public double computeMonthlyCompensation(){
        return monthlySalary;
    }


    }

