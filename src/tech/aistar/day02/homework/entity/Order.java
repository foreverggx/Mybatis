package tech.aistar.day02.homework.entity;

import lombok.Data;

import java.util.Date;

/**
 * @Description: java类作用描述:
 * @Author: tyg
 * @CreateDate: 2019/05/05
 * @Version: 1.0
 */
@Data
public class Order {
    private Integer oid;

    private String ordno;

    private OrderStat orderStat;

    private Double price;

    private Date createDate;

    private Customer customer;

}
