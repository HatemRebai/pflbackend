package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.Vote;


@Repository("voterepository")
public interface VoteRepository extends JpaRepository<Vote, Integer> {

}
