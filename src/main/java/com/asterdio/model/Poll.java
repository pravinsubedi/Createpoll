package com.asterdio.model;

import java.util.List;

/**
 * Created by Admin on 12/27/2016.
 */
public class Poll {
    private int pollId;
    private String poll;
    private List<Option> options;

    public int getPollId() {
        return pollId;
    }

    public void setPollId(int polId) {
        this.pollId = polId;
    }

    public String getPoll() {
        return poll;
    }

    public void setPoll(String poll) {
        this.poll = poll;
    }

    public Poll() {

    }

    public Poll(int polId, String poll) {
        this.pollId = polId;
        this.poll = poll;
    }
}
