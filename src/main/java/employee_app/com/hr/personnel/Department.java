package employee_app.com.hr.personnel;
import java.util.List;
import java.util.ArrayList;
import employee_app.com.hr.personnel.Employee;

public class Department {

        private String name;
        private String location;

        private List<Employee> employees = new ArrayList<>();
        //private Employee[] employees = new Employee[5]; array
        private int  nextAvailableSlotOfEmployeeArray = 0;;

        public Department(String name, String location) {
            this.name = name;
            this.location = location;

        }




    public void addEmployee(Employee employee) {
        employees.add(employee);
        //employees[nextAvailableSlotOfEmployeeArray++] = employee; array
    }

    public int letEmployeesWorkAndGetNumberOfEmployeesWhoWorked() {
        int numberOfEmployeesWhoWorked = 0;

        for (Employee employee : employees) {
            if (employee.work().contains("worked")) {
                numberOfEmployeesWhoWorked++;


        //for (int i = 0; i < nextAvailableSlotOfEmployeeArray; i++) {
            //if (employees[i].work().contains("worked")) {
               // numberOfEmployeesWhoWorked++;
            }
        }

        return numberOfEmployeesWhoWorked;
    }

    public double computeDepartmentTotalMonthlyCompensation() {
        double monthlyTotalCompensation = 0.0;


        for (Employee employee : employees) {
            double monthlyCompensation = employee.computeMonthlyCompensation();
            monthlyTotalCompensation += monthlyCompensation;
        }

        //for (int i = 0; i < nextAvailableSlotOfEmployeeArray; i++) {
            //double monthlyCompensation
                   // = employees[i].computeMonthlyCompensation();
           // monthlyTotalCompensation += monthlyCompensation;


        return monthlyTotalCompensation;
    }


}


