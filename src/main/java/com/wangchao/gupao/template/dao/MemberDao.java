package com.wangchao.gupao.template.dao;

import com.wangchao.gupao.template.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.util.List;

public class MemberDao extends JdbcTemplate {
    public MemberDao(DataSource dataSource) {
        super(dataSource);
    }

    public Object processResult(ResultSet rs, int rowNum) {
        return null;
    }
}
