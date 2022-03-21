package com.hockey.hockey;

import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HockeyApplication {

	public static void main(String[] args) {
                //High levels goals 
		SpringApplication.run(HockeyApplication.class, args);
                System.out.println("ImportFanduelPlayers");
                
                FanduelPlayerImport fanduel = new FanduelPlayerImport();
                List<Player> players = fanduel.ImportFanduelPlayers();

                for(Player player : players) {
                   System.out.println(player);
                }
	}
}
