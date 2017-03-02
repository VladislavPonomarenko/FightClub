import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Created by wp-1-09 on 02.03.2017.
 */
public class Arena {
    Random random = new Random();

    Arena(Fighter fighter1, Fighter fighter2) {


        if (random.nextBoolean() == true) {
            System.out.println("GO fighter" + fighter1);

            do{
                Fighter1(fighter1, fighter2);
                Fighter2(fighter1, fighter2);

            }while (fighter2.getXp() != 0 && fighter2.getXp() > 0 && fighter1.getXp() != 0 && fighter1.getXp() > 0);
            if (fighter2.getXp() == 0 || fighter2.getXp() < 0) {
                fighter2.setXp(0);
                System.out.println(fighter2.getName() + ": " + fighter2.getXp() + "xp");
                System.out.println("Win " + fighter1.getName());
            }else{
                fighter1.setXp(0);
                System.out.println(fighter1.getName() + ": " + fighter1.getXp() + "xp");
                System.out.println("Win " + fighter2.getName());
            }

        } else {
            System.out.println("GO fighter" + fighter2);

           do{

            Fighter2(fighter1, fighter2);
            Fighter1(fighter1, fighter2);
        } while (fighter2.getXp() != 0 && fighter2.getXp() > 0 && fighter1.getXp() != 0 && fighter1.getXp() > 0);
                if (fighter1.getXp() == 0 || fighter1.getXp() < 0) {
                    fighter1.setXp(0);
                    System.out.println(fighter1.getName() + ": " + fighter1.getXp() + "xp");
                    System.out.println("Win " + fighter2.getName());
                }else{
                    fighter2.setXp(0);
                    System.out.println(fighter2.getName() + ": " + fighter2.getXp() + "xp");
                    System.out.println("Win " + fighter1.getName());
                }
        }
    }

    public void Fighter1(Fighter fighter1, Fighter fighter2) {
        Random random = new Random();
        int cnt = fighter2.getXp();
        if (cnt != 0 && cnt > 0) {
            fighter2.setXp(fighter2.getXp() - fighter1.getForse());
            System.out.println(fighter2.getName() + ": " + fighter2.getXp() + "xp" + "(-" + (cnt - fighter2.getXp()) + ")");
            fighter1.setForse(random.nextInt(30) + 1);
        }
        cnt = fighter2.getXp();

    }

    public void Fighter2(Fighter fighter1, Fighter fighter2) {
        Random random = new Random();
        int cnt = fighter1.getXp();
        if (cnt != 0 && cnt > 0) {
            fighter1.setXp(fighter1.getXp() - fighter2.getForse());
            System.out.println(fighter1.getName() + ": " + fighter1.getXp() + "xp" + "(-" + (cnt - fighter1.getXp()) + ")");
            fighter2.setForse(random.nextInt(29) + 2);
        }
        cnt = fighter1.getXp();
    }

}
