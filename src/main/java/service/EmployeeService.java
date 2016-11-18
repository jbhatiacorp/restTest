package service;


import model.Employee;


public class EmployeeService {

    public Employee getEmployeeDetails(String firstName) {
        Employee employee = new Employee();
        employee.setFirstName(firstName);
        employee.setLastName("UNKNOWN");

        return employee;

    }
}