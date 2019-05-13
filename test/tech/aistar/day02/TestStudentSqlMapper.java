package tech.aistar.day02;

import org.apache.ibatis.jdbc.SQL;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import tech.aistar.day01.entity.Gender;
import tech.aistar.day01.entity.Student;
import util.MybatisUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: java类作用描述:
 * @Author: tyg
 * @CreateDate: 2019/5/13 0013
 * @Version: 1.0
 */
public class TestStudentSqlMapper {

    @Test
    public void testFindByIdOrSname() {
        SqlSession sqlSession = MybatisUtil.getSession();
        StudentSqlMapper sqlMapper = sqlSession.getMapper(StudentSqlMapper.class);

        sqlMapper.findByIdOrSnameAno(1, "h").forEach(System.out::println);
        sqlSession.close();
    }

    @Test
    public void testFindByAnyConditional() {
        SqlSession sqlSession = MybatisUtil.getSession();
        StudentSqlMapper sqlMapper = sqlSession.getMapper(StudentSqlMapper.class);

        sqlMapper.findByAnyConditional(1, "h").forEach(System.out::println);
        sqlSession.close();
    }

    @Test
    public void testUpdate() {
        SqlSession sqlSession = MybatisUtil.getSession();
        StudentSqlMapper sqlMapper = sqlSession.getMapper(StudentSqlMapper.class);

        Student stu = new Student();
        stu.setId(9);
        stu.setSno("1009");
        stu.setSname("huni");
        stu.setGender(Gender.F);
        sqlMapper.update(stu);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testFindByIds() {
        SqlSession sqlSession = MybatisUtil.getSession();
        StudentSqlMapper sqlMapper = sqlSession.getMapper(StudentSqlMapper.class);
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        sqlMapper.findByIds(list).forEach(System.out::println);
        sqlSession.close();
    }

    @Test
    public void testFindInConditional() {
        SqlSession sqlSession = MybatisUtil.getSession();
        StudentSqlMapper sqlMapper = sqlSession.getMapper(StudentSqlMapper.class);
        sqlMapper.findInConditional(1, "h").forEach(System.out::println);
        sqlSession.close();
    }

    @Test
    public void testSaveList() {
        SqlSession sqlSession = MybatisUtil.getSession();
        StudentSqlMapper sqlMapper = sqlSession.getMapper(StudentSqlMapper.class);
        List<Student> list = new ArrayList<>();
        Student stu1 = new Student();
        stu1.setSno("1010");
        stu1.setSname("shaX");
        stu1.setGender(Gender.F);
        Student stu2 = new Student();
        stu2.setSno("1011");
        stu2.setSname("shaB");
        stu2.setGender(Gender.M);
        list.add(stu1);
        list.add(stu2);
        sqlMapper.saveList(list);
        sqlSession.commit();
        sqlSession.close();
    }

}
