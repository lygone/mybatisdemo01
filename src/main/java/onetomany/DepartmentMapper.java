package onetomany;

/**
 * Created by panyi on 2018/2/15.
 */
public interface DepartmentMapper {
    public void save (Department department);
    public Department findById(Integer deptId);
    public Department findDeptAndEmpsById(Integer deptId);
}
