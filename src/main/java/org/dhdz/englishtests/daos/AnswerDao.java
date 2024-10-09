package org.dhdz.englishtests.daos;

import org.dhdz.englishtests.classes.AnswerRowMapper;
import org.dhdz.englishtests.pojos.Answer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AnswerDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Answer> getAnswersByTopic(long topicId){
        String sql = "SELECT a.* FROM answers a JOIN questions q ON a.id_question = q.id JOIN topics t ON q.id_topic = t.id WHERE t.id = ?";
        return jdbcTemplate.query(sql, new AnswerRowMapper(), topicId);
    }
}
