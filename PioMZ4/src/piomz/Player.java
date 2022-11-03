
package piomz;

import java.util.Random;

abstract public class Player {
    private String name = "Gracz";
    
    public Player(){}
    
    public Player(String name){
        setName(name);
        
    }
    
    public final void setName(String name){
        if (name == null || !name.matches("^[\\d\\w_.\\-]{3,}$")) {
            throw new IllegalArgumentException("Błędne imie!");
        }
        else this.name = name;
    }
    public String getName(){
        return name;
    }
    abstract public int guess();
}
