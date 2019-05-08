package tech.aistar.day01.dao;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import tech.aistar.day01.entity.Student;

import java.io.IOException;
import java.io.InputStream;

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
}
