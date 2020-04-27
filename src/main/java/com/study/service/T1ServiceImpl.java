package com.study.service;

import com.study.model.T1;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.sql.Types;

public class T1ServiceImpl implements T1Service {

    private String str = "cdsce";

    private JdbcTemplate jdbcTemplate;

   public void setDataSource(DataSource dataSource) {
       jdbcTemplate = new JdbcTemplate(dataSource);
   }

    @Transactional(rollbackFor = Exception.class)
    public void save(T1 t1) {
        jdbcTemplate.update("insert into  test.t1 (id, name) values (?,?)",
                new Object[]{t1.getId(), t1.getName()}, new int[]{Types.INTEGER, Types.VARCHAR});
    }

    private int stackLength = 1;

    public void stackLeak() {
        stackLength++;
        stackLeak();
    }

    public static void main(String[] args) throws Throwable{
        T1ServiceImpl t1Service = new T1ServiceImpl();
        try {
            t1Service.stackLeak();
        } catch (Exception e) {
            System.out.println(e.toString());
            throw  e;
        }
    }
}
