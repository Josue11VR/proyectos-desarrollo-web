package ac.cr.una.bejpahibernatecriteria.dao;

import ac.cr.una.bejpahibernatecriteria.model.Employee;
import java.util.List;

/**
 *
 * @author josue
 */


public interface EmployeeDAO {
    
    
    public Employee saveEmployee(Employee employee);
    
    public Employee findById(long id);
    
    public List<Employee> findAll();
    
    public Employee updateEmployee(Employee employee);
    
    public boolean deleteEmployee(long id);
    
}
