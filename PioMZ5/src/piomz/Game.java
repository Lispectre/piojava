package piomz;

import java.util.Random;

public class Game {
    private Player[] plrs = new Player[3];

    public void addPlayer(Player plr){
        this.plrs[0] = plr;
    }
    public void play(){
        Random rand = new Random();     //obiekt losujący
        int number;                     //wylosowana liczba
        int guess;                      //propozycja (strzał) gracza
        // Player plr = new PlayerComp("Ziutek");

        do {
            System.out.println("---------------------");

            number = rand.nextInt(6) + 1;
            System.out.println("Kostka: " + number);

            guess = plrs[0].guess();
            System.out.printf("%s: %d\n", plrs[0].getName(), guess);

            if (number != guess) {
                System.out.println("PUDŁO!");
            }
            else {
                System.out.println("BRAWO!");
            }

        } while (number != guess);
    }
}
