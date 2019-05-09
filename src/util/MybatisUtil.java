package util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Description: java类作用描述:mybatis工具类
 * @Author: tyg
 * @CreateDate: 2019/5/9 0009
 * @Version: 1.0
 */
public class MybatisUtil {
    private static SqlSessionFactory sqlSessionFactory;

    //利用静态代码快进行初始化
    static {
        InputStream in = null;
        try {
            in = Resources.getResourceAsStream("mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取一个SqlSession对象
     *
     * @return
     */
    public static SqlSession getSession() {
        return sqlSessionFactory.openSession();
    }


    /**
     * 释放资源
     *
     * @param sqlSession
     */
    public static void closeSession(SqlSession sqlSession) {
        if (null != sqlSession) {
            sqlSession.close();
        }
    }
}
