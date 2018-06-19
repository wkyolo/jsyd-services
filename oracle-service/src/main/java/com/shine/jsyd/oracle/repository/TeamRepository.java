package com.shine.jsyd.oracle.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.shine.jsyd.oracle.model.Team;
@Repository
public interface TeamRepository extends CrudRepository<Team, Long> {
    Team findByPlayers(long playerId);
}