package tech.aistar.day02;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import tech.aistar.day01.entity.Student;
import util.MybatisUtil;

/**
 * @Description: java类作用描述:
 * @Author: tyg
 * @CreateDate: 2019/5/9 0009
 * @Version: 1.0
 */
public class TestStudentMapper {
    @Test
    public void testFindById() {
        SqlSession sqlsession = MybatisUtil.getSession();
        //获取到一个Mapper接口的实现类的一个代理对象
        //原先使用的sqlSession对象调用insert delete select update 现在是底层调用的这些方法
        //除了调用这些api方法,还需要动态创建出mapper接口的实现类

        //调用映射文件中的sql语句时
        //1.无需硬编码调用sql
        //2.参数类型安全了
        StudentMapper mapper = sqlsession.getMapper(StudentMapper.class);

        Student stu = mapper.findById(1);

        System.out.println(stu);
    }
}
