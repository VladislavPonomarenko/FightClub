
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

        Random random = new Random();

        for (int i = 0; i <10 ; i++) {
          fighters.add(new Fighter("Fighter #"+i));
        }
        Arena arena = new Arena(fighters.pop(), fighters.pop());


//        Run(fighters,fighters1);

      //  Pair<Fighter, Fighter> pair = new Pair<Fighter, Fighter>();





    }
//  public  static void  Run(LinkedList<Fighter> fighter1, List<Fighter> fighter2){
//        System.out.println(fighter1+"\n");
//        System.out.println(fighter2+"\n\n");
//    }

}
