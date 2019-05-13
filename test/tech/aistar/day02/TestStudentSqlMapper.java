package tech.aistar.day02;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import util.MybatisUtil;

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

        sqlMapper.findByIdOrSnameAno(1,"h").forEach(System.out::println);
        sqlSession.close();
    }

    @Test
    public void testFindByAnyConditional() {
        SqlSession sqlSession = MybatisUtil.getSession();
        StudentSqlMapper sqlMapper = sqlSession.getMapper(StudentSqlMapper.class);

        sqlMapper.findByIdOrSnameAno(1,"h").forEach(System.out::println);
        sqlSession.close();
    }
}
