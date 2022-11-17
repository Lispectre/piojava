package piomz;


public class PioMZ {

    public static void main(String[] args) {
        Game game = new Game();
        for (int i = 0; i<10000; i++){
            game.addPlayer(new PlayerComp("Gracz"));
        }
        game.play();
    }
    
}
