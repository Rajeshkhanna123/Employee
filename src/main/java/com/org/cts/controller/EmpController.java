package com.org.cts.controller;

import com.org.cts.model.Employee;
import com.org.cts.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")                                                                         //to map web request onto handler
public class EmpController {

    @Autowired                                                                                  //automatic dependency injection
    EmpService empService;

    @PostMapping("/create")
    public void createEmployee(@RequestBody Employee employee) {
        empService.createEmployee(employee);

    }
    @PutMapping("/updateEmployee")
    public void updateEmployee(@RequestBody Employee employee ) {
        empService.updateEmployee(employee);

    }

    @GetMapping("/findAllEmployee")
    public List<Employee> getAllEmployee(){
        List<Employee> emp=empService.getAllEmployee();
        return emp;
    }

    @GetMapping("/Employee/{id}")
    public Employee findEmployeeById(@PathVariable int id){
        Employee em = empService.findEmployeeById(id);
        return em;

    }
    @DeleteMapping("/deleteByAddress/{address}")
    public String deleteByAddress(@PathVariable String address){
        String ss=empService.deleteByAddress(address);
        return ss;
    }
    @DeleteMapping("/deleteByPno/{pno}")
    public Double deleteByPno(@PathVariable Double pno){
        Double dd = empService.deleteByPno(pno);
        return dd;
    }

    @DeleteMapping("deleteById/{id}")
    public Integer deleteById(@PathVariable int id){
        Integer ii = empService.deleteById(id);
        return ii;
    }


}
