package tech.aistar.day02.homework.service;

import tech.aistar.day02.homework.entity.Customer;

/**
 * @Description: java类作用描述:
 * @Author: tyg
 * @CreateDate: 2019/5/13 0013
 * @Version: 1.0
 */
public interface ICustomerService {
    /**
     * 添加一个客户信息,有订单一起添加
     *
     * @param cus
     */
    void save(Customer cus);
}
