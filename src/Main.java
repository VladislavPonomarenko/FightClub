import java.util.LinkedList;
import java.util.Random;

/**
 * Created by wp-1-09 on 01.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        LinkedList<Fighter> fighters = new LinkedList<Fighter>();
        Random random = new Random();

        for (int i = 0; i <1 ; i++) {
          fighters.add(new Fighter("Fighter #"+i));
        }

    }
}
