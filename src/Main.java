
import java.util.LinkedList;
import java.util.Random;

/**
 * Created by wp-1-09 on 01.03.2017.
 */
public class Main {

    public static void main(String[] args) {

        Arena arena;
        LinkedList<Fighter> fighters = new LinkedList<Fighter>();
        LinkedList<Fighter> fighterstwo = new LinkedList<Fighter>();
        for (int i = 0; i < 14; i++) {
            fighters.add(new Fighter("Fighter #" + i));

        }
        Random random = new Random();

        do {
            arena = new Arena(fighters.pop(), fighters.pop());
            fighterstwo.addAll(arena.fighterLinkedList);
            if (fighterstwo.size()==7){
            do {
                arena= new Arena(fighterstwo.pop(),fighterstwo.pop());
                fighterstwo.addAll(arena.fighterLinkedList);
            }while (fighterstwo.size()!=0);}
        }while (true);

    }
}

