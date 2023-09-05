package com.chinasoft.test;

import com.chinasoft.mapper.DeptMapper;
import com.chinasoft.mapper.EmpMapper;
import com.chinasoft.mapper.RoleMapper;
import com.chinasoft.mapper.UserMapper;
import com.chinasoft.utils.MyabtisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

public class MyTest {
    //拿到会话对象
    SqlSession sqlSession = MyabtisUtils.openSession();
    //获取mapper对象
    EmpMapper empMapper = sqlSession.getMapper(EmpMapper.class);

    @Test
    public void testFindAll() throws Exception {
        empMapper.findAll().forEach(System.out::println);
    }

    /**
     * 一对多
     * @throws Exception
     */
    @Test
    public void testFindDept() throws Exception {
        sqlSession.getMapper(DeptMapper.class).findAll().forEach(System.out::println);
    }

    /**
     * 多对多
     * @throws Exception
     */
    @Test
    public void testFindAllUsers() throws Exception {
        sqlSession.getMapper(UserMapper.class).findAllUsers().forEach(System.out::println);
    }

    @Test
    public void testFindAllRoles() throws Exception {
        sqlSession.getMapper(RoleMapper.class).findAllRoles().forEach(System.out::println);
    }
}
