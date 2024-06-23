package com.hendisantika.springbootthymeleafemployeecrud.repository;

import com.hendisantika.springbootthymeleafemployeecrud.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
