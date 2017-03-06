
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
        for (int i = 0; i < 8; i++) {
            fighters.add(new Fighter("Fighter #" + i));

        }
        Random random = new Random();

        for (int i = 0; i < 8; i++) {
            arena = new Arena(fighters.pop(), fighters.pop());
            fighterstwo.addAll(arena.fighterLinkedList);
            if(fighterstwo.size()==4){
                for (int j = 0; j <8 ; j++) {

                    arena= new Arena(fighterstwo.pop(),fighterstwo.pop());
                    if (fighterstwo.size()==2){
                        for (int k = 0; k <1 ; k++) {
                            arena= new Arena(fighterstwo.pop(),fighterstwo.pop());
                        }
                    }
                }

            }

        }
      //  System.out.println(fighterstwo.size());
      //  arena= new Arena(fighterstwo.pop(),fighterstwo.pop());
     //   for (int i = 0; i < 5; i++) {


            // LinkedList<Arena> arenas=new LinkedList<Arena>();
            // arena = new Arena(fighters.pop(), fighters.pop());
            //


       // }
    }
}

