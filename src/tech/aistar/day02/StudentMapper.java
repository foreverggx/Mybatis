package tech.aistar.day02;

import org.apache.ibatis.annotations.Param;
import tech.aistar.day01.entity.Student;
import tech.aistar.day01.entity.vo.StudentQueryVo;

import java.util.List;
import java.util.Map;

/**
 * @Description: java类作用描述:
 * @Author: tyg
 * @CreateDate: 2019/5/9 0009
 * @Version: 1.0
 */
public interface StudentMapper {

    /**
     * @param id
     * @return
     */
    Student findById(Integer id);

    /**
     * 多重组合条件查询使用到多个参数
     * 方式一:使用第三方实体类
     *
     * @param queryVo
     * @return
     */
    List<Student> findByIdAndSname(StudentQueryVo queryVo);

    /**
     * 多重组合条件查询使用到多个参数
     * 方式二:使用参数注解
     *
     * @param id
     * @param sname
     * @return
     */
    List<Student> findByIdAndSnameAno(@Param("id") Integer id, @Param("sname") String sname);

    /**
     * 多重组合条件查询使用到多个参数
     * 方式三:使用Map
     *
     * @param map
     * @return
     */
    List<Student> findByIdAndSnameMap(Map<String, Object> map);

    /**
     * 查询所有学生信息
     *
     * @return
     */
    List<Student> findAll();
}
