package com.baizhi.entity;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;
import tk.mybatis.mapper.code.ORDER;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "ssm_user")
@Data
public class User {

    @Id
    @KeySql(sql = "select seq_ssmuser.nextval from dual", order = ORDER.BEFORE)
    private Integer id;
    private String name;
}
