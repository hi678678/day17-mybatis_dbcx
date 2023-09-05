package com.chinasoft.mapper;

import com.chinasoft.domain.Emp;

import java.util.List;

public interface EmpMapper {
    /**
     * 一个员工对应一个部门
     * 一次查询查出员工的所有信息
     * @return
     */
    List<Emp> findAll();
}
