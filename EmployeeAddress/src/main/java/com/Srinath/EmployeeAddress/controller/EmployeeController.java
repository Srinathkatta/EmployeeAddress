package com.Srinath.EmployeeAddress.controller;




import com.Srinath.EmployeeAddress.model.Employee;
import com.Srinath.EmployeeAddress.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping("employee")
    public String addEmployee(@RequestBody Employee employee){
        return employeeService.addEmployee(employee);
    }
    @GetMapping("employees")
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }
    @GetMapping("employees/employee/{empId}")
    public Employee getEmployeeById(@PathVariable Long empId){
        return employeeService.getEmployeeById(empId);
    }
    @PutMapping("employees/employee/{empId}/{fN}/{lN}")
    public String updateEmployeeById(@PathVariable Long empId,@PathVariable String fN,@PathVariable String lN){
        return employeeService.updateEmployeeById(empId,fN,lN);
    }
    @DeleteMapping("employee/{empId}")
    public String deleteEmployeeById(@PathVariable Long empId){
        return employeeService.deleteEmployeeById(empId);
    }
}

