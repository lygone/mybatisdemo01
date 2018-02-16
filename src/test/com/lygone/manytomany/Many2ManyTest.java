package com.lygone.manytomany;

import manytomany.*;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;

/**
 * Created by panyi on 2018/2/16.
 */
public class Many2ManyTest {
    public SqlSession getSqlSession() throws IOException {
        SqlSession sqlSession=null;
        Reader reader= Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(reader);
        sqlSession=sqlSessionFactory.openSession();
        return sqlSession;
    }
    @Test
    //插入学生
    public void test1() throws IOException {
        SqlSession sqlSession=null;
        sqlSession=getSqlSession();
        Student student=new Student();
        student.setStuId("1001");
        student.setName("lygone");
        StudentMapper studentMapper=sqlSession.getMapper(StudentMapper.class);
        studentMapper.save(student);
        sqlSession.commit();
    }
    @Test
    //插入课程
    public void test2()throws IOException{
        SqlSession sqlSession=null;
        sqlSession=getSqlSession();
        Course course=new Course();
        course.setCid("001");
        course.setName("高数");
        course.setXuefeng(5);
        course.setCdesc("大一高等数学");
        CourseMapper courseMapper=sqlSession.getMapper(CourseMapper.class);
        courseMapper.save(course);
        sqlSession.commit();
    }
    @Test
    //学生选课
    public void test3()throws  IOException{
        SqlSession sqlSession=null;
        sqlSession=getSqlSession();
        StudentSelectCourse studentSelectCourse=new StudentSelectCourse();
        studentSelectCourse.setStuId("1001");
        studentSelectCourse.setCid("001");
        studentSelectCourse.setRemark("良好");
        studentSelectCourse.setScore(99);
        StudentSelectCourseMapper studentSelectCourseMapper=sqlSession.getMapper(StudentSelectCourseMapper.class);
        studentSelectCourseMapper.save(studentSelectCourse);
        sqlSession.commit();
    }
    @Test
    //通过学号查询学生及该学生选课信息
    public void test4() throws IOException{
        SqlSession sqlSession=null;
        sqlSession=getSqlSession();
        StudentMapper studentMapper=sqlSession.getMapper(StudentMapper.class);
        Student student=studentMapper.findStuAndCoursesById("1001");
        sqlSession.commit();
        System.out.println(student.toString());
    }
    @Test
    //通过课程号查询课程信息及选修该课程的学生
    public void test5() throws IOException{
        SqlSession sqlSession=null;
        sqlSession=getSqlSession();
        CourseMapper courseMapper=sqlSession.getMapper(CourseMapper.class);
        Course course=courseMapper.findCourseAndStusById("001");
        sqlSession.commit();
        System.out.println(course.toString());
    }
}
