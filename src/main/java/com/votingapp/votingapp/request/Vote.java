package com.votingapp.votingapp.request;


import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Vote {
    public Long getPollId() {
        return pollId;
    }

    public void setPollId(Long pollId) {
        this.pollId = pollId;
    }

    public int getOptionIndex() {
        return optionIndex;
    }

    public void setOptionIndex(int optionIndex) {
        this.optionIndex = optionIndex;
    }

    private Long pollId;
    private int optionIndex;

}
