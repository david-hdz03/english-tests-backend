package org.dhdz.englishtests.pojos;

public class Answer {
    private Long id;
    private Long id_question; // ID de la pregunta a la que pertenece la respuesta
    private String answer;
    private boolean is_correct;

    public Answer() {

    }

    public Answer(Long id, Long id_question, String answer, boolean is_correct) {
        this.id = id;
        this.id_question = id_question;
        this.answer = answer;
        this.is_correct = is_correct;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getid_question() {
        return id_question;
    }

    public void setid_question(Long id_question) {
        this.id_question = id_question;
    }

    public String getanswer() {
        return answer;
    }

    public void setanswer(String answer) {
        this.answer = answer;
    }

    public boolean is_correct() {
        return is_correct;
    }

    public void setCorrect(boolean correct) {
        is_correct = correct;
    }
}
