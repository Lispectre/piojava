
package piomz;

import java.util.Random;

public class Player {
    private String name = "No name";
    private Random ran = new Random();
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public int guess(){
        return ran.nextInt(6)+1;
    }
}
