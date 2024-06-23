package com.hendisantika.springbootthymeleafemployeecrud.service;

import com.hendisantika.springbootthymeleafemployeecrud.entity.Employee;
import org.springframework.data.domain.Page;

import java.util.List;


public interface EmployeeService {
    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    Employee getEmployeeById(long id);

    void deleteEmployeeById(long id);

    Page<Employee> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
}
