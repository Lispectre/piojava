package piomz;


public class PioMZ {

    public static void main(String[] args) {
        
        Game game = new Game();
        for (int i = 0; i<20; i++){
            game.addPlayer(new PlayerComp("Gracz"));
        }
        for (int i = 0; i<100; i++) game.play();
        game.printStats();
    }
    
}
