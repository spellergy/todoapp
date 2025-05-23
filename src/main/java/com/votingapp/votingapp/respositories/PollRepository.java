package com.votingapp.votingapp.respositories;

import com.votingapp.votingapp.models.Poll;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PollRepository extends JpaRepository<Poll,Long> {
}
