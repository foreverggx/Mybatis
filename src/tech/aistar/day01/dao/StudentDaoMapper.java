package tech.aistar.day01.dao;

import tech.aistar.day01.entity.Student;

import java.util.List;

/**
 * @Description: java类作用描述:
 * @Author: tyg
 * @CreateDate: 2019/5/8 0008
 * @Version: 1.0
 */
public interface StudentDaoMapper {
    Student findById(Integer id);

    List<Student> findBySname(String sname);

    void save(Student s);

    void delById(Integer id);

    void update(Student s);

}
