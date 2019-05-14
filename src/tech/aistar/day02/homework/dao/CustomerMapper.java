package tech.aistar.day02.homework.dao;

import org.apache.ibatis.annotations.Param;
import tech.aistar.day02.homework.entity.Customer;

/**
 * @Description: java类作用描述:
 * @Author: tyg
 * @CreateDate: 2019/5/13 0013
 * @Version: 1.0
 */
public interface CustomerMapper {
    /**
     * 增加一个客户信息
     *
     * @param cu
     */
    void save(Customer cu);

    /**
     * 根据id查询客户信息
     *
     * @param id
     * @return
     */
    Customer findById(Integer id);
}
