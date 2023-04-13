package employee_app.com.hr;

import employee_app.com.hr.personnel.Employee;

public class Department {
    public class Department {
        private String name;
        private String location;
        private Employee[] employees;
        private int currentIndex;

        public Department(String name, String location) {
            this.name = name;
            this.location = location;
            this.employees = new Employee[100];
            this.currentIndex = 0;
        }
}
