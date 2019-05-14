package tech.aistar.day02.homework.service.impl;

import org.apache.ibatis.session.SqlSession;
import tech.aistar.day02.homework.dao.CustomerMapper;
import tech.aistar.day02.homework.dao.OrderMapper;
import tech.aistar.day02.homework.entity.Customer;
import tech.aistar.day02.homework.service.ICustomerService;
import util.MybatisUtil;

/**
 * @Description: java类作用描述:
 * @Author: tyg
 * @CreateDate: 2019/5/13 0013
 * @Version: 1.0
 */
public class CustomerServiceImpl implements ICustomerService {
    @Override
    public void save(Customer cus) {
        SqlSession sqlSession = MybatisUtil.getSession();

        CustomerMapper cMapper = sqlSession.getMapper(CustomerMapper.class);

        OrderMapper oMapper = sqlSession.getMapper(OrderMapper.class);

        cMapper.save(cus);

        oMapper.save(cus.getOrderList());
    }
}
