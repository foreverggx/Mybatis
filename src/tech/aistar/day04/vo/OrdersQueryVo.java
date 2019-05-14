package tech.aistar.day04.vo;

import tech.aistar.day04.entity.Orders;

/**
 * @Description: java类作用描述:
 * @Author: tyg
 * @CreateDate: 2019/5/14 0014
 * @Version: 1.0
 */
public class OrdersQueryVo extends Orders {
    //将user的信息散列的写在此处
    //配合resultType实现 - 主要是构建出和查询列匹配
    private Integer uid;

    private String username;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
