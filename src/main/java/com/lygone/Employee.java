package com.lygone;

import java.util.Date;

/**
 * Created by panyi on 2018/2/12.
 */
public class Employee {
    private Integer empId;
    private String name;
    private String sex;
    private Date hireDate;

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", hireDate=" + hireDate +
                '}';
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public Employee(Integer empId, String name, String sex, Date hireDate) {
        this.empId = empId;
        this.name = name;
        this.sex = sex;
        this.hireDate = hireDate;
    }
}
