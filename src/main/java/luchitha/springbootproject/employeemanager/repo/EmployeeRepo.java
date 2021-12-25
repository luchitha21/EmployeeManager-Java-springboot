package luchitha.springbootproject.employeemanager.repo;

import luchitha.springbootproject.employeemanager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee,Long> {
}
