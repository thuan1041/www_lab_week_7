package vn.edu.iuh.fit.www_lab_week_7.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.edu.iuh.fit.www_lab_week_7.backend.models.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
