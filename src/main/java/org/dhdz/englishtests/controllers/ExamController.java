package org.dhdz.englishtests.controllers;

import org.dhdz.englishtests.daos.AnswerDao;
import org.dhdz.englishtests.daos.QuestionDao;
import org.dhdz.englishtests.daos.TopicDao;
import org.dhdz.englishtests.pojos.Answer;
import org.dhdz.englishtests.pojos.Question;
import org.dhdz.englishtests.pojos.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ExamController {
    @Autowired
    private TopicDao topicDao;

    @Autowired
    private QuestionDao questionDao;
    @Autowired
    private AnswerDao answerDao;

    @GetMapping("/topics")
    public List<Topic> getAllTopics() {
        return topicDao.getAllTopics();
    }

    @GetMapping("/topics/{topicId}/questions")
    public List<Question> getQuestionsByTopic(@PathVariable Long topicId) {
        return questionDao.findByTopicId(topicId);
    }

    @GetMapping("/topics/{topicId}/answers")
    public List<Answer> getAnswersByTopic(@PathVariable Long topicId) {
        return answerDao.getAnswersByTopic(topicId);
    }
}
