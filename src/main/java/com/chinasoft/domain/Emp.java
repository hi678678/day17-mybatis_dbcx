package com.chinasoft.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Emp {
    private Integer id;
    private  String name;
    private Integer age;
    private String addr;
    private  Double salary;
    //一个员工属于一个部门
    private Dept dept;
}
