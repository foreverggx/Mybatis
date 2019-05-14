package tech.aistar.day04.vo;

import tech.aistar.day04.entity.Orderdetail;
import tech.aistar.day04.entity.Orders;

import java.util.Set;

/**
 * @Description: java类作用描述:
 * @Author: tyg
 * @CreateDate: 2019/5/14 0014
 * @Version: 1.0
 */
public class OrderCustomVo extends Orders {
    //一个订单对应多个订单明细
    private Set<OrdersDetailCustomVo> orderdetails;

    public Set<OrdersDetailCustomVo> getOrderdetails() {
        return orderdetails;
    }

    public void setOrderdetails(Set<OrdersDetailCustomVo> orderdetails) {
        this.orderdetails = orderdetails;
    }
}
