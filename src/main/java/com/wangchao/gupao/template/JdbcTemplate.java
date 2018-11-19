package com.wangchao.gupao.template;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public abstract class JdbcTemplate {

    private DataSource dataSource;

    public JdbcTemplate(DataSource dataSource){
        this.dataSource = dataSource;
    }

    public List<?> executeQuery(String sql,Object[] values){
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
       try {
           connection = dataSource.getConnection();
           preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();

            List<Object> list = new ArrayList<Object>();
            int rowNum = 1;
            while (resultSet.next()){
                list.add(processResult(resultSet,rowNum ++));
            }

           resultSet.close();
           preparedStatement.close();
           connection.close();
       }catch (Exception e){
           e.printStackTrace();
       }finally {
           try {
               resultSet.close();
               preparedStatement.close();
               connection.close();
           } catch (SQLException e) {
               e.printStackTrace();
           }
       }

        return null;
    }

    public abstract Object processResult(ResultSet rs,int rowNum);
}
