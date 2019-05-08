package tech.aistar.day01.entity;

import lombok.Data;
import sun.reflect.generics.repository.GenericDeclRepository;

import java.util.Date;

/**
 * @Description: java类作用描述:
 * @Author: tyg
 * @CreateDate: 2019/5/8 0008
 * @Version: 1.0
 */
@Data
public class Student {
    private Integer id;

    private String sno;

    private String sname;

    private Date birthday;

    private Gender gender;
}
