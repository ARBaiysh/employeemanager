package tesh.getarrays.emploeemanaget.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tesh.getarrays.emploeemanaget.entity.Employee;

import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    void deleteEmployeeById(Long id);

    Optional<Employee> findEmployeeById(Long id);

}
