package piomz;

import java.util.HashMap;
import java.util.Map;

public class Statistics {
    private Map<String, Integer> stats = new HashMap<>();
    void print(){
        System.out.println("TABELA WYNIKÓW");
        stats.forEach( (String, Integer) -> System.out.printf("%s - %d\n", String, Integer));
    }
    void winner(Player player){
        Integer score = stats.getOrDefault(player.getName(), 0);
        stats.put(player.getName(), score+1);
    }
    void clear(){
        stats.clear();
    }
}
