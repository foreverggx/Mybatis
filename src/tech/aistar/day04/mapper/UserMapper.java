package tech.aistar.day04.mapper;

import tech.aistar.day04.vo.UserCustomVo;

import java.util.Set;

/**
 * @Description: java类作用描述:
 * @Author: tyg
 * @CreateDate: 2019/5/14 0014
 * @Version: 1.0
 */
public interface UserMapper {
    /**
     * 根据id查询用户所有信息
     *
     * @param id
     * @return
     */
    UserCustomVo findById(Integer id);

    /**
     * 根据id查询用户及其订单信息,单独查询User只会发送查询user的sql语句
     *
     * @param id
     * @return
     */
    UserCustomVo getUserAndOrdersByIdLazy(Integer id);
}
