package com.study.service;

import com.study.model.T1;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.sql.Types;

public class T1ServiceImpl implements T1Service {

    private JdbcTemplate jdbcTemplate;

   public void setDataSource(DataSource dataSource) {
       jdbcTemplate = new JdbcTemplate(dataSource);
   }

    @Transactional(rollbackFor = Exception.class)
    public void save(T1 t1) {
        jdbcTemplate.update("insert into  test.t1 (id, name) values (?,?)",
                new Object[]{t1.getId(), t1.getName()}, new int[]{Types.INTEGER, Types.VARCHAR});
    }
}
