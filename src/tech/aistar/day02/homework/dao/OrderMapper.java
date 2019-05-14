package tech.aistar.day02.homework.dao;

import org.apache.ibatis.annotations.Param;
import tech.aistar.day02.homework.entity.Order;

import java.util.List;

/**
 * @Description: java类作用描述:
 * @Author: tyg
 * @CreateDate: 2019/5/13 0013
 * @Version: 1.0
 */
public interface OrderMapper {
    /**
     * 保存多个订单信息
     *
     * @param list
     */
    void save(@Param("list") List<Order> list);
}
