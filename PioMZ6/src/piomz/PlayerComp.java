package piomz;

import java.util.Random;


public class PlayerComp extends Player {
    private final Random ran = new Random();
    public PlayerComp(){}
    public PlayerComp(String name){
        super(name);
    }
    public int guess(){
        return ran.nextInt(6)+1;
    }
}
