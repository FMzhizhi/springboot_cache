package com.zjj.cache.controller;

import com.zjj.cache.bean.Employee;
import com.zjj.cache.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.web.bind.annotation.*;

/**
 * @author zhijiaju
 * @version 1.0
 * @date 2020/7/16 23:37
 */
@RestController
@RequestMapping("/emp")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable("id") Integer id){
        Employee employee = employeeService.getEmp(id);
        return employee;
    }

    @GetMapping("/update")
    public Employee updateEmployee(Employee employee){

        return  employeeService.update(employee);
    }

    @GetMapping("/del")
    public @ResponseBody String deleteEmp(Integer id){
        employeeService.deleteEmp(id);
        return "success";

    }

    @GetMapping("/lastName/{lastName}")
    public Employee getEmpByLastName(@PathVariable("lastName") String lastName) {
        return employeeService.getEmpByLastName(lastName);
    }

}
