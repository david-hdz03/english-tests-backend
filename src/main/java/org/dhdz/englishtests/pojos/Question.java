package org.dhdz.englishtests.pojos;

public class Question {
    private Long id;
    private Long id_topic; // ID del tema al que pertenece la pregunta
    private String question;

    public Question() {
    }

    public Question(Long id, Long id_topic, String question) {
        this.id = id;
        this.id_topic = id_topic;
        this.question = question;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getid_topic() {
        return id_topic;
    }

    public void setid_topic(Long id_topic) {
        this.id_topic = id_topic;
    }

    public String getquestion() {
        return question;
    }

    public void setquestion(String question) {
        this.question = question;
    }
}
