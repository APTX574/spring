package com;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;



    @Override
    public void addUser(User user) {
        String sql = "Insert Into people value (?,?,?)";
        jdbcTemplate.update(sql, user.getName(), user.getId(), user.getPrice());
    }



}
