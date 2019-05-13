package tech.aistar.day02;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import tech.aistar.day01.entity.Gender;
import tech.aistar.day01.entity.Student;
import util.MybatisUtil;

import java.util.Date;

/**
 * @Description: java类作用描述:
 * @Author: tyg
 * @CreateDate: 2019/5/13 0013
 * @Version: 1.0
 */
public class TestStudentMapperAno {

    @Test
    public void testFindById() {
        SqlSession sqlSession = MybatisUtil.getSession();

        StudentMapperAno mapperAno = sqlSession.getMapper(StudentMapperAno.class);

        System.out.println(mapperAno.findById(1));

        sqlSession.close();
    }

    @Test
    public void testSave() {
        SqlSession sqlSession = MybatisUtil.getSession();
        StudentMapperAno mapperAno = sqlSession.getMapper(StudentMapperAno.class);
        Student stu = new Student();
        stu.setSno("8888");
        stu.setSname("haer");
        stu.setBirthday(new Date());
        stu.setGender(Gender.M);
        mapperAno.save(stu);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testFindAll() {
        SqlSession sqlSession = MybatisUtil.getSession();
        StudentMapperAno mapperAno = sqlSession.getMapper(StudentMapperAno.class);

        mapperAno.findAll().forEach(System.out::println);
        sqlSession.close();
    }
}
