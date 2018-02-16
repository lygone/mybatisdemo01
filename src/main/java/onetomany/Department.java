package onetomany;

import com.lygone.*;

import java.util.List;

/**
 * Created by panyi on 2018/2/15.
 */
public class Department {
    private int deptId;
    private String name;
    private String deptDesc;
    private List<Employee> employeeList;

    @Override
    public String toString() {
        return "Department{" +
                "deptId=" + deptId +
                ", name='" + name + '\'' +
                ", deptDesc='" + deptDesc + '\'' +
                ", employeeList=" + employeeList +
                '}'+"\n";
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeptDesc() {
        return deptDesc;
    }

    public void setDeptDesc(String deptDesc) {
        this.deptDesc = deptDesc;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public Department() {
    }
}
