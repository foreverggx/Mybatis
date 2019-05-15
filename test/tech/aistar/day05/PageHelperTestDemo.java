package tech.aistar.day05;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import tech.aistar.day01.entity.Student;
import tech.aistar.day02.StudentMapper;
import util.MybatisUtil;

import java.util.List;

/**
 * @Description: java类作用描述:
 * @Author: tyg
 * @CreateDate: 2019/5/15 0015
 * @Version: 1.0
 */
public class PageHelperTestDemo {
    @Test
    public void testPageHelper() {
        SqlSession sqlSession = MybatisUtil.getSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);

        PageHelper.startPage(2, 3);

        List<Student> list = mapper.findAll();

        PageInfo<Student> info = new PageInfo<>(list);
        System.out.println("当前页:" + info.getPageNum());
        System.out.println("总页:" + info.getPages());
        System.out.println("总的条数:" + info.getTotal());
        System.out.println("每页显示条数:" + info.getPageSize());
        System.out.println("显示的内容:");
        info.getList().forEach(System.out::println);
    }
}
