package tech.aistar.day04.mapper;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import tech.aistar.day04.vo.OrdersCustomVo;
import tech.aistar.day04.vo.OrdersQueryVo;
import util.MybatisUtil;

/**
 * @Description: java类作用描述:
 * @Author: tyg
 * @CreateDate: 2019/5/14 0014
 * @Version: 1.0
 */
public class TestOrdersMapper {
    @Test
    public void testGetById() {
        SqlSession session = MybatisUtil.getSession();
        OrdersMapper mapper = session.getMapper(OrdersMapper.class);

        OrdersQueryVo queryVo = mapper.getById(3);

        System.out.println(queryVo);
        System.out.println(queryVo.getUid() + " : " + queryVo.getUsername());
    }

    @Test
    public void testFindById() {
        SqlSession sqlSession = MybatisUtil.getSession();
        OrdersMapper mapper = sqlSession.getMapper(OrdersMapper.class);

        OrdersCustomVo customVo = mapper.findById(3);

        System.out.println(customVo);
        System.out.println(customVo.getUser());
    }
}
