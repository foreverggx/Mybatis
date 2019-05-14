package tech.aistar.day02.homework;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import tech.aistar.day02.homework.dao.CustomerMapper;
import tech.aistar.day02.homework.entity.Customer;
import tech.aistar.day02.homework.entity.Order;
import tech.aistar.day02.homework.entity.OrderStat;
import util.MybatisUtil;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Description: java类作用描述:
 * @Author: tyg
 * @CreateDate: 2019/5/13 0013
 * @Version: 1.0
 */
public class TestCustomerMapper {
    @Test
    public void testSave() {
        SqlSession sqlSession = MybatisUtil.getSession();
        CustomerMapper mapper = sqlSession.getMapper(CustomerMapper.class);

        Customer cus = new Customer();
        cus.setCname("zhanglei");

        List<Order> list = new ArrayList<>();
        Order order1 = new Order();
        order1.setOrdno("1003");
        order1.setPrice(888.0);
        order1.setCreateDate(new Date());
        order1.setOrderStat(OrderStat.A);
        order1.setCustomer(cus);
        Order order2 = new Order();
        order2.setOrdno("1004");
        order2.setPrice(231.0);
        order2.setCreateDate(new Date());
        order2.setOrderStat(OrderStat.B);
        order2.setCustomer(cus);
        list.add(order1);
        list.add(order2);

        cus.setOrderList(list);

        mapper.save(cus);

        sqlSession.commit();
        sqlSession.close();
    }
}
