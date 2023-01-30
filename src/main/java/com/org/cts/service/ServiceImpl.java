package com.org.cts.service;

import com.org.cts.model.Employee;
import com.org.cts.repository.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class ServiceImpl implements EmpService{
    @Autowired
    EmpRepository empRepository;


    @Override
    public void createEmployee(Employee employee) {
        empRepository.save(employee);

    }

    @Override
    public void updateEmployee(Employee employee) {
        empRepository.save(employee);


    }

    @Override
    public List<Employee> getAllEmployee() {
        List<Employee> xyz =empRepository.findAll();
        return xyz;
    }

    @Override
    public Employee findEmployeeById(int id) {
        return empRepository.findById(id).orElse(null);

    }

    @Override
    public String deleteByAddress(String address) {
        String s=empRepository.deleteByAddress(address);
        return s;
    }

    @Override
    public Double deleteByPno(Double pno) {
        Double d = empRepository.deleteByPno(pno);
        return d;
    }

    @Override
    public Integer deleteById(int id) {
        Integer i = empRepository.deleteById(id);
        return 0;
    }


}
