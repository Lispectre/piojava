
package piomz;

import java.util.Random;

public class Player {
    private String name = "Gracz";
    private Random ran = new Random();
    
    public Player(){}
    
    public Player(String name){
        setName(name); // Regex: ^[\d\w_.\-]{3,}$
        
    }
    
    public void setName(String name){
        if (name == null || !name.matches("^[\\d\\w_.\\-]{3,}$")) {
            System.err.println("Bledne imie!");
        }
        else this.name = name;
    }
    public String getName(){
        return name;
    }
    public int guess(){
        return ran.nextInt(6)+1;
    }
}
