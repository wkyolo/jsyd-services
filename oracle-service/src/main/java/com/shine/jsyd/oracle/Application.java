package com.shine.jsyd.oracle;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.shine.jsyd.oracle.service.SoccerService;
@SpringBootApplication
public class Application implements CommandLineRunner{
    @Autowired
    SoccerService soccerService;
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    public void run(String... arg0) throws Exception {
        soccerService.addBarcelonaPlayer("Xavi Hernandez", "Midfielder", 6);
        List<String> players = soccerService.getAllTeamPlayers(1);
        for(String player : players)
        {
            System.out.println("Introducing Barca player => " + player);
        }
    }
}
