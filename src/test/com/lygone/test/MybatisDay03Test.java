package com.lygone.test;

import onetoone.IdCard;
import onetoone.IdCardMapper;
import onetoone.Person;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import java.util.List;

/**
 * Created by panyi on 2018/2/13.
 */
public class MybatisDay03Test  {
    @Test
    public void test1() throws IOException {
    Reader reader= Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(reader);
        SqlSession sqlSession=sqlSessionFactory.openSession();
        IdCard idCard=new IdCard();
        idCard.setCardNo("321181185516945740");
        Person person=new Person();
        person.setPid(2);
        idCard.setPerson(person);
        IdCardMapper idCardMapper=sqlSession.getMapper(IdCardMapper.class);
        idCardMapper.save(idCard);
        sqlSession.commit();
}
    @Test
    public void test2() throws IOException {
        Reader reader= Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(reader);
        SqlSession sqlSession=sqlSessionFactory.openSession();
        IdCardMapper idCardMapper=sqlSession.getMapper(IdCardMapper.class);
        IdCard idCards=idCardMapper.findByPersonId(1);
        sqlSession.commit();
        System.out.println(idCards);
    }
    @Test
    public void test3() throws IOException {
        Reader reader= Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(reader);
        SqlSession sqlSession=sqlSessionFactory.openSession();
        IdCardMapper idCardMapper=sqlSession.getMapper(IdCardMapper.class);
        IdCard idCard=idCardMapper.findById("321181199612045710");
        sqlSession.commit();
        System.out.println(idCard);
    }
}
