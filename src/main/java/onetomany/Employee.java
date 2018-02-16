package onetomany;

import java.util.Date;

/**
 * Created by panyi on 2018/2/15.
 */
public class Employee {
    private int empId;
    private String name;
    private Date hireDate;
    private Department dept;

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", hireDate=" + hireDate +
                ", dept=" + dept +
                '}';
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public Department getDept() {
        return dept;
    }

    public void setDept(Department dept) {
        this.dept = dept;
    }

    public Employee(int empId) {
        this.empId = empId;
    }

    public Employee() {
    }
}
