package com.shine.jsyd.oracle.repository;


import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.shine.jsyd.oracle.model.Player;

@Repository
public interface PlayerRepository extends CrudRepository<Player, Long> {
    List<Player> findByTeamId(long teamId);
}