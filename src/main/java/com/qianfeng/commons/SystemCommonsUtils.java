package com.qianfeng.commons;

import org.apache.ibatis.io.Resources;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by 任泽雄 on 2019/3/28.
 */
public class SystemCommonsUtils {

   public static  SqlSessionFactory sqlSessionFactory;

   private  static  ThreadLocal<SqlSession> threadLocal=new ThreadLocal();
    static {
        into();
    }
    public static void into(){
        try {
            InputStream resourceAsStream = Resources.getResourceAsStream("mybatis.cfg.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static  SqlSessionFactory  getsessionFactory(){
        if(sqlSessionFactory==null){
             into();
        }
        return sqlSessionFactory;
    }

    public static SqlSession getSqlsession(){
        SqlSession sqlSession = threadLocal.get();
        if (sqlSession==null){
            sqlSession = sqlSessionFactory.openSession();
            threadLocal.set(sqlSession);
        }
        return sqlSession;
    }
}
