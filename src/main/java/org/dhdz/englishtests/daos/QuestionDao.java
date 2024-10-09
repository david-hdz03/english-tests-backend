package org.dhdz.englishtests.daos;

import org.dhdz.englishtests.pojos.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class QuestionDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Question> findByTopicId(Long topicId) {
        String sql = "SELECT * FROM questions WHERE id_topic = ?";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Question.class), topicId);
    }

    // ... otros métodos para Question
}
