package piomz;

import java.util.HashMap;
import java.util.Map;

public class WinStatistics implements Statistics {
    private Map<String, Integer> stats = new HashMap<>();
    public void print(){
        System.out.println("TABELA WYNIKÓW");
        stats.forEach( (nazwa, wynik) -> System.out.printf("%s - %d\n", nazwa, wynik));
    }
    public void winner(Player player){
        Integer score = stats.getOrDefault(player.getName(), 0);
        stats.put(player.getName(), score+1);
    }
    public void clear(){
        stats.clear();
    }
}
