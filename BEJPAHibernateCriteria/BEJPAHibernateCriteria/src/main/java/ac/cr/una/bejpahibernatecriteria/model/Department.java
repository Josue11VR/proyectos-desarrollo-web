
package ac.cr.una.bejpahibernatecriteria.model;

/**
 *
 * @author josue
 */


import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Department") //If name is not supplied hibernate will use class name as table name
public class Department {

    @Id
    @Column (name="idDepartment") //If name is not supplied hibernate will use field name as column name
    @GeneratedValue(strategy = IDENTITY)
    private long id;
    @Column
    private String deptName;

    public Department() {
    }

    public Department(long id, String deptName) {
        this.id = id;
        this.deptName = deptName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 37 * hash + Objects.hashCode(this.deptName);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Department other = (Department) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.deptName, other.deptName)) {
            return false;
        }
        return true;
    }

}
