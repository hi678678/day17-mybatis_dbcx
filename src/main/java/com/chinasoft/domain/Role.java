package com.chinasoft.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Role {
    private int  roleId;
    private String role_name;
    private String role_desc;
    //一个角色对应多个用户
    private List<User> users;
}
