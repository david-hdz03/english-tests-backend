package org.dhdz.englishtests.classes;

import org.dhdz.englishtests.pojos.Answer;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AnswerRowMapper implements RowMapper<Answer> {

    @Override
    public Answer mapRow(ResultSet rs, int rowNum)  throws SQLException {
        Answer answer = new Answer();
        answer.setId(rs.getLong("id"));
        answer.setid_question(rs.getLong("id_question"));
        answer.setanswer(rs.getString("answer"));
        answer.setCorrect(rs.getInt("is_correct") == 1); // Convertir 1/0 a true/false
        return answer;
    }
}