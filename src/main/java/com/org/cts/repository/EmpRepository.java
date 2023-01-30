package com.org.cts.repository;


import com.org.cts.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface EmpRepository extends JpaRepository<Employee,Integer> {


    @Transactional
    String deleteByAddress(String address);

    @Transactional
    Double deleteByPno(Double pno);

    @Transactional
    Integer deleteById(int id);
}
