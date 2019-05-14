package tech.aistar.day04.mapper;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import tech.aistar.day04.vo.UserCustomVo;
import util.MybatisUtil;

/**
 * @Description: java类作用描述:
 * @Author: tyg
 * @CreateDate: 2019/5/14 0014
 * @Version: 1.0
 */
public class TestUserMapper {
    @Test
    public void testFindById() {
        SqlSession sqlSession = MybatisUtil.getSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        UserCustomVo vo = mapper.findById(1);
        System.out.println(vo);
        vo.getOrderCustomVos().forEach(System.out::println);
        vo.getOrderCustomVos().forEach(o -> o.getOrderdetails().forEach(System.out::println));
        vo.getOrderCustomVos().forEach(o -> o.getOrderdetails().forEach(d -> System.out.println(d.getItemsCustomVo())));
    }
}
