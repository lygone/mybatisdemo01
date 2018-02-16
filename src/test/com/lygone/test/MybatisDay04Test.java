package com.lygone.test;


import onetoone.Person;
import onetoone.PersonMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;


import java.io.IOException;
import java.io.Reader;

/**
 * Created by panyi on 2018/2/15.
 */
public class MybatisDay04Test {
    public SqlSession getSqlSession() throws IOException {
        SqlSession sqlSession=null;
        Reader reader=Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(reader);
        sqlSession=sqlSessionFactory.openSession();
        return sqlSession;
    }
    @Test
    public void test1() throws IOException {
        Reader reader= Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(reader);
        SqlSession sqlSession=sqlSessionFactory.openSession();
        PersonMapper personMapper=sqlSession.getMapper(PersonMapper.class);
        Person p=new Person();
        p=personMapper.findSimpleById(1);
        sqlSession.commit();
        System.out.println(p.toString());
    }
    @Test
    public void test2(){
        SqlSession sqlSession=null;
        Person p=new Person();
        try {
            sqlSession=getSqlSession();
            PersonMapper personMapper=sqlSession.getMapper(PersonMapper.class);
            p=personMapper.findById(1);
            sqlSession.commit();
            System.out.println(p.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }finally {

        }
    }
}
