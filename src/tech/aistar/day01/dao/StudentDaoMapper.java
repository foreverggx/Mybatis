package tech.aistar.day01.dao;

import tech.aistar.day01.entity.Student;

/**
 * @Description: java类作用描述:
 * @Author: tyg
 * @CreateDate: 2019/5/8 0008
 * @Version: 1.0
 */
public interface StudentDaoMapper {
    Student findById(Integer id);
}
