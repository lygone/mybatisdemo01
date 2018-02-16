package onetomany;

import java.util.List;

/**
 * Created by panyi on 2018/2/15.
 */
public interface EmployeeMapper {
    public void save(Employee employee);
    public Employee findById(Integer empId);
public List<Employee> findByDeptId(Integer deptId);
}
