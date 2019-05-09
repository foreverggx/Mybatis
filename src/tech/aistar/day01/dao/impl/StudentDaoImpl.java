package tech.aistar.day01.dao.impl;

import org.apache.ibatis.session.SqlSession;
import tech.aistar.day01.dao.StudentDaoMapper;
import tech.aistar.day01.entity.Student;
import util.MybatisUtil;

import java.util.List;

/**
 * @Description: java类作用描述:
 * @Author: tyg
 * @CreateDate: 2019/5/9 0009
 * @Version: 1.0
 */
public class StudentDaoImpl implements StudentDaoMapper {
    @Override
    public Student findById(Integer id) {
        SqlSession sqlSession = MybatisUtil.getSession();
        Student stu = sqlSession.selectOne("StudentDaoMapper.findById",id);
        return stu;
    }

    @Override
    public List<Student> findBySname(String sname) {
        return null;
    }

    @Override
    public void save(Student s) {
        SqlSession sqlSession = MybatisUtil.getSession();
        //sqlSession.insert("StudentDaoMapper.save",s);
        sqlSession.insert("StudentDaoMapper.saveKey",s);
        System.out.println(s);

        sqlSession.commit();
    }

    @Override
    public void delById(Integer id) {
        SqlSession sqlSession = MybatisUtil.getSession();
        sqlSession.delete("StudentDaoMapper.delById",id);
        sqlSession.commit();
    }

    @Override
    public void update(Student s) {
        SqlSession sqlSession = MybatisUtil.getSession();
        sqlSession.update("StudentDaoMapper.update",s);
        sqlSession.commit();
    }
}
