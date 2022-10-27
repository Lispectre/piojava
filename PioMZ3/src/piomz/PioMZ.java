package piomz;

import java.util.Random;

public class PioMZ {

    public static void main(String[] args) {
        Random rand = new Random();     //obiekt losujący
        int number;                     //wylosowana liczba
        int guess;                      //propozycja (strzał) gracza
        Player plr = new PlayerHuman();
        
        do {
            System.out.println("---------------------");

            number = rand.nextInt(6) + 1;
            System.out.println("Kostka: " + number);

            guess = plr.guess();
            System.out.printf("%s: %d\n", plr.getName(), guess);

            if (number != guess) {
                System.out.println("PUDŁO!");
            }
            else {
                System.out.println("BRAWO!");
            }

        } while (number != guess);
    }
    
}
