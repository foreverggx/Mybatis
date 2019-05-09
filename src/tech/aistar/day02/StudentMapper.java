package tech.aistar.day02;

import tech.aistar.day01.entity.Student;

/**
 * @Description: java类作用描述:
 * @Author: tyg
 * @CreateDate: 2019/5/9 0009
 * @Version: 1.0
 */
public interface StudentMapper {

    Student findById(Integer id);
}
