package tech.aistar.day01;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Description: java类作用描述:
 * @Author: tyg
 * @CreateDate: 2019/5/8 0008
 * @Version: 1.0
 */
public class TestSqlSession {
    public static void main(String[] args) {
        //1.获取mybatis-config.xml的字节输入流
        try {
            InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
            //2.通过SqlSessionFactoryBuilder对象来读取配置文件,构建出SqlSessionFactory对象
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);

            //每个SqlSessionFactory对象都用该对应一个数据库
            //作用:用来创建SqlSession对象
            //SqlSession提供的一些DB基本CRUD操作
            //它是线程非安全的
            SqlSession sqlSession = sqlSessionFactory.openSession();
            System.out.println(sqlSession);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
