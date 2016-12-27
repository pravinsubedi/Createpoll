package com.asterdio.model;

/**
 * Created by Admin on 12/27/2016.
 */
public class Vote {

    private int voteId;
    private String value;
    private Option option;

    public int getVoteId() {
        return voteId;
    }

    public void setVoteId(int voteId) {
        this.voteId = voteId;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Vote() {

    }

    public Vote(int voteId, String value) {
        this.voteId = voteId;
        this.value = value;
    }
}
