package tech.aistar.day01.dao;

import jdk.internal.util.xml.impl.Input;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import tech.aistar.day01.dao.impl.StudentDaoImpl;
import tech.aistar.day01.entity.Gender;
import tech.aistar.day01.entity.Student;

import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @Description: java类作用描述:
 * @Author: tyg
 * @CreateDate: 2019/5/8 0008
 * @Version: 1.0
 */
public class TestStudentDaoMapper {

    @Test
    public void testFindById() {
        try {
            InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
            SqlSession sqlSession = sqlSessionFactory.openSession();
            //查询单个对象
            Student stu = sqlSession.selectOne("StudentDaoMapper.findById",1);
            System.out.println(stu);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testFindBySname() {
        try {
            InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
            SqlSession sqlSession = sqlSessionFactory.openSession();

            List<Student> list = sqlSession.selectList("StudentDaoMapper.findBySname","'%h%'");
            list.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    StudentDaoMapper studentDaoMapper = new StudentDaoImpl();
    @Test
    public void testSave() {
        Student stu = new Student();
        stu.setSno("1002");
        stu.setSname("jary");
        stu.setBirthday(new Date());
        stu.setGender(Gender.F);
        studentDaoMapper.save(stu);
    }

    @Test
    public void testDelById() {
        studentDaoMapper.delById(11);
    }

    @Test
    public void testUpdate() {
        Student stu = studentDaoMapper.findById(1);
        stu.setSno("1005");
        stu.setSname("tom");
        studentDaoMapper.update(stu);
    }
}
