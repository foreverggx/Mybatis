package tech.aistar.day02.homework.entity;

import lombok.Data;

import java.util.List;

/**
 * @Description: java类作用描述:
 * @Author: tyg
 * @CreateDate: 2019/05/05
 * @Version: 1.0
 */
@Data
public class Customer {
    private Integer cid;

    private String cname;

    private List<Order> orderList;
}
