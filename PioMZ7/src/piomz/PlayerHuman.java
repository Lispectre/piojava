package piomz;

import java.util.Scanner;

public class PlayerHuman extends Player {
    private final Scanner klaw = new Scanner(System.in);
    PlayerHuman(){}
    PlayerHuman(String name){
        super(name);
    }
    public int guess(){
        System.out.print("Podaj liczbę od 1 do 6: ");
        return klaw.nextInt();
    }
}
