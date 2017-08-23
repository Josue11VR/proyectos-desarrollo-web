
package ac.cr.una.bejpahibernatecriteria.model;

/**
 *
 * @author josue
 */

import java.util.Objects;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
public class Employee {

    @Id
    @Column(name = "idEmployee")
    @GeneratedValue(strategy = IDENTITY)
    private long id;
    @Column(name = "firstname")
    private String firstName;
    @Column(name = "salary")
    private double salary;
    @JoinColumn(name = "idDepartment")
    @ManyToOne
    private Department department; //reference to Department

    public Employee() {
    }

    public Employee(long id, String firstName, double salary, Department department) {
        this.id = id;
        this.firstName = firstName;
        this.salary = salary;
        this.department = department;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 13 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 13 * hash + Objects.hashCode(this.firstName);
        hash = 13 * hash + (int) (Double.doubleToLongBits(this.salary) ^ (Double.doubleToLongBits(this.salary) >>> 32));
        hash = 13 * hash + Objects.hashCode(this.department);
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
        final Employee other = (Employee) obj;
        if (this.id != other.id) {
            return false;
        }
        if (Double.doubleToLongBits(this.salary) != Double.doubleToLongBits(other.salary)) {
            return false;
        }
        if (!Objects.equals(this.firstName, other.firstName)) {
            return false;
        }
        if (!Objects.equals(this.department, other.department)) {
            return false;
        }
        return true;
    }

}
