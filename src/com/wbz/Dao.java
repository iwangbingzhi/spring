package com.wbz;

import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created by 王炳智 on 2017/8/24.
 */
//这里也是dao层
public class Dao {


    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    private JdbcTemplate jdbcTemplate;
//王力宏少1000的操作
    public void addmoney(){
        String sql = "update bank set money=money-? where username=?";
        jdbcTemplate.update(sql,1000,"王力宏");

    }
    //周杰伦多1000的操作
    public void minmoney(){
        String sql = "update bank set money=money+? where username=?";
        jdbcTemplate.update(sql,1000,"周杰伦");
    }
}
