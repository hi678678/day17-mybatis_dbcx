package com.chinasoft.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MyabtisUtils {
    private  static SqlSessionFactory sqlSessionFactory;

    static {
        try {
            InputStream inputStream = Resources.getResourceAsStream("MybatisConfig.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
           e.printStackTrace();
        }
    }

    public  static SqlSession openSession(){
        if (sqlSessionFactory!=null){
            return sqlSessionFactory.openSession(true);
        }
        return  null;
    }
}
