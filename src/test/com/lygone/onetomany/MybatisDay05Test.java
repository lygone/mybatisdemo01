package com.lygone.onetomany;

import onetomany.Department;
import onetomany.DepartmentMapper;
import onetomany.Employee;
import onetomany.EmployeeMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;
import java.util.Date;

/**
 * Created by panyi on 2018/2/15.
 */
public class MybatisDay05Test {
    public SqlSession getSqlSession() throws IOException {
        SqlSession sqlSession=null;
        Reader reader=Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(reader);
        sqlSession=sqlSessionFactory.openSession();
        return sqlSession;
    }
@Test
    public void test1() throws IOException{
    SqlSession sqlSession=null;
    sqlSession=getSqlSession();
    Department department=new Department();
    department.setDeptId(1);
    department.setName("策划");
    department.setDeptDesc("策划活动的组织");
    DepartmentMapper departmentMapper=sqlSession.getMapper(DepartmentMapper.class);
    departmentMapper.save(department);
    sqlSession.commit();
    sqlSession.close();
}
    @Test
    public void test2() throws IOException{
        SqlSession sqlSession=null;
        sqlSession=getSqlSession();
        Employee employee=new Employee();
        employee.setEmpId(1002);
        employee.setName("pyc");
        employee.setHireDate(new Date(1996-10-24));
        Department department=new Department();
        department.setDeptId(1);
        employee.setDept(department);
        EmployeeMapper employeeMapper=sqlSession.getMapper(EmployeeMapper.class);
        employeeMapper.save(employee);
        sqlSession.commit();
        sqlSession.close();
    }
@Test
    public void test3() throws IOException{
    SqlSession sqlSession=null;
    sqlSession=getSqlSession();
    DepartmentMapper departmentMapper=sqlSession.getMapper(DepartmentMapper.class);
    Department department=departmentMapper.findDeptAndEmpsById(1);
    System.out.println(department.toString());
}
    @Test
    public void test4() throws IOException{
        SqlSession sqlSession=null;
        sqlSession=getSqlSession();
        EmployeeMapper employeeMapper=sqlSession.getMapper(EmployeeMapper.class);
        Employee employee=employeeMapper.findById(1002);
        sqlSession.commit();
        System.out.println(employee.toString());
    }
}
