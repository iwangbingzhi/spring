package cn.tx.anno;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by 王炳智 on 2017/8/25.
 */
@Transactional
public class Dao {
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    private JdbcTemplate jdbcTemplate;
    public void addmoney(){
        String sql = "update bank set money=money+? where username=?";
        jdbcTemplate.update(sql,1000,"王力宏");
    }
    public void minmoney(){
        String sql = "update bank set money=money-? where username=?";
        jdbcTemplate.update(sql,1000,"周杰伦");
    }
}
