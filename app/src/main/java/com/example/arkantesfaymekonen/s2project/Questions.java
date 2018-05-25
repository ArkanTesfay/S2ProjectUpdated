package com.example.arkantesfaymekonen.s2project;

/**
 * Created by Arkan Tesfay Mekonen on 5/24/2018.
 */

public class Questions
{
    private String question;
    private boolean trueOrfalse;
    private int id;
    private String answer;

    public Questions(String question, boolean trueOrfalse, int id, String answer) {
        this.question = question;
        this.trueOrfalse = trueOrfalse;
        this.id = id;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public boolean isTrueOrfalse() {
        return trueOrfalse;
    }

    public int getId() {
        return id;
    }

    public String getAnswer() {
        return answer;
    }
}
