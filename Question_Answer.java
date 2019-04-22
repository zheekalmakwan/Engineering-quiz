package com_.example.mkwan.engineeringquiz;

public class Question_Answer {
    private String question;
    private String firstAnswer;
    private String secondAnswer;
    private String thirdAnswer;
    private String fourthAnswer;

    public Question_Answer(String question,String firstAnswer,String secondAnswer,String thirdAnswer,String fourthAnswer){
        this.question=question;
        this.firstAnswer=firstAnswer;
        this.secondAnswer=secondAnswer;
        this.thirdAnswer=thirdAnswer;
        this.fourthAnswer=fourthAnswer;
    }

    public String getQuestion(){
        return question;
    }

    public String getFirstAnswer() {
        return firstAnswer;
    }

    public String getSecondAnswer() {
        return secondAnswer;
    }

    public String getThirdAnswer() {
        return thirdAnswer;
    }

    public String getFourthAnswer() {
        return fourthAnswer;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setFirstAnswer(String firstAnswer) {
        this.firstAnswer = firstAnswer;
    }

    public void setSecondAnswer(String secondAnswer) {
        this.secondAnswer = secondAnswer;
    }

    public void setThirdAnswer(String thirdAnswer) {
        this.thirdAnswer = thirdAnswer;
    }

    public void setFourthAnswer(String fourthAnswer) {
        this.fourthAnswer = fourthAnswer;
    }
}
