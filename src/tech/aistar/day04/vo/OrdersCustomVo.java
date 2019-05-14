package tech.aistar.day04.vo;

import tech.aistar.day04.entity.Orders;
import tech.aistar.day04.entity.User;

/**
 * @Description: java类作用描述:
 * @Author: tyg
 * @CreateDate: 2019/5/14 0014
 * @Version: 1.0
 */
public class OrdersCustomVo extends Orders {
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
