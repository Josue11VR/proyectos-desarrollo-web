package ac.cr.una.bejpahibernatecriteria.dao;

import ac.cr.una.bejpahibernatecriteria.model.Department;
import java.util.List;

/**
 *
 * @author josue
 */


public interface DepartmentDAO {
    
    public Department saveDepartment(Department department);
    
    public Department findById(long id);
    
    public List<Department> findAll();
    
    public Department updateDepartment(Department department);
    
    public boolean deleteDepartment(long id);
    
}
