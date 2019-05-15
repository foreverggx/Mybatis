package tech.aistar.day05;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import tech.aistar.day04.mapper.UserMapper;
import tech.aistar.day04.vo.UserCustomVo;
import util.MybatisUtil;

/**
 * @Description: java类作用描述:
 * @Author: tyg
 * @CreateDate: 2019/5/15 0015
 * @Version: 1.0
 */
public class TestTwoCacheDemo {
    @Test
    public void testTwoCache() {
        //二级缓存跨sqlSession级别的,属于mapper级别
        SqlSession sqlSession = MybatisUtil.getSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        //优先查找一级缓存,没有再去查找二级缓存,都没有再去交互db
        UserCustomVo customVo = mapper.getUserAndOrdersByIdLazy(1);
        //一级缓存数据结构:hashmap key value ,key - id value - 封存好的对象[UserCustomVo]
        System.out.println(customVo);
        UserCustomVo customVo1 = mapper.getUserAndOrdersByIdLazy(1);
        System.out.println(customVo1);

        sqlSession.close();

        SqlSession sqlSession1 = MybatisUtil.getSession();
        UserMapper mapper1 = sqlSession1.getMapper(UserMapper.class);
        //二级缓存根据key查找,先获取对象对应的散列数据-底层再新建一个对象,封装这些散列的数据
        UserCustomVo customVo2 = mapper1.getUserAndOrdersByIdLazy(1);
        System.out.println(customVo2);
        sqlSession1.close();
    }
}
