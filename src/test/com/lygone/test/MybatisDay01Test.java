package com.lygone.test;

import com.lygone.User;
import com.lygone.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.defaults.DefaultSqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.Date;

/**
 * Created by panyi on 2018/2/11.
 */
public class MybatisDay01Test {
@Test
    public void test1() throws IOException {
    //创建 sqlsessionfactory对象
    Reader reader=Resources.getResourceAsReader("mybatis-config.xml");
    SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(reader);
    SqlSession sqlSession=sqlSessionFactory.openSession();
    User user=new User();
    user.setUid("10002");
    user.setName("lygone");
    user.setAge(22);
    user.setBirthday(new Date());
    UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
    boolean flag=userMapper.save(user);
    sqlSession.commit();
    System.out.println(flag);
    sqlSession.close();
}
    @Test
    public void test2() throws IOException{
        //创建 sqlsessionfactory对象
        Reader reader=Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(reader);
        SqlSession sqlSession=sqlSessionFactory.openSession();
        User u=new User();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        u=userMapper.findById("10001");
        sqlSession.commit();
        System.out.println("查找到的姓名为:"+u.getName()+",年龄为 :"+u.getAge()+",生日为:"+u.getBirthday());
        System.out.println(u.toString());
        sqlSession.close();
    }
    @Test
    public void test3() throws IOException{
        InputStream inputStream=Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession=sqlSessionFactory.openSession();
        User u=sqlSession.selectOne("com.lygone.findUser","10002");
        sqlSession.commit();
        System.out.println(u.toString());
        sqlSession.close();
    }
}
