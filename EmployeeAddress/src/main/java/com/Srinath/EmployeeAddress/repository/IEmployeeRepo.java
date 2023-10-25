package com.Srinath.EmployeeAddress.repository;


import com.Srinath.EmployeeAddress.model.Employee;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmployeeRepo extends CrudRepository<Employee,Long> {

    Employee findByEmployeeId(Long empId);
}
