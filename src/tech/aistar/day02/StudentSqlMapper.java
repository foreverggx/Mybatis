package tech.aistar.day02;

import org.apache.ibatis.annotations.Param;
import tech.aistar.day01.entity.Student;

import java.util.List;

/**
 * @Description: java类作用描述:
 * @Author: tyg
 * @CreateDate: 2019/5/13 0013
 * @Version: 1.0
 */
public interface StudentSqlMapper {

    /**
     * 没有传sname那么只根据id查询
     *
     * @param id
     * @param sname
     * @return
     */
    List<Student> findByIdOrSnameAno(@Param("id") Integer id, @Param("sname") String sname);

    /**
     * 有条件就根据条件查询
     *
     * @param id
     * @param sname
     * @return
     */
    List<Student> findByAnyConditional(@Param("id") Integer id, @Param("sname") String sname);
}
