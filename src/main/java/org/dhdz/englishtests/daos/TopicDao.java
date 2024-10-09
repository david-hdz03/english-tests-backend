package org.dhdz.englishtests.daos;

import org.dhdz.englishtests.pojos.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TopicDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Topic> getAllTopics() {
        String sql = "SELECT * FROM topics";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<Topic>(Topic.class));
    }
}
