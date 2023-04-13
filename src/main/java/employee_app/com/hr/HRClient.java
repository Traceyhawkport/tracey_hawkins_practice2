package employee_app.com.hr;

import employee_app.com.hr.personnel.Employee;

import java.time.LocalDate;

public class HRClient {
    public static void main(String[] args) {
        LocalDate hiredate1 = LocalDate.of(2020, 02, 03);
        LocalDate hiredate2 = LocalDate.of(2023, 03, 04);

        Employee emp1 = new Employee("Tracey", hiredate1);
        Employee emp2 = new Employee("Leo", hiredate2);


        Employee.SalariedEmployee emp3 = new Employee.SalariedEmployee
                ("Tiffany", 2021, 8, 15);
        Employee.SalariedEmployee2 emp4 = new Employee.SalariedEmployee
                ("Nelly",2023, 3, 06);// intellj debugged code




        System.out.println(emp1.getEmployeeInfo());
        System.out.println(emp2.getEmployeeInfo());


    }
}

