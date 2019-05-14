package tech.aistar.day04.vo;

import tech.aistar.day04.entity.Orderdetail;

/**
 * @Description: java类作用描述:
 * @Author: tyg
 * @CreateDate: 2019/5/14 0014
 * @Version: 1.0
 */
public class OrdersDetailCustomVo extends Orderdetail {
    //一条明细对应一个商品
    private ItemsCustomVo itemsCustomVo;

    public ItemsCustomVo getItemsCustomVo() {
        return itemsCustomVo;
    }

    public void setItemsCustomVo(ItemsCustomVo itemsCustomVo) {
        this.itemsCustomVo = itemsCustomVo;
    }
}
