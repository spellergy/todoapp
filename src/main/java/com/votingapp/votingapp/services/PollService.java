package com.votingapp.votingapp.services;

import com.votingapp.votingapp.models.Poll;
import com.votingapp.votingapp.respositories.PollRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.votingapp.votingapp.models.OptionVote;

import java.util.List;
import java.util.Optional;

@Service
public class PollService {

    private final PollRepository pollRepository;

    public PollService(PollRepository pollRepository) {
        this.pollRepository = pollRepository;
    }

    public Poll createPoll(Poll poll) {
        return pollRepository.save(poll);
    }

    public List<Poll> getAllPolls() {
        return pollRepository.findAll();
    }

    public Optional<Poll> getPollById(Long id) {
        return pollRepository.findById(id);

    }

    public void vote(Long pollId, int optionIndex){
        //get poll from db
        Poll poll = pollRepository.findById(pollId)
                .orElseThrow(()-> new RuntimeException("Poll not Found"));

        //get all options
        List<OptionVote> options = poll.getOptions();

        //if index for vote isnt valid throw error
        if (optionIndex<0 || optionIndex >= options.size()) {
            throw new IllegalArgumentException("Invalid Option Index");
        }

        //get selected option
        OptionVote selectedOption = options.get(optionIndex);

        //increment vote for selected option
        selectedOption.setVoteCount(selectedOption.getVoteCount()+1);

        //save incremented option into the database
        pollRepository.save(poll);
    }
}
