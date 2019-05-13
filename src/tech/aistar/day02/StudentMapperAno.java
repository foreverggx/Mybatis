package tech.aistar.day02;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import tech.aistar.day01.entity.Student;

import java.util.List;

/**
 * @Description: java类作用描述:Mybatis注解开发-不推荐使用
 * @Author: tyg
 * @CreateDate: 2019/5/13 0013
 * @Version: 1.0
 */
public interface StudentMapperAno {

    @Select("select * from student_test where id = #{id}")
    Student findById(Integer id);

    @Insert("insert into student_test(sno,sname,birthday,gender) values(#{sno},#{sname},#{birthday},#{gender})")
    void save(Student stu);

    @Select("select id,sno no,sname name,birthday,gender from student_test")
    @Results({
            @Result(column = "no",property = "sno"),
            @Result(column = "name",property = "sname")
    })
    List<Student> findAll();
}
