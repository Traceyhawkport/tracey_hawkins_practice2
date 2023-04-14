package employee_app.com.hr.personnel;

import java.time.LocalDate;
import java.time.Period;

public abstract class Employee {

    private String name;
    private LocalDate hireDate;

    public Employee(String name, LocalDate hireDate) {
        this.name = name;
        this.hireDate = hireDate;
    }

    public Employee() {  //remember default constructor

    }




    public void setName(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }
    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public String getEmployeeInfo() {
        return name + hireDate;
    }


    public String work() {
        return name + "worked.";
    }


    public abstract double computeMonthlyCompensation ();
    {

        //period class java time package


    }


    }















