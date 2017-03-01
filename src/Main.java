import javafx.util.Pair;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

/**
 * Created by wp-1-09 on 01.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        LinkedList<Fighter> fighters = new LinkedList<Fighter>();
        LinkedList<Integer> raund = new LinkedList<Integer>();
        Random random = new Random();

        for (int i = 0; i <10 ; i++) {
          fighters.add(new Fighter("Fighter #"+i));
        }

        Pair<Fighter, Fighter> pair = new Pair<Fighter, Fighter>();

    }
}
