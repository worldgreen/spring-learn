package com.study.dao;

import com.study.model.T1;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRowMapper implements RowMapper {
    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
        T1 t1 = new T1();
        t1.setId(rs.getInt("id"));
        t1.setName(rs.getString("name"));
        return t1;
    }
}
