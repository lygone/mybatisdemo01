package com.lygone;

import java.util.List;

/**
 * Created by panyi on 2018/2/12.
 */
public interface EmployeeDao {
    public void save(Employee emp);
    public void update(Employee emp);
    public void deleteByid(Integer empId);
    public Employee findById(Integer empId);
    public List<Employee> findAllEmp();
    public List<Employee> findByName(String empname);
}
