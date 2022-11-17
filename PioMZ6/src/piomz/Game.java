package piomz;

import java.util.Random;
import java.util.ArrayList;

public class Game {
    Random rand = new Random();
    ArrayList<Player> players = new ArrayList();
    public void addPlayer(Player plr){
        for (Player otherPlayers : players){
            boolean check = true;
            while (otherPlayers.getName().equals(plr.getName()) && check){
                plr.setName(plr.getName() + Integer.toString(rand.nextInt(10)));
                check = false;
            }
        }
        this.players.add(plr);
        
    }
    public void play(){
        int number;                     //wylosowana liczba
        int guess;                      //propozycja (strzał) gracza
        boolean end = false;
        do {
            System.out.println("--------------------");
            number = rand.nextInt(6) + 1;
            System.out.println("Kostka: " + number);
            for (Player plr : players){
                guess = plr.guess();
                System.out.printf("%s: %d\n", plr.getName(), guess);

                if (number != guess) {
                    System.out.println("PUDŁO!");
                }
                else {
                    System.out.println("BRAWO!");
                    end = true;
                }
            }
        } while (!end);
    }
}
