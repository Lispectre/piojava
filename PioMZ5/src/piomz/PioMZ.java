package piomz;


import java.util.ArrayList;
import java.util.Iterator;

public class PioMZ {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        list.add("Test");
        list.add("test 2");
        list.add("teeeest3");
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        //        Game game = new Game();
//        game.addPlayer(new PlayerComp());
//        game.play();
    }
    
}
