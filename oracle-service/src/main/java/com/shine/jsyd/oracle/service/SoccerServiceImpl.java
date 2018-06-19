package com.shine.jsyd.oracle.service;

import java.util.ArrayList;
import java.util.List;

import com.shine.jsyd.oracle.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.shine.jsyd.oracle.model.Player;
import com.shine.jsyd.oracle.model.Team;
import com.shine.jsyd.oracle.repository.PlayerRepository;
import com.shine.jsyd.oracle.repository.TeamRepository;

@Service
public class SoccerServiceImpl implements SoccerService {
    @Autowired
    private PlayerRepository playerRepository;
    @Autowired
    private TeamRepository teamRepository;
    public List<String> getAllTeamPlayers(long teamId) {
        List<String> result = new ArrayList<String>();
        List<Player> players = playerRepository.findByTeamId(teamId);
        for (Player player : players) {
            result.add(player.getName());
        }
        return result;
    }
    public void addBarcelonaPlayer(String name, String position, int number) {
        Team barcelona = teamRepository.findOne(1l);
        Player newPlayer = new Player();
        newPlayer.setName(name);
        newPlayer.setPosition(position);
        newPlayer.setNum(number);
        newPlayer.setTeam(barcelona);
        playerRepository.save(newPlayer);
    }
}