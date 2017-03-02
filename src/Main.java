
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Created by wp-1-09 on 01.03.2017.
 */
public class Main {

    public static void main(String[] args) {
        LinkedList<Fighter> fighters = new LinkedList<Fighter>();
        Arena arena;
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            fighters.add(new Fighter("Fighter #" + i));
        }

        arena = new Arena(fighters.pop(), fighters.pop());

    }
}
