package com.lygone.test;

import com.lygone.Employee;
import com.lygone.EmployeeDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

/**
 * Created by panyi on 2018/2/12.
 */
public class MybatisDay02Test {
    @Test
    public void test1() throws IOException {
        InputStream inputStream= Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession=sqlSessionFactory.openSession();
        Employee employee=new Employee();
        employee.setName("lygone");
        employee.setSex("male");
        employee.setHireDate(new Date());
        EmployeeDao employeeDao=sqlSession.getMapper(EmployeeDao.class);
        employeeDao.save(employee);
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void test2() throws IOException {
        InputStream inputStream= Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession=sqlSessionFactory.openSession();
        EmployeeDao employeeDao=sqlSession.getMapper(EmployeeDao.class);
        Employee employee=employeeDao.findById(1);
        System.out.println(employee.toString());
        employee.setName("pyc");
        employee.setSex("女");
        employee.setHireDate(new Date(1996-12-04));
        employeeDao.update(employee);
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void test3() throws IOException {
        InputStream inputStream= Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession=sqlSessionFactory.openSession();
        EmployeeDao employeeDao=sqlSession.getMapper(EmployeeDao.class);
        List<Employee> employees=employeeDao.findByName("y");
        for(Employee s:employees){
            System.out.println(s.toString()+"\n");
        }
    }
}
