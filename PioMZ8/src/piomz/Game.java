package piomz;

import java.util.Random;
import java.util.ArrayList;

public class Game {
    private Statistics statistics;
    private Random rand = new Random();
    private ArrayList<Player> players = new ArrayList();
    
    public Game(){
        this(null);
    }
    
    public Game(Statistics stats){
        this.statistics = stats == null ? new NullStatistics() : stats;
    }
    
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
                    statistics.winner(plr);
                    end = true;
                }
            }
        } while (!end);
    }
    public void printPlayers(){
        for (Player plr : players){
            System.out.println(plr.getName());
        }
    }
    public void removePlayer(String name){
        for (Player plr : players){
            if (plr.getName().equals(name)){
                players.remove(plr);
                break;
            }
        }
    }
    public void printStats(){
        statistics.print();
    }
    public void clearStats(){
        statistics.clear();
    }
    
}
