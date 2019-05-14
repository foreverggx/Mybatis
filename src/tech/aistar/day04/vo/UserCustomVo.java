package tech.aistar.day04.vo;

import tech.aistar.day04.entity.User;

import java.util.Set;

/**
 * @Description: java类作用描述:
 * @Author: tyg
 * @CreateDate: 2019/5/14 0014
 * @Version: 1.0
 */
public class UserCustomVo extends User {
    //一个用户对应多个订单
    Set<OrderCustomVo> orderCustomVos;

    public Set<OrderCustomVo> getOrderCustomVos() {
        return orderCustomVos;
    }

    public void setOrderCustomVos(Set<OrderCustomVo> orderCustomVos) {
        this.orderCustomVos = orderCustomVos;
    }
}
