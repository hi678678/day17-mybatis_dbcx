package com.chinasoft.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
    private int  id;
    private String username;
    private Date birthday;
    private String sex;
    private String address;
    //一个用户可以是多个角色
    private List<Role> roles;
}
