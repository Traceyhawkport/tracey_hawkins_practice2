package employee_app.com.hr.personnel;
import java.time.LocalDate;
import java.util.ArrayList;



public class HRClient {
    public static void main(String[] args) {


        SalariedEmployee salariedEmployee1 = new SalariedEmployee("Mark", LocalDate.of(2023, 8, 31), 8000.00);
        SalariedEmployee salariedEmployee2 = new SalariedEmployee("Mariah", LocalDate.of(2017, 5, 10), 7000.00);


        Department department = new Department("Communications", "DC");
        department.addEmployee(salariedEmployee1);
        department.addEmployee(salariedEmployee2);

        HourlyEmployee hourlyEmployee1 = new HourlyEmployee("Max",
                LocalDate.of(2016, 9, 14),
                40,
                75.00);
        department.addEmployee(hourlyEmployee1);

        int numberOfEmployeesWhoWorked
                = department.letEmployeesWorkAndGetNumberOfEmployeesWhoWorked();
        System.out.println("Number of employees who worked: " + numberOfEmployeesWhoWorked);

        double departmentTotalMonthlyCompensation
                = department.computeDepartmentTotalMonthlyCompensation();
        System.out.println("Total Department Monthly Compensation: " + departmentTotalMonthlyCompensation);


    }
}

