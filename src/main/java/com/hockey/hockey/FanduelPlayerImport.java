/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hockey.hockey;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author James
 */
public class FanduelPlayerImport {
  
    public List<Player> ImportFanduelPlayers() {
            List<Player> players = readPlayersFromCSV("C:\\\\HockeyInfo\\FanDuelPlayers\\FanDuelPlayers.csv");
 
            return players;
        }
        
        public List<Player> readPlayersFromCSV(String fileName) {
            List<Player> players = new ArrayList<>();
            Path pathToFile = Paths.get(fileName);
            
            try(BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.US_ASCII)) {
                String line = br.readLine();
                
                while(line != null) {
                    String[] playerAttributes = line.split(",");
                    
                    if(playerAttributes[0].equals("Id") || playerAttributes[5].equals("")){
                        
                    }else {
                        Player player = createPlayer(playerAttributes);
                        
                        players.add(player);
                    }

                    line = br.readLine();
                    
                }
                
            }catch (IOException ioe) {
                ioe.printStackTrace();
            }
            
            
            return players;
        }

        public Player createPlayer(String[] playerAttributes) {
            return new Player(playerAttributes[3], Integer.parseInt(playerAttributes[7]), Double.parseDouble(playerAttributes[5]), 0.00, playerAttributes[1], playerAttributes[10], playerAttributes[9]);
        }
    
}
