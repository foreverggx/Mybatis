package tech.aistar.day04.mapper;

import tech.aistar.day04.vo.OrdersCustomVo;
import tech.aistar.day04.vo.OrdersQueryVo;

/**
 * @Description: java类作用描述:
 * @Author: tyg
 * @CreateDate: 2019/5/14 0014
 * @Version: 1.0
 */
public interface OrdersMapper {
    /**
     * 根据订单的id查询,并查处其客户信息
     *
     * @param id
     * @return
     */
    OrdersQueryVo getById(Integer id);

    OrdersCustomVo findById(Integer id);
}
