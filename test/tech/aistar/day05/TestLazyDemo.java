package tech.aistar.day05;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import tech.aistar.day04.mapper.UserMapper;
import util.MybatisUtil;

/**
 * @Description: java类作用描述:
 * @Author: tyg
 * @CreateDate: 2019/5/15 0015
 * @Version: 1.0
 */
public class TestLazyDemo {
    @Test
    public void testGetUserAndOrdersById() {
        SqlSession sqlSession = MybatisUtil.getSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        System.out.println(mapper.getUserAndOrdersByIdLazy(1));

        mapper.getUserAndOrdersByIdLazy(1).getOrderCustomVos().forEach(System.out::println);
    }
}
