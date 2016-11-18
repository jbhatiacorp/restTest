package rest;

import service.EmployeeService;
import model.Employee;

@RestController
public class EmployeeResource {

    @Autowired
    EmployeeService employeeService;

    @RequestMapping("/search")
    public Employee getEmployee(@RequestParam(value="firstName") String firstName) {
        return employeeService.getEmployeeDetails(firstName);
    }
}