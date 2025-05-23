package com.votingapp.votingapp.models;


import jakarta.persistence.Embeddable;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Embeddable
public class OptionVote {
    private String optionText;
    private Long voteCount = 0L;


    public String getOptionText() {
        return optionText;
    }

    public void setOptionText(String optionText) {
        this.optionText = optionText;
    }

    public Long getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(Long voteCount) {
        this.voteCount = voteCount;
    }
}
